package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 设备厂家和设备类型关联表
 */
@ApiModel(
    value = "BizDeviceFactroyType",
    description = "设备厂家和设备类型关联表"
)
public class BizDeviceFactroyType extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer deviceFactoryTypeId;

  /**
   * 设备厂家编号
   */
  @ApiModelProperty(
      value = "设备厂家编号",
      required = false
  )
  private String factoryCode;

  /**
   * 设备类型编号
   */
  @ApiModelProperty(
      value = "设备类型编号",
      required = false
  )
  private String typeCode;

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

  public Integer getDeviceFactoryTypeId() {
    return deviceFactoryTypeId;
  }

  public void setDeviceFactoryTypeId(Integer deviceFactoryTypeId) {
    this.deviceFactoryTypeId = deviceFactoryTypeId;
  }

  public String getFactoryCode() {
    return factoryCode;
  }

  public void setFactoryCode(String factoryCode) {
    this.factoryCode = factoryCode;
  }

  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
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
