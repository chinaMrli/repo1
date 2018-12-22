package cn.itcast.service;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有账户信息
    public List<Account> findAll();

    //存储账户信息

    public void  saveAccount(Account account);


}
