package com.neosoft.service;

import com.neosoft.model.Policy;

public interface PolicyService {

    public Policy savePolicy(Policy policy);

    public Policy getPolicy(Integer id);
}
