package com.csw.dao;

import com.csw.entity.Caipu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaipuDao {
    List<Caipu> queryAllByName(String name);

    List<Caipu> findBy(String parentId);

    List<Caipu> queryAll();

    Caipu findCount(String parentId);

    void update(@Param("c") Caipu caipu);

    List<Caipu> query();

    void delete(String id);

    Caipu queryId(String id);

    void add(@Param("p") Caipu caipu);
}
