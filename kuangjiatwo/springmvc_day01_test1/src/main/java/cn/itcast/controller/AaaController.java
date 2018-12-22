package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ato")
public class AaaController {


    @RequestMapping("/change1")
    public String change1(@RequestParam(value = "username") String name){
        System.out.println("执行了");
        System.out.println(name);
        return "test2";
    }
}
