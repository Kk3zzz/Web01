package org.kk.service.Impl;

import org.kk.mapper.DeptMapper;
import org.kk.pojo.Dept;
import org.kk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> listDept() {
        return deptMapper.listDept();
    }

    @Override
    public void deletDept(Integer id) {
        deptMapper.deletDept(id);
    }

    @Override
    public void addDept(Dept dept) {
        LocalDateTime now  = LocalDateTime.now();
        dept.setCreateTime(now);
        dept.setUpdateTime(now);
        deptMapper.addDept(dept);
    }

    @Override
    public Dept getDept(Integer id) {
        Dept dept = deptMapper.getDept(id);
        return dept;
    }

    @Override
    public void updateDept(Dept dept) {
        LocalDateTime now  = LocalDateTime.now();
        dept.setUpdateTime(now);
        deptMapper.updateDept(dept);
    }
}
