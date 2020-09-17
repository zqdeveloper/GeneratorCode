package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 用户操作日志表
 */
@ApiModel(
    value = "SysUserlog",
    description = "用户操作日志表"
)
public class SysUserlog extends BaseObject {
  /**
   * 用户操作日志ID
   */
  @ApiModelProperty(
      value = "用户操作日志ID",
      required = false
  )
  private Integer userLogId;

  /**
   * 操作IP
   */
  @ApiModelProperty(
      value = "操作IP",
      required = false
  )
  private String ip;

  /**
   * 是否成功(0:否;1:是)
   */
  @ApiModelProperty(
      value = "是否成功(0:否;1:是)",
      required = true
  )
  private String isSuccess;

  /**
   * 失败操作类型(与数据字典USER_LOG_FAIL_TYPE关联)
   */
  @ApiModelProperty(
      value = "失败操作类型(与数据字典USER_LOG_FAIL_TYPE关联)",
      required = true
  )
  private Integer failType;

  /**
   * 内容
   */
  @ApiModelProperty(
      value = "内容",
      required = true
  )
  private String content;

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
      required = false
  )
  private String createDate;

  /**
   * 状态
   */
  @ApiModelProperty(
      value = "状态",
      required = false
  )
  private String status;

  public Integer getUserLogId() {
    return userLogId;
  }

  public void setUserLogId(Integer userLogId) {
    this.userLogId = userLogId;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(String isSuccess) {
    this.isSuccess = isSuccess;
  }

  public Integer getFailType() {
    return failType;
  }

  public void setFailType(Integer failType) {
    this.failType = failType;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
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
