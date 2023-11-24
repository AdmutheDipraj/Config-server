package com.neosoft.repository;

import com.neosoft.model.Policy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface PolicyRepository extends CrudRepository<Policy, Serializable> {

    public Policy findById(Integer id);
}
