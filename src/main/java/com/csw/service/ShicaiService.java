package com.csw.service;

import com.csw.entity.Shicai;

import java.util.List;

public interface ShicaiService {
    List<Shicai> queryAll();

    void add(Shicai shicai);
}
