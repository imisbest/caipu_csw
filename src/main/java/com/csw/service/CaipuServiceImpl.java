package com.csw.service;

import com.csw.dao.CaipuDao;
import com.csw.entity.Caipu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CaipuServiceImpl implements CaipuService {
    @Autowired
    private CaipuDao caipuDao;

    @Override
    public List<Caipu> queryAllByName(String name) {
        return caipuDao.queryAllByName(name);
    }

    @Override
    public List<Caipu> findBy(String parentId) {
        return caipuDao.findBy(parentId);
    }

    @Override
    public List<Caipu> queryAll() {
        return caipuDao.queryAll();
    }

    @Override
    public Caipu findCount(String parentId) {
        return caipuDao.findCount(parentId);
    }

    @Override
    public void update(Caipu caipu) {
        caipuDao.update(caipu);
    }

    @Override
    public List<Caipu> query() {
        return caipuDao.query();
    }

    @Override
    public void delete(String id) {
        caipuDao.delete(id);
    }

    @Override
    public Caipu queryId(String id) {
        return caipuDao.queryId(id);
    }

    @Override
    public void add(Caipu caipu) {
        caipuDao.add(caipu);
    }
}
