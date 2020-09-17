package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 设备信息表
 */
@ApiModel(
    value = "BizDeviceInfo",
    description = "设备信息表"
)
public class BizDeviceInfo extends BaseObject {
  /**
   * 设备信息ID
   */
  @ApiModelProperty(
      value = "设备信息ID",
      required = false
  )
  private Integer deviceInfoId;

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
   * 设备名称
   */
  @ApiModelProperty(
      value = "设备名称",
      required = true
  )
  private String deviceName;

  /**
   * 设备型号
   */
  @ApiModelProperty(
      value = "设备型号",
      required = true
  )
  private String deviceModel;

  /**
   * 设备IMEI
   */
  @ApiModelProperty(
      value = "设备IMEI",
      required = true
  )
  private String deviceImei;

  /**
   * 设备SN
   */
  @ApiModelProperty(
      value = "设备SN",
      required = true
  )
  private String deviceSn;

  /**
   * 设备DOID
   */
  @ApiModelProperty(
      value = "设备DOID",
      required = true
  )
  private String deviceOnlyId;

  /**
   * 设备厂家编码
   */
  @ApiModelProperty(
      value = "设备厂家编码",
      required = true
  )
  private String deviceFactoryCode;

  /**
   * 最后回传时间
   */
  @ApiModelProperty(
      value = "最后回传时间",
      required = true
  )
  private String lastRecallTime;

  /**
   * 设备所在位置
   */
  @ApiModelProperty(
      value = "设备所在位置",
      required = true
  )
  private String address;

  /**
   * 经度
   */
  @ApiModelProperty(
      value = "经度",
      required = true
  )
  private String longitude;

  /**
   * 纬度
   */
  @ApiModelProperty(
      value = "纬度",
      required = true
  )
  private String latitude;

  /**
   * 区域ID
   */
  @ApiModelProperty(
      value = "区域ID",
      required = true
  )
  private Integer regionId;

  /**
   * 设备所属人
   */
  @ApiModelProperty(
      value = "设备所属人",
      required = true
  )
  private String deviceOwner;

  /**
   * 所属人联系电话
   */
  @ApiModelProperty(
      value = "所属人联系电话",
      required = true
  )
  private String ownerPhone;

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

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

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

  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public String getDeviceImei() {
    return deviceImei;
  }

  public void setDeviceImei(String deviceImei) {
    this.deviceImei = deviceImei;
  }

  public String getDeviceSn() {
    return deviceSn;
  }

  public void setDeviceSn(String deviceSn) {
    this.deviceSn = deviceSn;
  }

  public String getDeviceOnlyId() {
    return deviceOnlyId;
  }

  public void setDeviceOnlyId(String deviceOnlyId) {
    this.deviceOnlyId = deviceOnlyId;
  }

  public String getDeviceFactoryCode() {
    return deviceFactoryCode;
  }

  public void setDeviceFactoryCode(String deviceFactoryCode) {
    this.deviceFactoryCode = deviceFactoryCode;
  }

  public String getLastRecallTime() {
    return lastRecallTime;
  }

  public void setLastRecallTime(String lastRecallTime) {
    this.lastRecallTime = lastRecallTime;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public String getDeviceOwner() {
    return deviceOwner;
  }

  public void setDeviceOwner(String deviceOwner) {
    this.deviceOwner = deviceOwner;
  }

  public String getOwnerPhone() {
    return ownerPhone;
  }

  public void setOwnerPhone(String ownerPhone) {
    this.ownerPhone = ownerPhone;
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
