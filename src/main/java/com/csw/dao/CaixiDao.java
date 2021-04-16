package com.csw.dao;

import com.csw.entity.Caixi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaixiDao {
    List<Caixi> queryAllByName(String name);

    List<Caixi> queryAll();

    void add(@Param("c") Caixi caixi);
}
