package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 设备协议表
 */
@ApiModel(
    value = "BizDeviceAgreement",
    description = "设备协议表"
)
public class BizDeviceAgreement extends BaseObject {
  /**
   * 设备协议ID
   */
  @ApiModelProperty(
      value = "设备协议ID",
      required = false
  )
  private Integer agreementId;

  /**
   * 协议编号
   */
  @ApiModelProperty(
      value = "协议编号",
      required = false
  )
  private String agreementCode;

  /**
   * 协议名称
   */
  @ApiModelProperty(
      value = "协议名称",
      required = false
  )
  private String agreementName;

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

  public Integer getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(Integer agreementId) {
    this.agreementId = agreementId;
  }

  public String getAgreementCode() {
    return agreementCode;
  }

  public void setAgreementCode(String agreementCode) {
    this.agreementCode = agreementCode;
  }

  public String getAgreementName() {
    return agreementName;
  }

  public void setAgreementName(String agreementName) {
    this.agreementName = agreementName;
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
