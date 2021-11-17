package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.LoginService.UsersService;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String loginPage(UsersService usersService) {
        return "login/Login";
    }
}

