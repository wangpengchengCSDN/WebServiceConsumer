package com.wpc.service;

import javax.jws.WebService;

@WebService(name="UserService",targetNamespace="http://service.wpc.com")
public interface UserService {

     public String getUser(String name);

     public String listUser();

     public String deleteUser(String id);

     public String updateUser(String id);
}
