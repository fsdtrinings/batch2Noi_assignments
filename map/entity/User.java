package com.edu.map.entity;

import java.util.List;

public class User {

    String username;
    String password;
    String fullName ;
    int age;

    Address address;

    List<Policy> userOwnPolicies;
    // User can own multiple policies
}

