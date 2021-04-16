package com.csw.dao;

import com.csw.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User queryBy(@Param("u") String name,
                 @Param("p") String password);

    void update(User uu);
}
