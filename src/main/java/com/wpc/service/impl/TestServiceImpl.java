package com.wpc.service.impl;

import com.wpc.dao.TestMapper;
import com.wpc.entity.Dept;
import com.wpc.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/8/30.
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<Dept> selectDeptList() {
        return testMapper.selectDeptList();
    }
}
