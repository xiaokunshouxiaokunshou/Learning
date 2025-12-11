package com.aj.RCS.pojo;

import lombok.Data;

/**
 * 后端统一返回结果
 */
@Data
public class Result {
    private Integer code; //1 Success, 0 Failure
    private String msg; //提示信息
    private Object obj; //数据

    public static Result success(){
        Result result = new Result();
        result.code = 1;
        result.msg = "success";
        return result;
    }

    public static Result success(Object object)
    {
        Result result = new Result();
        result.code = 1;
        result.msg = "success";
        result.obj = object;
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }

}
