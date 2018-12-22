package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

@Autowired
private AccountService accountService;
    @RequestMapping("findAll")
    public String findAll(){
    System.out.println("查询所有执行成功");
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        return "success";
    }

@RequestMapping("save")
    public void  save(Account account , HttpServletRequest request, HttpServletResponse response) throws IOException {
    System.out.println("注入执行成功");
        accountService.saveAccount( account );
        response.sendRedirect( request.getContextPath()+"/account/findAll" );
}





}
