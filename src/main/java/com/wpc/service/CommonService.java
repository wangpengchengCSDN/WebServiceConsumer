package com.wpc.service;

import com.wpc.entity.Dept;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Administrator on 2019/8/30.
 */

@WebService
public interface CommonService {

    @WebMethod
    List<Dept> selectDeptList();

}
