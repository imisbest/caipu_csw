package com.csw.service;

import com.csw.entity.Caixi;

import java.util.List;

public interface CaixiService {
    List<Caixi> queryAllByName(String name);

    List<Caixi> queryAll();

    void add(Caixi caixi);
}
