package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 业务数据表
 */
@ApiModel(
    value = "BizBusinessData",
    description = "业务数据表"
)
public class BizBusinessData extends BaseObject {
  /**
   * 业务数据ID
   */
  @ApiModelProperty(
      value = "业务数据ID",
      required = false
  )
  private Integer businessDataId;

  /**
   * 业务数据名称
   */
  @ApiModelProperty(
      value = "业务数据名称",
      required = false
  )
  private String businessDataName;

  /**
   * 业务数据值
   */
  @ApiModelProperty(
      value = "业务数据值",
      required = true
  )
  private Integer businessDataAmount;

  /**
   * 业务数据排序字段
   */
  @ApiModelProperty(
      value = "业务数据排序字段",
      required = true
  )
  private Integer businessDataOrder;

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

  public Integer getBusinessDataId() {
    return businessDataId;
  }

  public void setBusinessDataId(Integer businessDataId) {
    this.businessDataId = businessDataId;
  }

  public String getBusinessDataName() {
    return businessDataName;
  }

  public void setBusinessDataName(String businessDataName) {
    this.businessDataName = businessDataName;
  }

  public Integer getBusinessDataAmount() {
    return businessDataAmount;
  }

  public void setBusinessDataAmount(Integer businessDataAmount) {
    this.businessDataAmount = businessDataAmount;
  }

  public Integer getBusinessDataOrder() {
    return businessDataOrder;
  }

  public void setBusinessDataOrder(Integer businessDataOrder) {
    this.businessDataOrder = businessDataOrder;
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
