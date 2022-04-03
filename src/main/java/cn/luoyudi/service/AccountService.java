package cn.luoyudi.service;

import cn.luoyudi.pojo.Account;

import java.util.List;

public interface AccountService {
    //保存
    void save(Account account);

    //查询所有
    List<Account> findAll();
}
