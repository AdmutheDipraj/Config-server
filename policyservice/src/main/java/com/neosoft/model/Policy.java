package com.neosoft.model;

import javax.persistence.*;

@Entity
@Table(name="policy")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String status;

    public Policy(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Policy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
