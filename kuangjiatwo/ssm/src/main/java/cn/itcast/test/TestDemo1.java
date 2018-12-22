package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.InputStream;
import java.util.List;

public class TestDemo1 {



    @Test
    public void test1 ()throws Exception{
    //加载配置文件
        InputStream is = Resources.getResourceAsStream( "SqlMapConfig.xml" );
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao mapper = sqlSession.getMapper( AccountDao.class );
        //执行方法
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        //释放资源
        sqlSession.close();
        is.close();
    }

    @Test
    public void test2 ()throws Exception{
        Account account = new Account();
        account.setName( "德玛西亚" );
        account.setMoney( 999.9 );
        //加载配置文件
        InputStream is = Resources.getResourceAsStream( "SqlMapConfig.xml" );
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao mapper = sqlSession.getMapper( AccountDao.class );
        //执行方法
       mapper.saveAccount(account);
       //提交事务
       sqlSession.commit();
       //释放资源
        sqlSession.close();
        is.close();
    }


}
