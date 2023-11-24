package com.neosoft.service;

import com.neosoft.dto.Policydto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value="PolicyService",url="http://localhost:8282")
public interface ApiClients {
    @GetMapping(value = "/policy/getPolicy/{id}")
    Policydto getPolicyById(@PathVariable("id") Integer id);

}