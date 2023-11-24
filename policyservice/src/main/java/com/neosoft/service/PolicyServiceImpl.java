package com.neosoft.service;

import com.neosoft.model.Policy;
import com.neosoft.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service
public class PolicyServiceImpl implements PolicyService{
    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public Policy savePolicy(Policy policy) {
        Policy policies = policyRepository.save(policy);
        return policies;
    }

    @Override
    public Policy getPolicy(Integer id) {
        Policy policesid = policyRepository.findById(id);
        return policesid;
    }
}
