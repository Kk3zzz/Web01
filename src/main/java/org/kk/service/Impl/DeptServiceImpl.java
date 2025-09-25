package org.kk.service.Impl;

import org.kk.mapper.DeptMapper;
import org.kk.pojo.Dept;
import org.kk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getDept() {
        return deptMapper.getDept();
    }
}
