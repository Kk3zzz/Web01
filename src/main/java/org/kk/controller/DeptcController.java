package org.kk.controller;

import org.kk.pojo.Dept;
import org.kk.pojo.Result;
import org.kk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/depts")

@RestController
public class DeptcController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list(){
        List<Dept> deptList = deptService.listDept();
        return Result.success(deptList);
    }

    @DeleteMapping
    public Result delete(Integer id){
        deptService.deletDept(id);
        System.out.println("delete dept" +id);
        return Result.success();
    }

    @PostMapping
    public Result addDept(@RequestBody Dept dept){
        deptService.addDept(dept);
        System.out.println("add dept" +dept);
        return Result.success();
    }

    @GetMapping("{id}")
    public Result getDept(@PathVariable Integer id){
        Dept dept = deptService.getDept(id);
        System.out.println("get dept" +id);
        return Result.success(dept);
    }

    @PutMapping
    public Result updateDept(@RequestBody Dept dept){
        deptService.updateDept(dept);
        System.out.println("update dept" +dept);
        return Result.success();
    }
}
