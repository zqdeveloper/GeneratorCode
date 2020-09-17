package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 南向数据解析表
 */
@ApiModel(
    value = "BizSouthAnalysisDetail",
    description = "南向数据解析表"
)
public class BizSouthAnalysisDetail extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer southAnalysisDetailId;

  /**
   * 南向解析ID
   */
  @ApiModelProperty(
      value = "南向解析ID",
      required = false
  )
  private String southAnalysisMainId;

  /**
   * 解析类型（1：http接口2：MQTT主题|3：tcp协议）
   */
  @ApiModelProperty(
      value = "解析类型（1：http接口2：MQTT主题|3：tcp协议）",
      required = false
  )
  private String southAnalysisType;

  /**
   * JSON类型（1：String|2：integer|3：array|4：object）
   */
  @ApiModelProperty(
      value = "JSON类型（1：String|2：integer|3：array|4：object）",
      required = false
  )
  private String southJsonType;

  /**
   * JSON层级编码
   */
  @ApiModelProperty(
      value = "JSON层级编码",
      required = false
  )
  private String southJsonLevel;

  /**
   * JSON属性名
   */
  @ApiModelProperty(
      value = "JSON属性名",
      required = false
  )
  private String southJsonName;

  /**
   * JSON排序
   */
  @ApiModelProperty(
      value = "JSON排序",
      required = true
  )
  private Integer southJsonOrder;

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

  public Integer getSouthAnalysisDetailId() {
    return southAnalysisDetailId;
  }

  public void setSouthAnalysisDetailId(Integer southAnalysisDetailId) {
    this.southAnalysisDetailId = southAnalysisDetailId;
  }

  public String getSouthAnalysisMainId() {
    return southAnalysisMainId;
  }

  public void setSouthAnalysisMainId(String southAnalysisMainId) {
    this.southAnalysisMainId = southAnalysisMainId;
  }

  public String getSouthAnalysisType() {
    return southAnalysisType;
  }

  public void setSouthAnalysisType(String southAnalysisType) {
    this.southAnalysisType = southAnalysisType;
  }

  public String getSouthJsonType() {
    return southJsonType;
  }

  public void setSouthJsonType(String southJsonType) {
    this.southJsonType = southJsonType;
  }

  public String getSouthJsonLevel() {
    return southJsonLevel;
  }

  public void setSouthJsonLevel(String southJsonLevel) {
    this.southJsonLevel = southJsonLevel;
  }

  public String getSouthJsonName() {
    return southJsonName;
  }

  public void setSouthJsonName(String southJsonName) {
    this.southJsonName = southJsonName;
  }

  public Integer getSouthJsonOrder() {
    return southJsonOrder;
  }

  public void setSouthJsonOrder(Integer southJsonOrder) {
    this.southJsonOrder = southJsonOrder;
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
