
package com.lemon.spring.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String sex;
    private String password;
    private List<String> skills;
    private String house;
    private String country;
    private Preferences preferences;
    private String notes;
    private String displayNone;

    public User(){
        this.preferences = new Preferences();
    }

}
