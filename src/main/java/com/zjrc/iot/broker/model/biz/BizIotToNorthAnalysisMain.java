package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 中台推送北向json返回主表
 */
@ApiModel(
    value = "BizIotToNorthAnalysisMain",
    description = "中台推送北向json返回主表"
)
public class BizIotToNorthAnalysisMain extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer iotToNorthAnalysisMainId;

  /**
   * 北向json返回编号
   */
  @ApiModelProperty(
      value = "北向json返回编号",
      required = false
  )
  private String iotToNorthAnalysisMainCode;

  /**
   * 北向json返回名称
   */
  @ApiModelProperty(
      value = "北向json返回名称",
      required = false
  )
  private String iotToNorthAnalysisMainName;

  /**
   * 南向推送中台ID
   */
  @ApiModelProperty(
      value = "南向推送中台ID",
      required = true
  )
  private Integer southToIotAnalysisMainId;

  /**
   * 上层应用ID
   */
  @ApiModelProperty(
      value = "上层应用ID",
      required = true
  )
  private Integer appId;

  /**
   * 上层应用CODE
   */
  @ApiModelProperty(
      value = "上层应用CODE",
      required = true
  )
  private String appCode;

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

  public Integer getIotToNorthAnalysisMainId() {
    return iotToNorthAnalysisMainId;
  }

  public void setIotToNorthAnalysisMainId(Integer iotToNorthAnalysisMainId) {
    this.iotToNorthAnalysisMainId = iotToNorthAnalysisMainId;
  }

  public String getIotToNorthAnalysisMainCode() {
    return iotToNorthAnalysisMainCode;
  }

  public void setIotToNorthAnalysisMainCode(String iotToNorthAnalysisMainCode) {
    this.iotToNorthAnalysisMainCode = iotToNorthAnalysisMainCode;
  }

  public String getIotToNorthAnalysisMainName() {
    return iotToNorthAnalysisMainName;
  }

  public void setIotToNorthAnalysisMainName(String iotToNorthAnalysisMainName) {
    this.iotToNorthAnalysisMainName = iotToNorthAnalysisMainName;
  }

  public Integer getSouthToIotAnalysisMainId() {
    return southToIotAnalysisMainId;
  }

  public void setSouthToIotAnalysisMainId(Integer southToIotAnalysisMainId) {
    this.southToIotAnalysisMainId = southToIotAnalysisMainId;
  }

  public Integer getAppId() {
    return appId;
  }

  public void setAppId(Integer appId) {
    this.appId = appId;
  }

  public String getAppCode() {
    return appCode;
  }

  public void setAppCode(String appCode) {
    this.appCode = appCode;
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
