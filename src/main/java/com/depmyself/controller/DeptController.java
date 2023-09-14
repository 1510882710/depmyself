package com.depmyself.controller;


import com.depmyself.pojo.Dept;
import com.depmyself.pojo.Result;
import com.depmyself.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @基本功能:
 * @program:demo
 * @author:www wfg
 * @create:2023-09-14 11:28:38
 **/
@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list(){
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/depts/{id}")
    public Result getByID(@PathVariable Integer id){
        Dept byId = deptService.getById(id);
        return Result.success(byId);
    }

    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept) {
        deptService.update(dept);
        return Result.success();
    }



    /*
    //@RequestMapping(value = "/depts" , method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list(){
        log.info("查询所有部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id) {
//日志记录
        log.info("根据id删除部门");
//调用service层功能
        deptService.delete(id);
//响应
        return Result.success();
    }

    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
//记录日志
        log.info("新增部门：{}",dept);
        //调用service层添加功能
        deptService.add(dept);
//响应
        return Result.success();
    }

 *//*   @PutMapping("/depts")
    public Result update(Dept dept){
        //记录日志
        log.info("修改部门：{}",dept);
        Integer  count =  deptService.update(dept);
        if (count == null || count == 0){
            return Result.error("修改失败");
        }

        return Result.success();

    }*//*


    @GetMapping("/depts/{id}")
    public Result getByID(@PathVariable Integer id) {
        log.info("获取部门ID:{}",id);
        Dept dept = deptService.getByID(id);
        return Result.success(dept);
    }
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept) {
        log.info("修改部门:{}",dept);
        deptService.update(dept);
        return Result.success();
    }
*/

}
