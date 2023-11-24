package com.neosoft.controller;

import com.neosoft.dto.Responcedto;
import com.neosoft.model.User;
import com.neosoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        User users = userService.saveUser(user);
        return users;
    }
    @GetMapping("/getUser/{id}")
    public Responcedto getUser(@PathVariable("id") Integer id){
        Responcedto userdtos = userService.getUserPolicy(id);
        return userdtos;
    }


}
