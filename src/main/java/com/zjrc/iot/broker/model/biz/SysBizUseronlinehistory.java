package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 员工在线历史记录表
 */
@ApiModel(
    value = "SysBizUseronlinehistory",
    description = "员工在线历史记录表"
)
public class SysBizUseronlinehistory extends BaseObject {
  /**
   * 在线历史ID
   */
  @ApiModelProperty(
      value = "在线历史ID",
      required = false
  )
  private Integer userOnlinehistoryId;

  /**
   * 企业员工ID
   */
  @ApiModelProperty(
      value = "企业员工ID",
      required = false
  )
  private Integer userId;

  /**
   * 设备类型(0:android;1:ios;2:web)
   */
  @ApiModelProperty(
      value = "设备类型(0:android;1:ios;2:web)",
      required = false
  )
  private String deviceType;

  /**
   * 在线时间
   */
  @ApiModelProperty(
      value = "在线时间",
      required = false
  )
  private String onlineTime;

  /**
   * ip地址
   */
  @ApiModelProperty(
      value = "ip地址",
      required = false
  )
  private String ip;

  /**
   * 状态
   */
  @ApiModelProperty(
      value = "状态",
      required = false
  )
  private String status;

  public Integer getUserOnlinehistoryId() {
    return userOnlinehistoryId;
  }

  public void setUserOnlinehistoryId(Integer userOnlinehistoryId) {
    this.userOnlinehistoryId = userOnlinehistoryId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getOnlineTime() {
    return onlineTime;
  }

  public void setOnlineTime(String onlineTime) {
    this.onlineTime = onlineTime;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
