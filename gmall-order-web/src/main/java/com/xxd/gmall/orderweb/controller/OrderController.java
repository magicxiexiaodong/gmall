package com.xxd.gmall.orderweb.controller;

import com.xxd.gmall.bean.UserAddress;
import com.xxd.gmall.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private UserAddressService userAddressService;

    @RequestMapping("/trade/{userId}")
    public List<UserAddress> trade(@PathVariable("userId") String userId){
        List<UserAddress> userAddressList = userAddressService.getUserAddressList(userId);
        return  userAddressList;
    }
}
