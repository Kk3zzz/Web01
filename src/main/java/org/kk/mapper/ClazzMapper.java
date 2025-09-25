package org.kk.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.kk.pojo.Clazz;

@Mapper
public interface ClazzMapper {

    @Insert("INSERT INTO clazz (name,room,begin_date,end_date,master_id,subject,create_time,update_time) VALUES (#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject},#{createTime},#{updateTime}) ")
    void addClazz(Clazz clazz);
}
