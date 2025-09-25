package org.kk.controller;

import org.kk.pojo.Clazz;
import org.kk.pojo.Result;
import org.kk.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
