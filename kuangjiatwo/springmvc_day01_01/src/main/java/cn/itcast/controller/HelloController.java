package cn.itcast.controller;

//控制器类


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(path ="/hello")
    public String asyHello(){
        System.out.println("Hello");
        return "success";
    }

}

