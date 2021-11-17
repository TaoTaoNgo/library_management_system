package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Model.Users;
import com.example.librarymanagementsystem.Repository.UsersRepository;
import com.example.librarymanagementsystem.LoginService.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterPage {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersService usersService;

    public RegisterPage() {
    }

    @GetMapping("/register")
    public String showRegisterPage(Users users){
        return "Login/Register";
    }

    @PostMapping("/register")
    public String showSuccessPage(Users users){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(users.getPassword());
        users.setPassword(encodedPassword);
//        usersRepository.save(users);
        Users users1 = usersService.addNew(users);
        return "Login/Register_Success";
    }

}
