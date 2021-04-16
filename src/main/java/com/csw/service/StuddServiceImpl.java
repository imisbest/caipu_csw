package com.csw.service;

import com.csw.dao.StuddDao;
import com.csw.entity.Studd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StuddServiceImpl implements StuddService {
    @Autowired
    private StuddDao studdDao;

    @Override
    public List<Studd> queryAll() {
        return studdDao.queryAll();
    }

    @Override
    public void add(Studd studd) {
        studdDao.add(studd);
    }
}
