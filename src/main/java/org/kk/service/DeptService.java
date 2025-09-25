package org.kk.service;

import org.kk.pojo.Dept;

import java.util.List;

public interface DeptService {
    public List<Dept> listDept();

    void deletDept(Integer id);

    void addDept(Dept dept);

    Dept getDept(Integer id);

    void updateDept(Dept dept);
}
