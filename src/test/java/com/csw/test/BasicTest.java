package com.csw.test;

import com.csw.Application;
import com.csw.entity.Caipu;
import com.csw.entity.Studd;
import com.csw.service.CaipuService;
import com.csw.service.StuddService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by HIAPAD on 2019/10/30.
 */
//
@RunWith(SpringRunner.class)  //==@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class BasicTest {
    @Autowired
    private StuddService studdService;
    @Autowired
    private CaipuService caipuService;

    @Test
    public void test0() {
        List<Studd> studds = studdService.queryAll();
        for (Studd studd : studds) {
            System.out.println(studd);
        }
    }

    @Test
    public void test1() {
        List<Caipu> caipus = caipuService.query();
        for (Caipu caipu : caipus) {
            System.out.println(caipu);
        }
    }

}

