package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Model.Category;
import com.example.librarymanagementsystem.Model.Member;
import com.example.librarymanagementsystem.Repository.UsersRepository;
import com.example.librarymanagementsystem.Service.CategoryService;
import com.example.librarymanagementsystem.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/get Member",method = RequestMethod.GET)
    public ResponseEntity<Object> getCategory(){
        return new ResponseEntity<>(memberService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/addMember",method = RequestMethod.POST)
    public ResponseEntity<Object> addMember (@RequestBody Member member){
        member.setJoiningDate(new Date());
        memberService.saveMember(member);
        return new ResponseEntity<>("Success",HttpStatus.OK);

    }
    @RequestMapping(value = "/updateMember",method = RequestMethod.POST)
    public ResponseEntity<Object> updateMember (@RequestBody Member member){
        memberService.updateMember(member);
        return new ResponseEntity<>("Success",HttpStatus.OK);

    }
    @RequestMapping(value = "/deleteMember",method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteMember (@RequestBody Long aLong){
        memberService.deleteMember(aLong);
        return new ResponseEntity<>("Success",HttpStatus.OK);

    }
    @RequestMapping(value = "/Member",method = RequestMethod.GET)
    public ResponseEntity<Object> Member (){
        Member member = new Member();
        return new ResponseEntity<>(member,HttpStatus.OK);

    }
}

