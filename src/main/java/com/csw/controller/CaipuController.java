package com.csw.controller;

import com.csw.entity.Caipu;
import com.csw.entity.Shicai;
import com.csw.entity.Zhong;
import com.csw.service.CaipuService;
import com.csw.service.ShicaiService;
import com.csw.service.ZhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("caipu")
public class CaipuController {
    @Autowired
    private CaipuService caipuService;
    @Autowired
    private ShicaiService shicaiService;
    @Autowired
    private ZhongService zhongService;

    @RequestMapping("queryAll")
    public String queryAll(HttpServletRequest request) {
        List<Caipu> caipuList = caipuService.query();
        request.setAttribute("caipuList", caipuList);
        return "back/caipu/caipu";
    }

    @RequestMapping("delete")
    public String delete(String id) {
        System.out.println("id;;" + id);
        caipuService.delete(id);
        return "redirect:/caipu/queryAll";
    }

    @RequestMapping("updatefirst")
    public String updatefirst(String id, HttpServletRequest request) {
        System.out.println("id;;" + id);
        Caipu caipu = caipuService.queryId(id);
        System.out.println("caipu;;" + caipu);
        List<Shicai> shicais = shicaiService.queryAll();
        for (Shicai shicai : shicais) {
            System.out.println("shicais;;" + shicai);
        }
        request.setAttribute("shicais", shicais);
        request.setAttribute("caipu", caipu);
        return "/back/caipu/update";
    }

    @RequestMapping("update")
    public String update(Caipu caipu, String[] ttt) {
        System.out.println(" update caip;;" + caipu);
        caipuService.update(caipu);
        /**
         *
         */
        List<String> strings = Arrays.asList(ttt);
        zhongService.delete(caipu.getId());
        for (String string : strings) {
            zhongService.add(new Zhong(caipu.getId(), string));
        }
        return "redirect:/caipu/queryAll";
    }

    @RequestMapping("addfirst")
    public String addfirst(HttpServletRequest request) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        List<Shicai> shicais = shicaiService.queryAll();
        for (Shicai shicai : shicais) {
            System.out.println("shicais;;" + shicai);
        }
        request.setAttribute("shicais", shicais);
        return "back/caipu/add";
    }

    @RequestMapping("add")
    public String add(Caipu caipu, String[] ttt) {
        System.out.println(" add caip;;" + caipu);
        caipu.setId(UUID.randomUUID().toString());
        caipu.setCount(0);
        System.out.println(" add caip;;" + caipu);
        caipuService.add(caipu);
        /**
         *
         */
        List<String> strings = Arrays.asList(ttt);
        zhongService.delete(caipu.getId());
        for (String string : strings) {
            zhongService.add(new Zhong(caipu.getId(), string));
        }
        return "redirect:/caipu/queryAll";
    }

}
