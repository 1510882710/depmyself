package com.depmyself.service;



import com.depmyself.pojo.Dept;

import java.util.List;

/**
 * @基本功能:
 * @program:demo
 * @author:wfg
 * @create:2023-09-14 11:23:42
 **/
public interface DeptService {

    List<Dept> list();

    void delete(Integer id);

    void add(Dept dept);

    Dept getById(Integer id);

    void update(Dept dept);

  /*  *//**
     * 查询所有的部门数据
     * @return 存储Dept对象的集合
     *//*
    List<Dept> list();

    *//**
     * 根据id删除部门
     * @param id 部门id
     *//*
    void delete(Integer id);

    *//**
     * 新增部门
     * @param dept 部门对象
     *//*
    void add(Dept dept);

    void update(Dept dept);

    Dept getByID(Integer id);
*/




}
