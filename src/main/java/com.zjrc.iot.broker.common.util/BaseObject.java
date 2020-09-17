package com.zjrc.iot.broker.common.util;


import java.io.Serializable;
import java.util.Map;
import com.zjrc.iot.broker.common.util.Constant.ACF;
import com.zjrc.iot.broker.common.util.Constant.CF;
/**
 * 实体基类
 * 
 * @author wanghao
 * @date 2016年6月25日
 */
public class BaseObject implements Serializable {

	private static final long serialVersionUID = 1L;

	// 创建者用户ID
	@ACF(CF = CF.CREATEUSERID)
	private Integer createUserId;

	// 创建时间
	@ACF(CF = CF.CREATEDATE)
	private String createDate;

	// 修改者用户ID
	@ACF(CF = CF.MODIFYUSERID)
	private Integer modifyUserId;

	// 修改时间
	@ACF(CF = CF.MODIFYDATE)
	private String modifyDate;

	// 记录状态 1有效，0无效
	@ACF(CF = CF.STATUS)
	private String status;

	// 临时参数（int）
	private Integer paramInt;

	// 临时容器
	private Map<String, String> MapStr;

	// 临时容器
	private Map<String, Object> MapObj;

	// 临时参数
	private String param;

	// 分页参数
	private Page page;

	public Integer getParamInt() {
		return paramInt;
	}

	public void setParamInt(Integer paramInt) {
		this.paramInt = paramInt;
	}

	public Map<String, String> getMapStr() {
		return MapStr;
	}

	public void setMapStr(Map<String, String> mapStr) {
		MapStr = mapStr;
	}

	public Map<String, Object> getMapObj() {
		return MapObj;
	}

	public void setMapObj(Map<String, Object> mapObj) {
		MapObj = mapObj;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	// 临时参数
	private String params;

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCareteDate(String createDate) {
		this.createDate = createDate;
	}

	public Integer getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Integer modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
