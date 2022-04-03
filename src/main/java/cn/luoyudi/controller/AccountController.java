package cn.luoyudi.controller;

import cn.luoyudi.pojo.Account;
import cn.luoyudi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    //保存
    @RequestMapping("/save")
    @ResponseBody//字符串直接展示
    public String save(Account account) {
        accountService.save(account);
        return "succeed";
    }

    //查询
    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("/jsp/accountList");
        return modelAndView;
    }
}
