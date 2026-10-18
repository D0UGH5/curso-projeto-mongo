package com.murilofurtado.workshopmongo.dto;

import java.io.Serializable;

import com.murilofurtado.workshopmongo.domain.User;

public class UserDto implements Serializable{

    private String id;
    private String name;
    private String email;

    public UserDto(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserDto(){
    }

    public UserDto(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
