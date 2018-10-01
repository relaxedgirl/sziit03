package com.sziit.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.sziit.pojo.User;
import com.sziit.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @项目名：  taotao-parent 
 *  @包名：    com.sziit.controller
 *  @文件名:   UserCoontroller
 *  @创建者:   火星人
 *  @创建时间:  2018/9/12 9:25
 *  @描述：    TODO
 */

@RestController
//@Controller
public class UserController {


    @Reference
    private UserService userService;




    @RequestMapping("save")
        public String save(){

            System.out.println("调用UserController的save方法");

            userService.save();
            return "save success!";
    }
    @RequestMapping("selectOne")
    public User selectOne(){


        User user = userService.selectOne(7L);
        return user;
    }
    @RequestMapping("findByPage")
    public PageInfo<User> findByPage(int currentPage,int pageSize){


        return userService.findByPage(currentPage,pageSize);
    }
}
