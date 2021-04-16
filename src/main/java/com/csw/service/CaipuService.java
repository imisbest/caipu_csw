package com.csw.service;

import com.csw.entity.Caipu;

import java.util.List;

public interface CaipuService {
    List<Caipu> queryAllByName(String name);

    List<Caipu> findBy(String parentId);


    List<Caipu> queryAll();

    Caipu findCount(String parentId);

    void update(Caipu caipu);

    List<Caipu> query();

    void delete(String id);

    Caipu queryId(String id);

    void add(Caipu caipu);
}
