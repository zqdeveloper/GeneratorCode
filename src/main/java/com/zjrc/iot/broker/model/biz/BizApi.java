package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 接口信息表
 */
@ApiModel(
    value = "BizApi",
    description = "接口信息表"
)
public class BizApi extends BaseObject {
  /**
   * 接口ID
   */
  @ApiModelProperty(
      value = "接口ID",
      required = false
  )
  private Integer apiId;

  /**
   * 接口类型ID
   */
  @ApiModelProperty(
      value = "接口类型ID",
      required = false
  )
  private Integer apiTypeId;

  /**
   * 编号
   */
  @ApiModelProperty(
      value = "编号",
      required = false
  )
  private String apiCode;

  /**
   * 名称
   */
  @ApiModelProperty(
      value = "名称",
      required = false
  )
  private String apiName;

  /**
   * 接口URL
   */
  @ApiModelProperty(
      value = "接口URL",
      required = false
  )
  private String apiUrl;

  /**
   * 版本
   */
  @ApiModelProperty(
      value = "版本",
      required = false
  )
  private String apiVersion;

  /**
   * 描述
   */
  @ApiModelProperty(
      value = "描述",
      required = true
  )
  private String apiDesc;

  /**
   * 使用类型(与数据字典API_USE_TYPE关联)
   */
  @ApiModelProperty(
      value = "使用类型(与数据字典API_USE_TYPE关联)",
      required = false
  )
  private String apiUseType;

  /**
   * 关闭时间
   */
  @ApiModelProperty(
      value = "关闭时间",
      required = true
  )
  private String closeDate;

  /**
   * 开通时间
   */
  @ApiModelProperty(
      value = "开通时间",
      required = true
  )
  private String openDate;

  /**
   * 是否开通(0:否, 1:是)
   */
  @ApiModelProperty(
      value = "是否开通(0:否, 1:是)",
      required = true
  )
  private String openState;

  /**
   * 创建人员ID
   */
  @ApiModelProperty(
      value = "创建人员ID",
      required = true
  )
  private Integer createUserId;

  /**
   * 创建时间
   */
  @ApiModelProperty(
      value = "创建时间",
      required = true
  )
  private String createDate;

  /**
   * 修改人员ID
   */
  @ApiModelProperty(
      value = "修改人员ID",
      required = true
  )
  private Integer modifyUserId;

  /**
   * 修改时间
   */
  @ApiModelProperty(
      value = "修改时间",
      required = true
  )
  private String modifyDate;

  /**
   * 状态
   */
  @ApiModelProperty(
      value = "状态",
      required = false
  )
  private String status;

  /**
   * 备注
   */
  @ApiModelProperty(
      value = "备注",
      required = true
  )
  private String remark;

  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
  }

  public Integer getApiTypeId() {
    return apiTypeId;
  }

  public void setApiTypeId(Integer apiTypeId) {
    this.apiTypeId = apiTypeId;
  }

  public String getApiCode() {
    return apiCode;
  }

  public void setApiCode(String apiCode) {
    this.apiCode = apiCode;
  }

  public String getApiName() {
    return apiName;
  }

  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public String getApiDesc() {
    return apiDesc;
  }

  public void setApiDesc(String apiDesc) {
    this.apiDesc = apiDesc;
  }

  public String getApiUseType() {
    return apiUseType;
  }

  public void setApiUseType(String apiUseType) {
    this.apiUseType = apiUseType;
  }

  public String getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }

  public String getOpenDate() {
    return openDate;
  }

  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }

  public String getOpenState() {
    return openState;
  }

  public void setOpenState(String openState) {
    this.openState = openState;
  }

  public Integer getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
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

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}
