package cn.luoyudi.service;

import cn.luoyudi.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DecimalFormat;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void save() {
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println(format);

    }

    @Test
    public void findAll() {
        List<Account> accountList = accountService.findAll();
        accountList.forEach(System.out::println);
    }
}