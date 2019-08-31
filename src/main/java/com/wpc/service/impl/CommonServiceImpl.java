package com.wpc.service.impl;

import com.wpc.dao.TestMapper;
import com.wpc.entity.Dept;
import com.wpc.service.CommonService;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Administrator on 2019/8/30.
 */
@WebService(targetNamespace="http://service.wpc.com/",endpointInterface = "com.wpc.service.CommonService")
public class CommonServiceImpl implements CommonService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<Dept> selectDeptList() {
        return testMapper.selectDeptList();
    }
}
