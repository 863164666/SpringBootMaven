package com.model.user;

import java.io.Serializable;

/**
 * Created by hefule on 2016/7/31.
 */
public class User implements Serializable{
    private final static long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer age;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
