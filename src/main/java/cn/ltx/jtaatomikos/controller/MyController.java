package cn.ltx.jtaatomikos.controller;

import cn.ltx.jtaatomikos.service.ManyService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    private ManyService1 manyService1;

    @RequestMapping(value = "insertDb1AndDb2")
    @ResponseBody
    public int insertDb1AndDb2(String name, Integer age) {
        int i = manyService1.insertDb1AndDb2(name, age);
        return i;
    }
}
