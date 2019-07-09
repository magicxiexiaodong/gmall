package com.xxd.gmall.service;

import com.xxd.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUserInfoList();

    void addUserInfo(UserInfo userInfo);

    void updUserInfo(UserInfo userInfo);

    void delUserInfo(UserInfo userInfo);
}
