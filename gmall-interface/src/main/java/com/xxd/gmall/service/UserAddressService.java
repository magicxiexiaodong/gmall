package com.xxd.gmall.service;

import com.xxd.gmall.bean.UserAddress;

import java.util.List;

public interface UserAddressService {
    public List<UserAddress> getUserAddressList(String userId);
}
