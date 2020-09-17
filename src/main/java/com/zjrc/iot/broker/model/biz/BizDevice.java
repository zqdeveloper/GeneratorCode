package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 设备表
 */
@ApiModel(
    value = "BizDevice",
    description = "设备表"
)
public class BizDevice extends BaseObject {
  /**
   * 设备ID
   */
  @ApiModelProperty(
      value = "设备ID",
      required = false
  )
  private Integer deviceId;

  /**
   * 设备编号
   */
  @ApiModelProperty(
      value = "设备编号",
      required = false
  )
  private String deviceCode;

  /**
   * 设备类型ID
   */
  @ApiModelProperty(
      value = "设备类型ID",
      required = true
  )
  private Integer deviceTypeId;

  /**
   * 设备接入类型(1:第三方平台接入;2:平台直连)
   */
  @ApiModelProperty(
      value = "设备接入类型(1:第三方平台接入;2:平台直连)",
      required = true
  )
  private String deviceAccess;

  /**
   * 设备所属第三方平台ID
   */
  @ApiModelProperty(
      value = "设备所属第三方平台ID",
      required = true
  )
  private Integer thirdPlatfromId;

  /**
   * 设备所属第三方平台编号
   */
  @ApiModelProperty(
      value = "设备所属第三方平台编号",
      required = true
  )
  private String thirdPlatfromCode;

  /**
   * 设备在第三方平台编号
   */
  @ApiModelProperty(
      value = "设备在第三方平台编号",
      required = true
  )
  private String deviceThirdCode;

  /**
   * 设备接入协议编号（当DEVICE_ACCESS为2时填写）
   */
  @ApiModelProperty(
      value = "设备接入协议编号（当DEVICE_ACCESS为2时填写）",
      required = true
  )
  private String deviceAgreemengtCode;

  /**
   * 设备状态（0离线1在线2报警3故障）
   */
  @ApiModelProperty(
      value = "设备状态（0离线1在线2报警3故障）",
      required = true
  )
  private String deviceStatus;

  /**
   * 所属项目编号
   */
  @ApiModelProperty(
      value = "所属项目编号",
      required = true
  )
  private String businessCode;

  /**
   * 最新回传时间
   */
  @ApiModelProperty(
      value = "最新回传时间",
      required = true
  )
  private String lastRecallTime;

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

  public Integer getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }

  public String getDeviceCode() {
    return deviceCode;
  }

  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
  }

  public Integer getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(Integer deviceTypeId) {
    this.deviceTypeId = deviceTypeId;
  }

  public String getDeviceAccess() {
    return deviceAccess;
  }

  public void setDeviceAccess(String deviceAccess) {
    this.deviceAccess = deviceAccess;
  }

  public Integer getThirdPlatfromId() {
    return thirdPlatfromId;
  }

  public void setThirdPlatfromId(Integer thirdPlatfromId) {
    this.thirdPlatfromId = thirdPlatfromId;
  }

  public String getThirdPlatfromCode() {
    return thirdPlatfromCode;
  }

  public void setThirdPlatfromCode(String thirdPlatfromCode) {
    this.thirdPlatfromCode = thirdPlatfromCode;
  }

  public String getDeviceThirdCode() {
    return deviceThirdCode;
  }

  public void setDeviceThirdCode(String deviceThirdCode) {
    this.deviceThirdCode = deviceThirdCode;
  }

  public String getDeviceAgreemengtCode() {
    return deviceAgreemengtCode;
  }

  public void setDeviceAgreemengtCode(String deviceAgreemengtCode) {
    this.deviceAgreemengtCode = deviceAgreemengtCode;
  }

  public String getDeviceStatus() {
    return deviceStatus;
  }

  public void setDeviceStatus(String deviceStatus) {
    this.deviceStatus = deviceStatus;
  }

  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public String getLastRecallTime() {
    return lastRecallTime;
  }

  public void setLastRecallTime(String lastRecallTime) {
    this.lastRecallTime = lastRecallTime;
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
