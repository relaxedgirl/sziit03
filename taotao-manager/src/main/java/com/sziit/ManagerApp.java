package com.sziit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 *  @项目名：  taotao-parent 
 *  @包名：    com.sziit
 *  @文件名:   ManagerApp
 *  @创建者:   火星人
 *  @创建时间:  2018/9/12 9:16
 *  @描述：    TODO
 */

@EnableAutoConfiguration(exclude= DataSourceAutoConfiguration.class)

@SpringBootApplication
public class ManagerApp {
    public static void main(String [] args){

        SpringApplication.run(ManagerApp.class,args);
    }

}
