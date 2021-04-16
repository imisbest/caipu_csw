package com.csw.dao;

import com.csw.entity.Zhong;
import org.apache.ibatis.annotations.Param;

public interface ZhongDao {
    void delete(String id);

    void add(@Param("z") Zhong zhong);
}
