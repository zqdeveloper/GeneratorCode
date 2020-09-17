package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 员工在线状态表
 */
@ApiModel(
    value = "SysBizUseronline",
    description = "员工在线状态表"
)
public class SysBizUseronline extends BaseObject {
  /**
   * 在线状态ID
   */
  @ApiModelProperty(
      value = "在线状态ID",
      required = false
  )
  private Integer userOnlineId;

  /**
   * 员工ID
   */
  @ApiModelProperty(
      value = "员工ID",
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
   * 是否在线(1:是,0:否)
   */
  @ApiModelProperty(
      value = "是否在线(1:是,0:否)",
      required = false
  )
  private String onlineStatus;

  /**
   * 登录sessionid
   */
  @ApiModelProperty(
      value = "登录sessionid",
      required = false
  )
  private String sessionId;

  /**
   * 最后在线时间
   */
  @ApiModelProperty(
      value = "最后在线时间",
      required = true
  )
  private String lastOnlineTime;

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

  public Integer getUserOnlineId() {
    return userOnlineId;
  }

  public void setUserOnlineId(Integer userOnlineId) {
    this.userOnlineId = userOnlineId;
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

  public String getOnlineStatus() {
    return onlineStatus;
  }

  public void setOnlineStatus(String onlineStatus) {
    this.onlineStatus = onlineStatus;
  }

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public String getLastOnlineTime() {
    return lastOnlineTime;
  }

  public void setLastOnlineTime(String lastOnlineTime) {
    this.lastOnlineTime = lastOnlineTime;
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
