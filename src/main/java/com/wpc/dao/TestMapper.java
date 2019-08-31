package com.wpc.dao;

import com.wpc.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/8/30.
 */
@Mapper
public interface TestMapper {


    List<Dept> selectDeptList();
}
