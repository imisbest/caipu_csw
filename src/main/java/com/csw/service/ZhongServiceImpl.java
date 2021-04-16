package com.csw.service;

import com.csw.dao.ZhongDao;
import com.csw.entity.Zhong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ZhongServiceImpl implements ZhongService {
    @Autowired
    private ZhongDao zhongDao;

    @Override
    public void delete(String id) {
        zhongDao.delete(id);
    }

    @Override
    public void add(Zhong zhong) {
        zhongDao.add(zhong);
    }
}
