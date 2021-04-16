package com.csw.service;

import com.csw.entity.User;

public interface UserService {
    User queryBy(String name, String password);

    void update(User uu);
}
