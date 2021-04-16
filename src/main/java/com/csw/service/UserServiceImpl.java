package com.csw.service;

import com.csw.dao.UserDao;
import com.csw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User queryBy(String name, String password) {
        return userDao.queryBy(name, password);
    }

    @Override
    public void update(User uu) {
        userDao.update(uu);
    }
}
