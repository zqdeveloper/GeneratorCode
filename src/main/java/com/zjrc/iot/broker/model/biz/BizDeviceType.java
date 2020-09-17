package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 设备类型信息表
 */
@ApiModel(
    value = "BizDeviceType",
    description = "设备类型信息表"
)
public class BizDeviceType extends BaseObject {
  /**
   * 设备类型ID
   */
  @ApiModelProperty(
      value = "设备类型ID",
      required = false
  )
  private Integer deviceTypeId;

  /**
   * 编号
   */
  @ApiModelProperty(
      value = "编号",
      required = false
  )
  private String deviceTypeCode;

  /**
   * 名称
   */
  @ApiModelProperty(
      value = "名称",
      required = false
  )
  private String deviceTypeName;

  /**
   * 等级编码
   */
  @ApiModelProperty(
      value = "等级编码",
      required = false
  )
  private String deviceTypeLevelCode;

  /**
   * 介绍
   */
  @ApiModelProperty(
      value = "介绍",
      required = true
  )
  private String deviceTypeInfo;

  /**
   * 图片地址
   */
  @ApiModelProperty(
      value = "图片地址",
      required = true
  )
  private String deviceTypeImg;

  /**
   * 适用场景
   */
  @ApiModelProperty(
      value = "适用场景",
      required = true
  )
  private String usageScenarios;

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

  public Integer getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(Integer deviceTypeId) {
    this.deviceTypeId = deviceTypeId;
  }

  public String getDeviceTypeCode() {
    return deviceTypeCode;
  }

  public void setDeviceTypeCode(String deviceTypeCode) {
    this.deviceTypeCode = deviceTypeCode;
  }

  public String getDeviceTypeName() {
    return deviceTypeName;
  }

  public void setDeviceTypeName(String deviceTypeName) {
    this.deviceTypeName = deviceTypeName;
  }

  public String getDeviceTypeLevelCode() {
    return deviceTypeLevelCode;
  }

  public void setDeviceTypeLevelCode(String deviceTypeLevelCode) {
    this.deviceTypeLevelCode = deviceTypeLevelCode;
  }

  public String getDeviceTypeInfo() {
    return deviceTypeInfo;
  }

  public void setDeviceTypeInfo(String deviceTypeInfo) {
    this.deviceTypeInfo = deviceTypeInfo;
  }

  public String getDeviceTypeImg() {
    return deviceTypeImg;
  }

  public void setDeviceTypeImg(String deviceTypeImg) {
    this.deviceTypeImg = deviceTypeImg;
  }

  public String getUsageScenarios() {
    return usageScenarios;
  }

  public void setUsageScenarios(String usageScenarios) {
    this.usageScenarios = usageScenarios;
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
