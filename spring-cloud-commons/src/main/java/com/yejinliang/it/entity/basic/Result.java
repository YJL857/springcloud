package com.yejinliang.it.entity.basic;

import com.yejinliang.it.itenum.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yejinliang
 * @create 2022-06-26 17:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor // 有参构造
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code;

    private String message;

    private Object data;

    public Result(ResultEnum resultEnum) {
        super();
    }

    public static Result success(Object data) {
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getValue(), data);
    }

    public static Result success(Object data, ResultEnum resultEnum) {
        return new Result(resultEnum.getCode(),resultEnum.getCn(), data);
    }

    public static Result fail(Object data, Integer code, String message) {
        return new Result(code, message, data);
    }

    public static Result fail(ResultEnum resultEnum) {
        return new Result(resultEnum.getCode(),resultEnum.getCn(), null);
    }
}

