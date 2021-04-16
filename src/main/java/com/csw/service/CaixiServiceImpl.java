package com.csw.service;

import com.csw.dao.CaixiDao;
import com.csw.entity.Caixi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CaixiServiceImpl implements CaixiService {
    @Autowired
    private CaixiDao caixiDao;

    @Override
    public List<Caixi> queryAllByName(String name) {
        return caixiDao.queryAllByName(name);
    }

    @Override
    public List<Caixi> queryAll() {
        return caixiDao.queryAll();
    }

    @Override
    public void add(Caixi caixi) {
        caixiDao.add(caixi);
    }
}
