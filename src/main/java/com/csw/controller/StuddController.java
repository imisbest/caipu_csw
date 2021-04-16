package com.csw.controller;

import com.csw.entity.Caipu;
import com.csw.entity.Caixi;
import com.csw.entity.Studd;
import com.csw.entity.User;
import com.csw.service.CaipuService;
import com.csw.service.CaixiService;
import com.csw.service.StuddService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("studd")
public class StuddController {
    @Autowired
    private StuddService studdService;
    @Autowired
    private CaipuService caipuService;
    @Autowired
    private CaixiService caixiService;

    @RequestMapping("queryAll")
    public String queryAll(HttpServletRequest request) {
        List<Studd> studds = studdService.queryAll();
        for (Studd studd : studds) {
            System.out.println("queryAll;;" + studd);
        }
        request.setAttribute("studds", studds);
        return "front/studd";
    }

    @RequestMapping("findName")
    public String queryAll(String name, HttpServletResponse response) throws IOException {
        System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFname;;" + name);
        /**
         * 通过班级名字模糊查询
         */
        List<Caixi> caixiList = caixiService.queryAllByName(name);
        for (Caixi caixi : caixiList) {
            System.out.println("caixi;;" + caixi);
        }
        Gson gson = new Gson();
        String sss = gson.toJson(caixiList);
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print(sss);
        return null;
    }

    @RequestMapping("findCity")
    public String findCity(String parentId, HttpServletResponse response) throws IOException {
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        /**
         * id是班级id
         */
        List<Caipu> caipuList = caipuService.findBy(parentId);
        // 将cities转换成json字符串
        Gson gson = new Gson();
        String json = gson.toJson(caipuList);
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print(json);
        return null;
    }

    @RequestMapping("count")
    public String count(String parentId, HttpServletResponse response) throws IOException {
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCparentId;;" + parentId);
        /**
         * id是班级id
         */
        Caipu caipu = caipuService.findCount(parentId);
        System.out.println("count caipu;;" + caipu);
        if (caipu != null) {
            caipu.setCount(caipu.getCount() + 1);
        }

        caipuService.update(caipu);
        System.out.println("count caipu;;" + caipu);
        // 将cities转换成json字符串
        Gson gson = new Gson();
        String json = gson.toJson(caipu);
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print(json);
        return null;
    }


    @RequestMapping("addfirst")
    public String addfirst(HttpServletRequest request) {
        List<Caipu> caipuList = caipuService.queryAll();
        for (Caipu caipu : caipuList) {
            System.out.println("addfirst;;" + caipu);
        }
        request.getSession().setAttribute("caipuList", caipuList);
        return "redirect:/front/add.jsp";
    }

    @RequestMapping("add")
    public String add(Studd studd, HttpServletRequest request) {
        System.out.println("studd;;" + studd);
        User uu = (User) request.getSession().getAttribute("user");
        studd.setUid(uu.getId());
        studd.setId(UUID.randomUUID().toString());
        studdService.add(studd);
        return "redirect:/studd/queryAll";
    }
}
