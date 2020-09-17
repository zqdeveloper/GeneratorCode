package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 对接设备类型 对应数量表
 */
@ApiModel(
    value = "BizDeviceTypeCount",
    description = "对接设备类型 对应数量表"
)
public class BizDeviceTypeCount extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer deviceTypeCountId;

  /**
   * 设备类型编号
   */
  @ApiModelProperty(
      value = "设备类型编号",
      required = true
  )
  private String deviceTypeCode;

  /**
   * 设备类型占比
   */
  @ApiModelProperty(
      value = "设备类型占比",
      required = false
  )
  private String deviceOnlineCount;

  /**
   * 创建人员ID
   */
  @ApiModelProperty(
      value = "创建人员ID",
      required = true
  )
  private Integer deviceOfflineCount;

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

  public Integer getDeviceTypeCountId() {
    return deviceTypeCountId;
  }

  public void setDeviceTypeCountId(Integer deviceTypeCountId) {
    this.deviceTypeCountId = deviceTypeCountId;
  }

  public String getDeviceTypeCode() {
    return deviceTypeCode;
  }

  public void setDeviceTypeCode(String deviceTypeCode) {
    this.deviceTypeCode = deviceTypeCode;
  }

  public String getDeviceOnlineCount() {
    return deviceOnlineCount;
  }

  public void setDeviceOnlineCount(String deviceOnlineCount) {
    this.deviceOnlineCount = deviceOnlineCount;
  }

  public Integer getDeviceOfflineCount() {
    return deviceOfflineCount;
  }

  public void setDeviceOfflineCount(Integer deviceOfflineCount) {
    this.deviceOfflineCount = deviceOfflineCount;
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
