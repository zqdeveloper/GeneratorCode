package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 南向数据解析主表
 */
@ApiModel(
    value = "BizSouthAnalysisMain",
    description = "南向数据解析主表"
)
public class BizSouthAnalysisMain extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer southAnalysisMainId;

  /**
   * 南向解析编号
   */
  @ApiModelProperty(
      value = "南向解析编号",
      required = false
  )
  private String southAnalysisMainCode;

  /**
   * 南向解析名称
   */
  @ApiModelProperty(
      value = "南向解析名称",
      required = false
  )
  private String southAnalysisMainName;

  /**
   * 解析类型（1：http接口2：MQTT主题|3：tcp协议）
   */
  @ApiModelProperty(
      value = "解析类型（1：http接口2：MQTT主题|3：tcp协议）",
      required = false
  )
  private String southAnalysisMainType;

  /**
   * 南向http接口ID/MQTT 主题ID/TCP 协议id
   */
  @ApiModelProperty(
      value = "南向http接口ID/MQTT 主题ID/TCP 协议id",
      required = false
  )
  private Integer southMessageId;

  /**
   * 南向http接口CODE/MQTT 主题CODE/TCP 协议 CODE
   */
  @ApiModelProperty(
      value = "南向http接口CODE/MQTT 主题CODE/TCP 协议 CODE",
      required = true
  )
  private String southMessageCode;

  /**
   * 是否启用 | 1 启用 0 停止
   */
  @ApiModelProperty(
      value = "是否启用 | 1 启用 0 停止",
      required = false
  )
  private String isOpen;

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

  public Integer getSouthAnalysisMainId() {
    return southAnalysisMainId;
  }

  public void setSouthAnalysisMainId(Integer southAnalysisMainId) {
    this.southAnalysisMainId = southAnalysisMainId;
  }

  public String getSouthAnalysisMainCode() {
    return southAnalysisMainCode;
  }

  public void setSouthAnalysisMainCode(String southAnalysisMainCode) {
    this.southAnalysisMainCode = southAnalysisMainCode;
  }

  public String getSouthAnalysisMainName() {
    return southAnalysisMainName;
  }

  public void setSouthAnalysisMainName(String southAnalysisMainName) {
    this.southAnalysisMainName = southAnalysisMainName;
  }

  public String getSouthAnalysisMainType() {
    return southAnalysisMainType;
  }

  public void setSouthAnalysisMainType(String southAnalysisMainType) {
    this.southAnalysisMainType = southAnalysisMainType;
  }

  public Integer getSouthMessageId() {
    return southMessageId;
  }

  public void setSouthMessageId(Integer southMessageId) {
    this.southMessageId = southMessageId;
  }

  public String getSouthMessageCode() {
    return southMessageCode;
  }

  public void setSouthMessageCode(String southMessageCode) {
    this.southMessageCode = southMessageCode;
  }

  public String getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(String isOpen) {
    this.isOpen = isOpen;
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
