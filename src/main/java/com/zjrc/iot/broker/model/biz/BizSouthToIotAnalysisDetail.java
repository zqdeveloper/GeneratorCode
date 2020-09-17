package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 南向推送中台数据解析表
 */
@ApiModel(
    value = "BizSouthToIotAnalysisDetail",
    description = "南向推送中台数据解析表"
)
public class BizSouthToIotAnalysisDetail extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer southToIotAnalysisDetailId;

  /**
   * 南向推送中台数据解析主表ID
   */
  @ApiModelProperty(
      value = "南向推送中台数据解析主表ID",
      required = false
  )
  private Integer southToIotAnalysisMainId;

  /**
   * JSON类型（1：String|2：integer|3：array|4：object）
   */
  @ApiModelProperty(
      value = "JSON类型（1：String|2：integer|3：array|4：object）",
      required = false
  )
  private String southToIotJsonType;

  /**
   * JSON层级编码
   */
  @ApiModelProperty(
      value = "JSON层级编码",
      required = false
  )
  private String southToIotJsonLevel;

  /**
   * JSON属性名
   */
  @ApiModelProperty(
      value = "JSON属性名",
      required = false
  )
  private String southToIotJsonName;

  /**
   * JSON排序
   */
  @ApiModelProperty(
      value = "JSON排序",
      required = true
  )
  private Integer southToIotJsonOrder;

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

  public Integer getSouthToIotAnalysisDetailId() {
    return southToIotAnalysisDetailId;
  }

  public void setSouthToIotAnalysisDetailId(Integer southToIotAnalysisDetailId) {
    this.southToIotAnalysisDetailId = southToIotAnalysisDetailId;
  }

  public Integer getSouthToIotAnalysisMainId() {
    return southToIotAnalysisMainId;
  }

  public void setSouthToIotAnalysisMainId(Integer southToIotAnalysisMainId) {
    this.southToIotAnalysisMainId = southToIotAnalysisMainId;
  }

  public String getSouthToIotJsonType() {
    return southToIotJsonType;
  }

  public void setSouthToIotJsonType(String southToIotJsonType) {
    this.southToIotJsonType = southToIotJsonType;
  }

  public String getSouthToIotJsonLevel() {
    return southToIotJsonLevel;
  }

  public void setSouthToIotJsonLevel(String southToIotJsonLevel) {
    this.southToIotJsonLevel = southToIotJsonLevel;
  }

  public String getSouthToIotJsonName() {
    return southToIotJsonName;
  }

  public void setSouthToIotJsonName(String southToIotJsonName) {
    this.southToIotJsonName = southToIotJsonName;
  }

  public Integer getSouthToIotJsonOrder() {
    return southToIotJsonOrder;
  }

  public void setSouthToIotJsonOrder(Integer southToIotJsonOrder) {
    this.southToIotJsonOrder = southToIotJsonOrder;
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
