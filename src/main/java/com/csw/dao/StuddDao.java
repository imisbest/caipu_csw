package com.csw.dao;

import com.csw.entity.Studd;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuddDao {
    List<Studd> queryAll();

    void add(@Param("s") Studd studd);
}
