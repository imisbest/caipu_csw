package com.csw.controller;

import com.csw.entity.Shicai;
import com.csw.service.ShicaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("shicai")
public class ShicaiController {
    @Autowired
    private ShicaiService shicaiService;

    @RequestMapping("queryAll")
    public String queryAll(HttpServletRequest request) {
        List<Shicai> shicais = shicaiService.queryAll();
        request.setAttribute("shicais", shicais);
        return "back/shicai/shicai";
    }

    @RequestMapping("add")
    public String add(Shicai shicai) {
        shicai.setId(UUID.randomUUID().toString());
        shicaiService.add(shicai);
        return "redirect:/shicai/queryAll";
    }
}
