package com.zjrc.iot.broker.common.util;

/**
 * @author wanghao
 * @version V1.0
 * @Title: Result.java
 * @Package com.wh.lx.common
 * @Description: TODO(添加描述)
 * @date 2016年7月27日 上午11:20:11
 */
public class Result {
    /* 结果码，0：成功，1：参数错误，2：程序异常，3：其他错误 */
    private Integer code;

    /* 提示信息 */
    private String msg;

    /* 其他参数 */
    private Object data;


    public Result() {
        // TODO Auto-generated constructor stub
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result create(int code, String msg, Object object) {
        return new Result(code, msg, object);
    }

    public static Result create() {
        return new Result();
    }

    public void setResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}