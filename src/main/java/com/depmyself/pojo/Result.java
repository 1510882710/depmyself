package com.depmyself.pojo;

/**
 * @基本功能:
 * @program:demo
 * @author:www wfg
 * @create:2023-09-14 11:36:10
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;//响应码，1 代表成功; 0 代表失败
    private String msg;  //响应信息 描述字符串
    private Object data; //返回的数据

    //增删改 成功响应
    public static com.depmyself.pojo.Result success(){
        return new com.depmyself.pojo.Result(1,"success",null);
    }
    //查询 成功响应
    public static com.depmyself.pojo.Result success(Object data){
        return new com.depmyself.pojo.Result(1,"success",data);
    }
    //失败响应
    public static com.depmyself.pojo.Result error(String msg){
        return new com.depmyself.pojo.Result(0,msg,null);
    }
}

