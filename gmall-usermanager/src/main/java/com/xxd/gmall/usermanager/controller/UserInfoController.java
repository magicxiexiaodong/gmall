package com.xxd.gmall.usermanager.controller;

import com.xxd.gmall.bean.UserInfo;
import com.xxd.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }

    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") String id){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfoService.delUserInfo(userInfo);
        return "OK";
    }
}
