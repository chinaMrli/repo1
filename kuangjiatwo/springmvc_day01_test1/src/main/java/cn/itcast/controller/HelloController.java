package cn.itcast.controller;

//控制器类


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(path ="/hello")
    public String asyHello(){
        System.out.println("Hello");
        return "success";
    }
    @RequestMapping(path ="/ttt",method = {RequestMethod.GET})
    public String test1(){
        System.out.println("lalala");
        return "success";
    }
    @RequestMapping(path ="/ttt2",method = {RequestMethod.GET},params = {"username"})
    public String test2(){
        System.out.println("你看这个碗，就像这ge面");
        return "success";
    }
}

