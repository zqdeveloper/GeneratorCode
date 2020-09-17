package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 接口调用成功率趋势表
 */
@ApiModel(
    value = "BizInterfaceSuccessRate",
    description = "接口调用成功率趋势表"
)
public class BizInterfaceSuccessRate extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer interfaceSuccessRateId;

  /**
   * 所属项目编号
   */
  @ApiModelProperty(
      value = "所属项目编号",
      required = true
  )
  private Integer businessId;

  /**
   * 小时
   */
  @ApiModelProperty(
      value = "小时",
      required = false
  )
  private Integer date;

  /**
   * 成功率
   */
  @ApiModelProperty(
      value = "成功率",
      required = false
  )
  private String sucessRate;

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

  public Integer getInterfaceSuccessRateId() {
    return interfaceSuccessRateId;
  }

  public void setInterfaceSuccessRateId(Integer interfaceSuccessRateId) {
    this.interfaceSuccessRateId = interfaceSuccessRateId;
  }

  public Integer getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Integer businessId) {
    this.businessId = businessId;
  }

  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public String getSucessRate() {
    return sucessRate;
  }

  public void setSucessRate(String sucessRate) {
    this.sucessRate = sucessRate;
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
