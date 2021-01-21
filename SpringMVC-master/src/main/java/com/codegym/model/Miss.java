package com.codegym.model;

import javax.persistence.*;
@Entity
@Table(name = "misses")
public class Miss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String age;

    private String email;

    private String identcard;

    private String address;

    private String hometown;

    public Long getNationId() {
        return nationId;
    }

    public void setNationId(Long nationId) {
        this.nationId = nationId;
    }

    private Long nationId;

    @ManyToOne
    @JoinColumn(name = "nation_id")
    private Nation nation;

    public Miss() {
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdentcard(String identcard) {
        this.identcard = identcard;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getIdentcard() {
        return identcard;
    }

    public String getAddress() {
        return address;
    }

    public String getHometown() {
        return hometown;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }
}

