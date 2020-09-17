package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 业务信息表
 */
@ApiModel(
    value = "BizBusiness",
    description = "业务信息表"
)
public class BizBusiness extends BaseObject {
  /**
   * 业务ID
   */
  @ApiModelProperty(
      value = "业务ID",
      required = false
  )
  private Integer businessId;

  /**
   * 编号
   */
  @ApiModelProperty(
      value = "编号",
      required = false
  )
  private String businessCode;

  /**
   * 名称
   */
  @ApiModelProperty(
      value = "名称",
      required = false
  )
  private String businessName;

  /**
   * 限制发送类型(与数据字典LIMIT_SEND_TYPE关联)
   */
  @ApiModelProperty(
      value = "限制发送类型(与数据字典LIMIT_SEND_TYPE关联)",
      required = true
  )
  private String limitSendType;

  /**
   * 限制发送数量
   */
  @ApiModelProperty(
      value = "限制发送数量",
      required = true
  )
  private Integer limitSendNum;

  /**
   * 应用标识
   */
  @ApiModelProperty(
      value = "应用标识",
      required = false
  )
  private String appKey;

  /**
   * 应用标识密码
   */
  @ApiModelProperty(
      value = "应用标识密码",
      required = false
  )
  private String appKeyPass;

  /**
   * 应用标识开始时间
   */
  @ApiModelProperty(
      value = "应用标识开始时间",
      required = false
  )
  private String appKeyStartDate;

  /**
   * 应用标识结束时间
   */
  @ApiModelProperty(
      value = "应用标识结束时间",
      required = false
  )
  private String appKeyEndDate;

  /**
   * 是否启用(0:停用;1:启用)
   */
  @ApiModelProperty(
      value = "是否启用(0:停用;1:启用)",
      required = false
  )
  private String isEnable;

  /**
   * 上次启用时间
   */
  @ApiModelProperty(
      value = "上次启用时间",
      required = true
  )
  private String lastEnableDate;

  /**
   * 上次停用时间
   */
  @ApiModelProperty(
      value = "上次停用时间",
      required = true
  )
  private String lastDisableDate;

  /**
   * 项目介绍
   */
  @ApiModelProperty(
      value = "项目介绍",
      required = true
  )
  private String businessIntroduce;

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

  public Integer getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Integer businessId) {
    this.businessId = businessId;
  }

  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public String getLimitSendType() {
    return limitSendType;
  }

  public void setLimitSendType(String limitSendType) {
    this.limitSendType = limitSendType;
  }

  public Integer getLimitSendNum() {
    return limitSendNum;
  }

  public void setLimitSendNum(Integer limitSendNum) {
    this.limitSendNum = limitSendNum;
  }

  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public String getAppKeyPass() {
    return appKeyPass;
  }

  public void setAppKeyPass(String appKeyPass) {
    this.appKeyPass = appKeyPass;
  }

  public String getAppKeyStartDate() {
    return appKeyStartDate;
  }

  public void setAppKeyStartDate(String appKeyStartDate) {
    this.appKeyStartDate = appKeyStartDate;
  }

  public String getAppKeyEndDate() {
    return appKeyEndDate;
  }

  public void setAppKeyEndDate(String appKeyEndDate) {
    this.appKeyEndDate = appKeyEndDate;
  }

  public String getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable;
  }

  public String getLastEnableDate() {
    return lastEnableDate;
  }

  public void setLastEnableDate(String lastEnableDate) {
    this.lastEnableDate = lastEnableDate;
  }

  public String getLastDisableDate() {
    return lastDisableDate;
  }

  public void setLastDisableDate(String lastDisableDate) {
    this.lastDisableDate = lastDisableDate;
  }

  public String getBusinessIntroduce() {
    return businessIntroduce;
  }

  public void setBusinessIntroduce(String businessIntroduce) {
    this.businessIntroduce = businessIntroduce;
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
