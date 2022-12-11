package com.wqd.controller;

import com.wqd.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/index")
    public String test(){
        empService.test();
        return "forward:/index.jsp";
    }
}
