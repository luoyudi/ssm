package cn.luoyudi.mapper;

import cn.luoyudi.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AccountMapper {
    //保存账户信息
    int save(Account account);

    //查询账户中所有信息
    List<Account> findAll();
}
