package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 对接平拍厂商百分比表
 */
@ApiModel(
    value = "BizFactoryPercentage",
    description = "对接平拍厂商百分比表"
)
public class BizFactoryPercentage extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer factoryPercentageId;

  /**
   * 厂商ID
   */
  @ApiModelProperty(
      value = "厂商ID",
      required = true
  )
  private Integer factoryId;

  /**
   * 厂商占比
   */
  @ApiModelProperty(
      value = "厂商占比",
      required = false
  )
  private String factoryPercentage;

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

  public Integer getFactoryPercentageId() {
    return factoryPercentageId;
  }

  public void setFactoryPercentageId(Integer factoryPercentageId) {
    this.factoryPercentageId = factoryPercentageId;
  }

  public Integer getFactoryId() {
    return factoryId;
  }

  public void setFactoryId(Integer factoryId) {
    this.factoryId = factoryId;
  }

  public String getFactoryPercentage() {
    return factoryPercentage;
  }

  public void setFactoryPercentage(String factoryPercentage) {
    this.factoryPercentage = factoryPercentage;
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
