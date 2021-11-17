package com.example.librarymanagementsystem.LoginService;

import com.example.librarymanagementsystem.LoginService.UserPrincipal;
import com.example.librarymanagementsystem.Model.Users;
import com.example.librarymanagementsystem.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepository.findByUsername(username);
        if (users == null) throw new UsernameNotFoundException("User Not Found");
        return new UserPrincipal(users);
    }

}