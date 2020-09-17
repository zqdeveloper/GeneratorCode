package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * ip信息表
 */
@ApiModel(
    value = "SysIp",
    description = "ip信息表"
)
public class SysIp extends BaseObject {
  /**
   * ip信息ID
   */
  @ApiModelProperty(
      value = "ip信息ID",
      required = false
  )
  private Integer ipId;

  /**
   * ip地址
   */
  @ApiModelProperty(
      value = "ip地址",
      required = false
  )
  private String ip;

  /**
   * 是否开通(0:否, 1:是)
   */
  @ApiModelProperty(
      value = "是否开通(0:否, 1:是)",
      required = true
  )
  private String openState;

  /**
   * 开通时间
   */
  @ApiModelProperty(
      value = "开通时间",
      required = true
  )
  private String openDate;

  /**
   * 关闭时间
   */
  @ApiModelProperty(
      value = "关闭时间",
      required = true
  )
  private String closeDate;

  /**
   * 关闭类型(与数据字典IP_CLOSE_TYPE关联)
   */
  @ApiModelProperty(
      value = "关闭类型(与数据字典IP_CLOSE_TYPE关联)",
      required = false
  )
  private String closeType;

  /**
   * 创建人员
   */
  @ApiModelProperty(
      value = "创建人员",
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
   * 记录状态
   */
  @ApiModelProperty(
      value = "记录状态",
      required = false
  )
  private String status;

  public Integer getIpId() {
    return ipId;
  }

  public void setIpId(Integer ipId) {
    this.ipId = ipId;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getOpenState() {
    return openState;
  }

  public void setOpenState(String openState) {
    this.openState = openState;
  }

  public String getOpenDate() {
    return openDate;
  }

  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }

  public String getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }

  public String getCloseType() {
    return closeType;
  }

  public void setCloseType(String closeType) {
    this.closeType = closeType;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
