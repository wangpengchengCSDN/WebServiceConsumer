package com.wpc.service.impl;

import com.wpc.service.UserService;

import javax.jws.WebService;
import java.util.Date;


@WebService(name="UserService",targetNamespace="http://service.wpc.com",endpointInterface="com.wpc.service.UserService")
public class UserServiceImpl implements UserService{

    @Override
    public String getUser(String name) {
        String result = "";
        try {
            result = "UserName:" + name + " - Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String listUser() {
        String result = "";
        try {
            result = "Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String deleteUser(String id) {
        String result = "";
        try {
            result = "UserId:" + id + " - Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String updateUser(String id) {
        String result = "";
        try {
            result = "UserId:" + id + " - Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}