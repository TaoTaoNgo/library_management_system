package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.Model.Member;
import com.example.librarymanagementsystem.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Long getTotalCount(){
        return memberRepository.count();
    }
    public List getAll(){
        return memberRepository.findAll();
    }
    public Member getById(Long id){
        return memberRepository.findById(id).get();
    }
    public void saveMember(Member member){
        memberRepository.save(member);
    }
    public void updateMember(Member member){
        Optional<Member> member1 = memberRepository.findById(member.getId());
        if (member1.isPresent()){
            memberRepository.delete(member1.get());
            memberRepository.save(member);
        }
    }
    public void deleteMember(Long id){
        Optional<Member> member = memberRepository.findById(id);
        if(member.isPresent())
            memberRepository.delete(member.get());
    }
}
