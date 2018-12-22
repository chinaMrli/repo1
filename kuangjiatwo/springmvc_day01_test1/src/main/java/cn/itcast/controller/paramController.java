package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//请求参数绑定
@Controller
@RequestMapping("/param")
public class paramController {
        @RequestMapping("test1")
        public String test1(String name,String password){
            System.out.println("执行了");
            System.out.println(name);
            System.out.println(password);
            return "test2";
        }
    @RequestMapping("test2")
    public String test2(Account account){
        System.out.println("执行了");
        System.out.println(account);
        return "test2";
    }
    @RequestMapping("test3")
    public String test3(Account account){
        System.out.println("执行了");
        System.out.println(account);
        return "test2";
    }
    @RequestMapping("test4")
    public String test4(Account account){
        System.out.println("执行了");
        System.out.println(account);
        return "test2";
    }
//    自定义用户转换器
    @RequestMapping("test5")
    public String saveUser(User user){
        System.out.println("执行了");
        System.out.println(user);
        return "test2";
    }


//    获取api
@RequestMapping("test6")
public String saveUser6(HttpServletRequest request, HttpServletResponse response){
    System.out.println("执行了");
    System.out.println(request);
    HttpSession session = request.getSession();
    System.out.println(session);
    ServletContext servletContext = session.getServletContext();
    System.out.println(servletContext);
    System.out.println(response);

    return "test2";
}



}
