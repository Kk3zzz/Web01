package org.kk.controller;

import org.kk.pojo.Clazz;
import org.kk.pojo.Result;
import org.kk.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("clazzs")

@RestController
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @PostMapping
    public Result addClazz(@RequestBody Clazz clazz){
        clazzService.addClazz(clazz);
        System.out.println("add clazz" +clazz);
        return Result.success();
    }

    @GetMapping("list")
    public Result getClazzList(){
        List<Clazz> clazzList= clazzService.getClazzList();
        System.out.println("get clazz list");
        return Result.success(clazzList);
    }

}
