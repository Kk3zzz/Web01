package org.kk.service.Impl;

import org.kk.mapper.ClazzMapper;
import org.kk.pojo.Clazz;
import org.kk.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    ClazzMapper clazzMapper;

    @Override
    public void addClazz(Clazz clazz) {
        LocalDateTime now = LocalDateTime.now();
        clazz.setCreateTime(now);
        clazz.setUpdateTime(now);
        clazzMapper.addClazz(clazz);
    }
}
