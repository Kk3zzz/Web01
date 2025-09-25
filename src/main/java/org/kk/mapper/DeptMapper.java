package org.kk.mapper;

import org.apache.ibatis.annotations.*;
import org.kk.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dept")
    List<Dept> listDept();

    @Delete("delete from dept where id = #{id}")
    void deletDept(Integer id);

    @Insert("insert into dept(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void addDept(Dept dept);

    @Select("SELECT * from dept where id = #{id}")
    Dept getDept(Integer id);

    @Update("UPDATE dept SET name= #{name}, update_time =#{updateTime} Where id = #{id}")
    void updateDept(Dept dept);
}
