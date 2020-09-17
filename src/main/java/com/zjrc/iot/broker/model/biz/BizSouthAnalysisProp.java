package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 南向具体属性获取表
 */
@ApiModel(
    value = "BizSouthAnalysisProp",
    description = "南向具体属性获取表"
)
public class BizSouthAnalysisProp extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer southAnalysisPropId;

  /**
   * 南向解析主表ID
   */
  @ApiModelProperty(
      value = "南向解析主表ID",
      required = false
  )
  private Integer southAnalysisMainId;

  /**
   * 具体属性主键
   */
  @ApiModelProperty(
      value = "具体属性主键",
      required = false
  )
  private Integer southAnalysisDetailId;

  /**
   * 名称
   */
  @ApiModelProperty(
      value = "名称",
      required = false
  )
  private String southAnalysisPropName;

  /**
   * 数据类型（1：String|2:integer）
   */
  @ApiModelProperty(
      value = "数据类型（1：String|2:integer）",
      required = false
  )
  private String propType;

  /**
   * 具体值
   */
  @ApiModelProperty(
      value = "具体值",
      required = true
  )
  private String propValue;

  /**
   * 是否定时获取 | 1 是 0 否
   */
  @ApiModelProperty(
      value = "是否定时获取 | 1 是 0 否",
      required = true
  )
  private String isScheduler;

  /**
   * CRONZ表达式
   */
  @ApiModelProperty(
      value = "CRONZ表达式",
      required = true
  )
  private String cronz;

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

  public Integer getSouthAnalysisPropId() {
    return southAnalysisPropId;
  }

  public void setSouthAnalysisPropId(Integer southAnalysisPropId) {
    this.southAnalysisPropId = southAnalysisPropId;
  }

  public Integer getSouthAnalysisMainId() {
    return southAnalysisMainId;
  }

  public void setSouthAnalysisMainId(Integer southAnalysisMainId) {
    this.southAnalysisMainId = southAnalysisMainId;
  }

  public Integer getSouthAnalysisDetailId() {
    return southAnalysisDetailId;
  }

  public void setSouthAnalysisDetailId(Integer southAnalysisDetailId) {
    this.southAnalysisDetailId = southAnalysisDetailId;
  }

  public String getSouthAnalysisPropName() {
    return southAnalysisPropName;
  }

  public void setSouthAnalysisPropName(String southAnalysisPropName) {
    this.southAnalysisPropName = southAnalysisPropName;
  }

  public String getPropType() {
    return propType;
  }

  public void setPropType(String propType) {
    this.propType = propType;
  }

  public String getPropValue() {
    return propValue;
  }

  public void setPropValue(String propValue) {
    this.propValue = propValue;
  }

  public String getIsScheduler() {
    return isScheduler;
  }

  public void setIsScheduler(String isScheduler) {
    this.isScheduler = isScheduler;
  }

  public String getCronz() {
    return cronz;
  }

  public void setCronz(String cronz) {
    this.cronz = cronz;
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
