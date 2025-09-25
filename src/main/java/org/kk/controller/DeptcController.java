package org.kk.controller;

import org.kk.pojo.Dept;
import org.kk.pojo.Result;
import org.kk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptcController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list(){
        List<Dept> deptList = deptService.getDept();
        return Result.success(deptList);
    }
}
