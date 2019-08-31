package com.wpc.controller;

import com.wpc.entity.Dept;
import com.wpc.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/8/30.
 */

@Controller
public class TestController {

    @Resource
    private TestService testService;

    @ApiOperation("测试接口")
    @PostMapping("test")
    @ResponseBody
    public List<Dept> test(Model model){
        List<Dept> list = testService.selectDeptList();
        model.addAttribute("list",list);
        return list;
    }


    @ApiOperation("删除接口")
    @RequestMapping("del")
    @ResponseBody
    public Dept del(Integer id){
        Dept dept = new Dept();
        dept.setDid(1);
        dept.setDname("wpc123");
        return dept;
    }
}
