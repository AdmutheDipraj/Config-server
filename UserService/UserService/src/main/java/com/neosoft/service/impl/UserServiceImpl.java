package com.neosoft.service.impl;

import com.neosoft.dto.Policydto;
import com.neosoft.dto.Responcedto;
import com.neosoft.dto.Userdto;
import com.neosoft.exception.UserGlobalException;
import com.neosoft.model.User;
import com.neosoft.repository.UserRepository;
import com.neosoft.service.ApiClients;
import com.neosoft.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ApiClients apiClients;

    @Override
    public User saveUser(User user) {
        User users = userRepository.save(user);
        if (!isValidEmail(users.getEmail())) {
            throw new UserGlobalException("The Email Id does not contain @");
        }
        return users;
    }
    private boolean isValidEmail(String email) {
        return email != null && email.matches(".*@.*");
    }



    @Override
    public Responcedto getUserPolicy(Integer userid) {
        Responcedto responcedto =new Responcedto();
        User user=userRepository.findById(userid);
        Userdto userdto = mapToUser(user);
        Policydto policydto = apiClients.getPolicyById(user.getId());
       // Policydto policydto = policyresponce.getBody();

        //how to set the values
        responcedto.setUserdto(userdto);
        responcedto.setPolicydto(policydto);

        return responcedto;
    }

    private Userdto mapToUser(@NotNull User user) {
        //get the value from user and set into userdto
        Userdto userdto =new Userdto();
        userdto.setId(user.getId());
        userdto.setFirstname(user.getFirstName());
        userdto.setLastname(user.getLastName());
        userdto.setEmail(user.getEmail());
        return userdto;
    }


}
