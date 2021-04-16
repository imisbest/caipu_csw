package com.csw.service;

import com.csw.dao.ShicaiDao;
import com.csw.entity.Shicai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShicaiServiceImpl implements ShicaiService {
    @Autowired
    private ShicaiDao shicaiDao;

    @Override
    public List<Shicai> queryAll() {
        return shicaiDao.queryAll();
    }

    @Override
    public void add(Shicai shicai) {
        shicaiDao.add(shicai);
    }
}
