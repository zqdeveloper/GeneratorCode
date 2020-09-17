package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 第三方平台表
 */
@ApiModel(
    value = "BizThirdPlaform",
    description = "第三方平台表"
)
public class BizThirdPlaform extends BaseObject {
  /**
   * 第三方平台ID
   */
  @ApiModelProperty(
      value = "第三方平台ID",
      required = false
  )
  private Integer thirdPlatformId;

  /**
   * 第三方平台CODE
   */
  @ApiModelProperty(
      value = "第三方平台CODE",
      required = false
  )
  private String thirdPlatformCode;

  /**
   * 第三方平台名称
   */
  @ApiModelProperty(
      value = "第三方平台名称",
      required = false
  )
  private String thirdPlatformName;

  /**
   * 平台介绍
   */
  @ApiModelProperty(
      value = "平台介绍",
      required = true
  )
  private String thirdPlatformInfo;

  /**
   * 平台厂商
   */
  @ApiModelProperty(
      value = "平台厂商",
      required = true
  )
  private Integer thirdPlatformFactoryId;

  /**
   * 平台对接设备描述
   */
  @ApiModelProperty(
      value = "平台对接设备描述",
      required = true
  )
  private String deviceDesc;

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

  public Integer getThirdPlatformId() {
    return thirdPlatformId;
  }

  public void setThirdPlatformId(Integer thirdPlatformId) {
    this.thirdPlatformId = thirdPlatformId;
  }

  public String getThirdPlatformCode() {
    return thirdPlatformCode;
  }

  public void setThirdPlatformCode(String thirdPlatformCode) {
    this.thirdPlatformCode = thirdPlatformCode;
  }

  public String getThirdPlatformName() {
    return thirdPlatformName;
  }

  public void setThirdPlatformName(String thirdPlatformName) {
    this.thirdPlatformName = thirdPlatformName;
  }

  public String getThirdPlatformInfo() {
    return thirdPlatformInfo;
  }

  public void setThirdPlatformInfo(String thirdPlatformInfo) {
    this.thirdPlatformInfo = thirdPlatformInfo;
  }

  public Integer getThirdPlatformFactoryId() {
    return thirdPlatformFactoryId;
  }

  public void setThirdPlatformFactoryId(Integer thirdPlatformFactoryId) {
    this.thirdPlatformFactoryId = thirdPlatformFactoryId;
  }

  public String getDeviceDesc() {
    return deviceDesc;
  }

  public void setDeviceDesc(String deviceDesc) {
    this.deviceDesc = deviceDesc;
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
