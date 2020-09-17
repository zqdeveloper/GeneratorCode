package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 接口日志表
 */
@ApiModel(
    value = "BizInterfaceLog",
    description = "接口日志表"
)
public class BizInterfaceLog extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer interfaceLogId;

  /**
   * 访问IP地址
   */
  @ApiModelProperty(
      value = "访问IP地址",
      required = true
  )
  private String ip;

  /**
   * 对外接口编号
   */
  @ApiModelProperty(
      value = "对外接口编号",
      required = false
  )
  private String apiCode;

  /**
   * 对外接口名称
   */
  @ApiModelProperty(
      value = "对外接口名称",
      required = false
  )
  private String apiName;

  /**
   * 上层应用ID
   */
  @ApiModelProperty(
      value = "上层应用ID",
      required = false
  )
  private String appId;

  /**
   * 上层应用名称
   */
  @ApiModelProperty(
      value = "上层应用名称",
      required = true
  )
  private String appName;

  /**
   * 是否成功(0:失败;1:成功)
   */
  @ApiModelProperty(
      value = "是否成功(0:失败;1:成功)",
      required = false
  )
  private String isSuccess;

  /**
   * 失败类型
   */
  @ApiModelProperty(
      value = "失败类型",
      required = true
  )
  private String failType;

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

  public Integer getInterfaceLogId() {
    return interfaceLogId;
  }

  public void setInterfaceLogId(Integer interfaceLogId) {
    this.interfaceLogId = interfaceLogId;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getApiCode() {
    return apiCode;
  }

  public void setApiCode(String apiCode) {
    this.apiCode = apiCode;
  }

  public String getApiName() {
    return apiName;
  }

  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(String isSuccess) {
    this.isSuccess = isSuccess;
  }

  public String getFailType() {
    return failType;
  }

  public void setFailType(String failType) {
    this.failType = failType;
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
