package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 北向json返回配置表
 */
@ApiModel(
    value = "BizNorthAnalysisDetail",
    description = "北向json返回配置表"
)
public class BizNorthAnalysisDetail extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer northAnalysisDetailId;

  /**
   * 北向json返回ID
   */
  @ApiModelProperty(
      value = "北向json返回ID",
      required = false
  )
  private String northAnalysisMainId;

  /**
   * 北向json返回名称
   */
  @ApiModelProperty(
      value = "北向json返回名称",
      required = false
  )
  private String northAnalysisMainName;

  /**
   * JSON类型（1：String|2：integer|3：array|4：object）
   */
  @ApiModelProperty(
      value = "JSON类型（1：String|2：integer|3：array|4：object）",
      required = true
  )
  private String northJsonType;

  /**
   * JSON层级（顶级：0|非顶级：主键ID）
   */
  @ApiModelProperty(
      value = "JSON层级（顶级：0|非顶级：主键ID）",
      required = true
  )
  private String northJsonLevel;

  /**
   * JSON属性名
   */
  @ApiModelProperty(
      value = "JSON属性名",
      required = true
  )
  private String northJsonName;

  /**
   * JSON值类型（1：挂载南向json解析ID|2：String|3：integer）
   */
  @ApiModelProperty(
      value = "JSON值类型（1：挂载南向json解析ID|2：String|3：integer）",
      required = true
  )
  private String northJsonValueType;

  /**
   * 具体值或者南向json解析ID
   */
  @ApiModelProperty(
      value = "具体值或者南向json解析ID",
      required = true
  )
  private String northJsonValue;

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

  public Integer getNorthAnalysisDetailId() {
    return northAnalysisDetailId;
  }

  public void setNorthAnalysisDetailId(Integer northAnalysisDetailId) {
    this.northAnalysisDetailId = northAnalysisDetailId;
  }

  public String getNorthAnalysisMainId() {
    return northAnalysisMainId;
  }

  public void setNorthAnalysisMainId(String northAnalysisMainId) {
    this.northAnalysisMainId = northAnalysisMainId;
  }

  public String getNorthAnalysisMainName() {
    return northAnalysisMainName;
  }

  public void setNorthAnalysisMainName(String northAnalysisMainName) {
    this.northAnalysisMainName = northAnalysisMainName;
  }

  public String getNorthJsonType() {
    return northJsonType;
  }

  public void setNorthJsonType(String northJsonType) {
    this.northJsonType = northJsonType;
  }

  public String getNorthJsonLevel() {
    return northJsonLevel;
  }

  public void setNorthJsonLevel(String northJsonLevel) {
    this.northJsonLevel = northJsonLevel;
  }

  public String getNorthJsonName() {
    return northJsonName;
  }

  public void setNorthJsonName(String northJsonName) {
    this.northJsonName = northJsonName;
  }

  public String getNorthJsonValueType() {
    return northJsonValueType;
  }

  public void setNorthJsonValueType(String northJsonValueType) {
    this.northJsonValueType = northJsonValueType;
  }

  public String getNorthJsonValue() {
    return northJsonValue;
  }

  public void setNorthJsonValue(String northJsonValue) {
    this.northJsonValue = northJsonValue;
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
