package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 设备厂家表
 */
@ApiModel(
    value = "BizDeviceFactroy",
    description = "设备厂家表"
)
public class BizDeviceFactroy extends BaseObject {
  /**
   * 设备厂家ID
   */
  @ApiModelProperty(
      value = "设备厂家ID",
      required = false
  )
  private Integer deviceFactoryId;

  /**
   * 厂家编号
   */
  @ApiModelProperty(
      value = "厂家编号",
      required = false
  )
  private String deviceFactoryCode;

  /**
   * 厂家名称
   */
  @ApiModelProperty(
      value = "厂家名称",
      required = false
  )
  private String deviceFactoryName;

  /**
   * 位置经度
   */
  @ApiModelProperty(
      value = "位置经度",
      required = true
  )
  private String longitude;

  /**
   * 位置纬度
   */
  @ApiModelProperty(
      value = "位置纬度",
      required = true
  )
  private String latitude;

  /**
   * 地址
   */
  @ApiModelProperty(
      value = "地址",
      required = true
  )
  private String address;

  /**
   * 厂家负责人
   */
  @ApiModelProperty(
      value = "厂家负责人",
      required = true
  )
  private String factoryOwner;

  /**
   * 联系电话
   */
  @ApiModelProperty(
      value = "联系电话",
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

  public Integer getDeviceFactoryId() {
    return deviceFactoryId;
  }

  public void setDeviceFactoryId(Integer deviceFactoryId) {
    this.deviceFactoryId = deviceFactoryId;
  }

  public String getDeviceFactoryCode() {
    return deviceFactoryCode;
  }

  public void setDeviceFactoryCode(String deviceFactoryCode) {
    this.deviceFactoryCode = deviceFactoryCode;
  }

  public String getDeviceFactoryName() {
    return deviceFactoryName;
  }

  public void setDeviceFactoryName(String deviceFactoryName) {
    this.deviceFactoryName = deviceFactoryName;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getFactoryOwner() {
    return factoryOwner;
  }

  public void setFactoryOwner(String factoryOwner) {
    this.factoryOwner = factoryOwner;
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
