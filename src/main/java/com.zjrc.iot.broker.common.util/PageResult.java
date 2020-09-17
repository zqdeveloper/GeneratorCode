package com.zjrc.iot.broker.common.util;

import java.io.Serializable;
import java.util.List;

/**
 * 带分页返回的数据集
 *
 * @author
 */
public class PageResult implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* 返回结果数据集 */
    private List<?> aaData;

    /* 请求次数 */
    private Integer sEcho;

    /* 数据集总数量 */
    private Integer itotalRecords;

    /* 数据集总页数 */
    private Integer itotalPages;

    /* 过滤后的数据集总数量 */
    //private Integer itotalDisplayRecords;

    /* 结果码，0：成功，1：参数错误，2：程序异常，3：其他错误 */
    private Integer code;

    /* 提示信息 */
    private String msg;

    public PageResult() {}

    public PageResult(Integer cod, String msg) {
        this.setCode(cod);
        this.setMsg(msg);
    }

    public PageResult(Integer cod, String msg, Integer itotalRecords) {
        this(cod, msg);
        this.setItotalRecords(itotalRecords);
    }

    public PageResult(Integer cod, String msg, Integer itotalRecords, List<?> aaData) {
        this(cod, msg, itotalRecords);
        this.setAaData(aaData);
    }
    
    public void setPageResult(Integer code,String msg,List<?> aaData){
    	this.code = code;
    	this.msg = msg;
    	this.aaData = aaData;
    }

    public List<?> getAaData() {
        return aaData;
    }

    public void setAaData(List<?> aaData) {
        this.aaData = aaData;
    }

    public Integer getsEcho() {
        return sEcho;
    }

    public void setsEcho(Integer sEcho) {
        this.sEcho = sEcho;
    }

    public Integer getItotalRecords() {
        return itotalRecords;
    }

    public void setItotalRecords(Integer itotalRecords) {
        this.itotalRecords = itotalRecords;
    }

    public Integer getItotalPages() {
        return itotalPages;
    }

    public void setItotalPages(Integer itotalPages) {
        this.itotalPages = itotalPages;
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

}
