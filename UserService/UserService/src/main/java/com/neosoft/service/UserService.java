package com.neosoft.service;

import com.neosoft.dto.Responcedto;
import com.neosoft.model.User;

public interface UserService {

    public User saveUser(User user);

    public Responcedto getUserPolicy(Integer userid);

}
