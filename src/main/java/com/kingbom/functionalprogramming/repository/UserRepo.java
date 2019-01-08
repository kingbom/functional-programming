package com.kingbom.functionalprogramming.repository;

import com.kingbom.functionalprogramming.model.User;

import java.util.List;

public interface UserRepo {

    List<User> findAll();
}
