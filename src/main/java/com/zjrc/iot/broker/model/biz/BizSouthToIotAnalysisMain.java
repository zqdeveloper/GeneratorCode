package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 南向推送中台数据解析主表
 */
@ApiModel(
    value = "BizSouthToIotAnalysisMain",
    description = "南向推送中台数据解析主表"
)
public class BizSouthToIotAnalysisMain extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer southToIotAnalysisMainId;

  /**
   * 南向解析编号
   */
  @ApiModelProperty(
      value = "南向解析编号",
      required = false
  )
  private String southToIotAnalysisMainCode;

  /**
   * 南向解析名称
   */
  @ApiModelProperty(
      value = "南向解析名称",
      required = false
  )
  private String southToIotAnalysisMainName;

  /**
   * 解析类型（1：推送地址|2：MQTT主题）
   */
  @ApiModelProperty(
      value = "解析类型（1：推送地址|2：MQTT主题）",
      required = false
  )
  private String southToIotAnalysisMainType;

  /**
   * 推送地址/MQTT主题
   */
  @ApiModelProperty(
      value = "推送地址/MQTT主题",
      required = false
  )
  private Integer southToNorthMessageId;

  /**
   * 推送地址 CODE/MQTT主题CODE
   */
  @ApiModelProperty(
      value = "推送地址 CODE/MQTT主题CODE",
      required = true
  )
  private String southToNorthMessageCode;

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

  public Integer getSouthToIotAnalysisMainId() {
    return southToIotAnalysisMainId;
  }

  public void setSouthToIotAnalysisMainId(Integer southToIotAnalysisMainId) {
    this.southToIotAnalysisMainId = southToIotAnalysisMainId;
  }

  public String getSouthToIotAnalysisMainCode() {
    return southToIotAnalysisMainCode;
  }

  public void setSouthToIotAnalysisMainCode(String southToIotAnalysisMainCode) {
    this.southToIotAnalysisMainCode = southToIotAnalysisMainCode;
  }

  public String getSouthToIotAnalysisMainName() {
    return southToIotAnalysisMainName;
  }

  public void setSouthToIotAnalysisMainName(String southToIotAnalysisMainName) {
    this.southToIotAnalysisMainName = southToIotAnalysisMainName;
  }

  public String getSouthToIotAnalysisMainType() {
    return southToIotAnalysisMainType;
  }

  public void setSouthToIotAnalysisMainType(String southToIotAnalysisMainType) {
    this.southToIotAnalysisMainType = southToIotAnalysisMainType;
  }

  public Integer getSouthToNorthMessageId() {
    return southToNorthMessageId;
  }

  public void setSouthToNorthMessageId(Integer southToNorthMessageId) {
    this.southToNorthMessageId = southToNorthMessageId;
  }

  public String getSouthToNorthMessageCode() {
    return southToNorthMessageCode;
  }

  public void setSouthToNorthMessageCode(String southToNorthMessageCode) {
    this.southToNorthMessageCode = southToNorthMessageCode;
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
