package com.depmyself.mapper;


import com.depmyself.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @基本功能:
 * @program:demo
 * @author:wfg
 * @create:2023-09-14 11:15:03
 **/

@Mapper
public interface DeptMapper {

    @Select("select id, name, create_time, update_time from dept")
    List<Dept> list();

    @Delete("delete from dept where id =  #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept (name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("select * from dept where id =  #{id}")
    Dept getById(Integer id);

    @Update("update dept set name = #{name},update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);


   /* //查询所有部门数据
    @Select("select id, name, create_time, update_time from dept")
    List<Dept> list();

    *//**
     * 根据id删除部门信息
     * @param id 部门id
     *//*
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept (name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void inser(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept getByID(Integer id);

    @Update("update dept set name = #{name},update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);
*/
}
