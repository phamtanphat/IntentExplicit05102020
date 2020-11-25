package com.example.intentexplicit05102020;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
