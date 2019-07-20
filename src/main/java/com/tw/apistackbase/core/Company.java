package com.tw.apistackbase.core;

import javax.persistence.*;

@Entity
@Table(name = "company_table")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "company_id")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private  Profile profile;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }
}
