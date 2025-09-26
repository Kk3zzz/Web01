package org.kk.service;


import org.kk.pojo.Clazz;

import java.util.List;

public interface ClazzService {
    void addClazz(Clazz clazz);

    List<Clazz> getClazzList();
}
