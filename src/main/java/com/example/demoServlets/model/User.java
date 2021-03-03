package com.example.demoServlets.model;

public class User {
    String name;
    String surname;
    String age;
    String email;

    public User(String name, String surname, String age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + email;
    }
}
