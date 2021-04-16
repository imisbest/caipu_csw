package com.csw.dao;

import com.csw.entity.Shicai;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShicaiDao {
    List<Shicai> queryAll();

    void add(@Param("c") Shicai shicai);
}
