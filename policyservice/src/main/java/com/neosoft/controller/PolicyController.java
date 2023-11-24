package com.neosoft.controller;

import com.neosoft.model.Policy;
import com.neosoft.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @PostMapping("/savePolicy")
    public Policy savePolicy(@RequestBody Policy policy){
        Policy policies = policyService.savePolicy(policy);
        return policies;

    }
    @GetMapping("/getPolicy/{id}")
    public Policy getPolicy(@PathVariable("id") Integer id){
        Policy policiesids = policyService.getPolicy(id);
        return policiesids;
    }
}
