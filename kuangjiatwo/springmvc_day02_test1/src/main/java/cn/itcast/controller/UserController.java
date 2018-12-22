package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
//string
@RequestMapping("/test1")
    public String test1(Model model){
    System.out.println("方法执行了");
    User user = new User();
    user.setUsername( "zhangsan" );
    user.setPassword( "sada" );
    user.setAge(18);
    model.addAttribute("user",user);
    return "success";
}


//void

    @RequestMapping("/test2")
    public void test2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("方法执行了");
      request.getRequestDispatcher( "/WEB-INF/pages/success.jsp" ).forward( request,response );
    //重定向
       // response.sendRedirect( request.getContextPath()+"/index.jsp" );
        //设置中文乱码
//        response.setCharacterEncoding( "UTF-8" );
//        response.setContentType("text/html;charset=UTF-8");
//
//        // 直接会进行响应
//        response.getWriter().print("你好");
    }
        //返回MOdelAndView
    @RequestMapping("/test3")
    public ModelAndView test3(){
    //创建ModelAndView对象
        ModelAndView view = new ModelAndView();
        System.out.println("方法执行了");
        //模拟冲数据库中查询出User对象
        User user = new User();
        user.setUsername( "锐雯" );
        user.setPassword( "weqwe" );
        user.setAge( 12 );
        //页面跳转
        view.setViewName( "success" );

        return view;
    }


    //关键字转发或重定向
    @RequestMapping("/test4")
    public String test4(){
        System.out.println("方法执行了");
        //转发
        //return "forward:/WEB-INF/pages/success.jsp";
        //重定向
        return  "redirect:/index.jsp";

    }
    //模拟异步请求响应
    @RequestMapping("/testAjax")
    @ResponseBody
    public  User testAjax(@RequestBody User user){
        System.out.println("Ajax方法执行了");
        System.out.println(user);
        //作响应查询数据库
        user.setUsername( "剑豪" );
        user.setAge( 16 );
        return  user;
    }


}
