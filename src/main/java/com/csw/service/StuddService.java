package com.csw.service;

import com.csw.entity.Studd;

import java.util.List;

public interface StuddService {
    List<Studd> queryAll();

    void add(Studd studd);
}
