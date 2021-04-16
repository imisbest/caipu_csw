package com.csw.controller;

import com.csw.entity.Caixi;
import com.csw.service.CaixiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("caixi")
public class CaixiController {
    @Autowired
    private CaixiService caixiService;

    @RequestMapping("queryAll")
    public String queryAll(HttpServletRequest request) {
        List<Caixi> caixiList = caixiService.queryAll();
        for (Caixi caixi : caixiList) {
            System.out.println("caixi;;" + caixi);
        }
        request.setAttribute("caixiList", caixiList);
        return "back/caixi/caixi";
    }

    @RequestMapping("add")
    public String add(Caixi caixi) {
        caixi.setId(UUID.randomUUID().toString());
        caixiService.add(caixi);
        return "redirect:/caixi/queryAll";
    }
}
