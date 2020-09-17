package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 中台推送北向json返回配置表
 */
@ApiModel(
    value = "BizIotToNorthAnalysisDetail",
    description = "中台推送北向json返回配置表"
)
public class BizIotToNorthAnalysisDetail extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer iotToNorthAnalysisDetailId;

  /**
   * 北向json返回ID
   */
  @ApiModelProperty(
      value = "北向json返回ID",
      required = false
  )
  private Integer iotToNorthAnalysisMainId;

  /**
   * JSON类型（1：String|2：integer|3：array|4：object）
   */
  @ApiModelProperty(
      value = "JSON类型（1：String|2：integer|3：array|4：object）",
      required = true
  )
  private String iotToNorthJsonType;

  /**
   * JSON层级（顶级：0|非顶级：主键ID）
   */
  @ApiModelProperty(
      value = "JSON层级（顶级：0|非顶级：主键ID）",
      required = true
  )
  private String iotToNorthJsonLevel;

  /**
   * JSON属性名
   */
  @ApiModelProperty(
      value = "JSON属性名",
      required = true
  )
  private String iotToNorthJsonName;

  /**
   * JSON值类型（1：挂载南向json解析ID|2：String|3：integer）
   */
  @ApiModelProperty(
      value = "JSON值类型（1：挂载南向json解析ID|2：String|3：integer）",
      required = true
  )
  private String iotToNorthJsonValueType;

  /**
   * 具体值或者南向json解析ID
   */
  @ApiModelProperty(
      value = "具体值或者南向json解析ID",
      required = true
  )
  private String iotToNorthJsonValue;

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

  public Integer getIotToNorthAnalysisDetailId() {
    return iotToNorthAnalysisDetailId;
  }

  public void setIotToNorthAnalysisDetailId(Integer iotToNorthAnalysisDetailId) {
    this.iotToNorthAnalysisDetailId = iotToNorthAnalysisDetailId;
  }

  public Integer getIotToNorthAnalysisMainId() {
    return iotToNorthAnalysisMainId;
  }

  public void setIotToNorthAnalysisMainId(Integer iotToNorthAnalysisMainId) {
    this.iotToNorthAnalysisMainId = iotToNorthAnalysisMainId;
  }

  public String getIotToNorthJsonType() {
    return iotToNorthJsonType;
  }

  public void setIotToNorthJsonType(String iotToNorthJsonType) {
    this.iotToNorthJsonType = iotToNorthJsonType;
  }

  public String getIotToNorthJsonLevel() {
    return iotToNorthJsonLevel;
  }

  public void setIotToNorthJsonLevel(String iotToNorthJsonLevel) {
    this.iotToNorthJsonLevel = iotToNorthJsonLevel;
  }

  public String getIotToNorthJsonName() {
    return iotToNorthJsonName;
  }

  public void setIotToNorthJsonName(String iotToNorthJsonName) {
    this.iotToNorthJsonName = iotToNorthJsonName;
  }

  public String getIotToNorthJsonValueType() {
    return iotToNorthJsonValueType;
  }

  public void setIotToNorthJsonValueType(String iotToNorthJsonValueType) {
    this.iotToNorthJsonValueType = iotToNorthJsonValueType;
  }

  public String getIotToNorthJsonValue() {
    return iotToNorthJsonValue;
  }

  public void setIotToNorthJsonValue(String iotToNorthJsonValue) {
    this.iotToNorthJsonValue = iotToNorthJsonValue;
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
