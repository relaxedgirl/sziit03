package com.sziit.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sziit.mapper.UserMapper;
import com.sziit.pojo.User;
import com.sziit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
 *  @项目名：  taotao-parent 
 *  @包名：    com.sziit.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   火星人
 *  @创建时间:  2018/9/12 9:35
 *  @描述：    TODO
 */
@Service
public class UserServiceImpl implements UserService {

    //private static final String TAG = "UserServiceImpl";

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的save方法");
    }

    @Override
    public User selectOne(long id){

       return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<User> findByPage(int currentPage,int pageSize){

        PageHelper.startPage(currentPage,pageSize);
        List<User> list = userMapper.selectAll();

        return  new PageInfo<>(list);
    }
    }
