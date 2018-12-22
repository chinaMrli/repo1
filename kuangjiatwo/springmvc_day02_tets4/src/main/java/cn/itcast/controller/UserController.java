package cn.itcast.controller;

import cn.itcast.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
@RequestMapping
    public String change() throws SysException {
    System.out.println("执行了");


    try {
      //模拟异常
        int a=1/0;

    } catch (Exception e) {
        e.printStackTrace();

        throw  new SysException( "查询所有用户出差" );
        }
    return "success";
    }
}
