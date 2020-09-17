package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "BizHttpCallback",
    description = ""
)
public class BizHttpCallback extends BaseObject {
  /**
   * 对外接口ID
   */
  @ApiModelProperty(
      value = "对外接口ID",
      required = false
  )
  private Integer callbackId;

  /**
   * 上层应用编号
   */
  @ApiModelProperty(
      value = "上层应用编号",
      required = false
  )
  private String appCode;

  /**
   * 回调地址
   */
  @ApiModelProperty(
      value = "回调地址",
      required = false
  )
  private String httpUrl;

  /**
   * 是否启用 | 1 启用 0 停止
   */
  @ApiModelProperty(
      value = "是否启用 | 1 启用 0 停止",
      required = false
  )
  private String isOpen;

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

  public Integer getCallbackId() {
    return callbackId;
  }

  public void setCallbackId(Integer callbackId) {
    this.callbackId = callbackId;
  }

  public String getAppCode() {
    return appCode;
  }

  public void setAppCode(String appCode) {
    this.appCode = appCode;
  }

  public String getHttpUrl() {
    return httpUrl;
  }

  public void setHttpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
  }

  public String getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(String isOpen) {
    this.isOpen = isOpen;
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
