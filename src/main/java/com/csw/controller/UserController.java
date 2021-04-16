package com.csw.controller;

import com.csw.entity.User;
import com.csw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(User user, HttpServletRequest request) {
        User uu = userService.queryBy(user.getName(), user.getPassword());
        if (uu != null) {
            request.getSession().setAttribute("user", uu);
            if (uu.getName().equals("admin")) {
                return "redirect:/back/main.jsp";
            } else {
                return "redirect:/studd/queryAll";
            }
        } else {
            return "redirect:/front/login.jsp?erroMsg=user or password error!!!";
        }

    }
}
