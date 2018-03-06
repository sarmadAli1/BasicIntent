package com.example.sarmad.intentassingment.Model;

import java.io.Serializable;

/**
 * Created by Sarmad on 05-Mar-18.
 */

public class Student implements Serializable

{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    String name;
    String Email;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    String info;


}

