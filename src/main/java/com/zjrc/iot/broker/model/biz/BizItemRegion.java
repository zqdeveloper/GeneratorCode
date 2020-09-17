package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 指标地区关联表
 */
@ApiModel(
    value = "BizItemRegion",
    description = "指标地区关联表"
)
public class BizItemRegion extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer itemRegionId;

  /**
   * 区域父级
   */
  @ApiModelProperty(
      value = "区域父级",
      required = false
  )
  private Integer parentRegionId;

  /**
   * 区域ID
   */
  @ApiModelProperty(
      value = "区域ID",
      required = false
  )
  private Integer regionId;

  /**
   * 对接项目数量
   */
  @ApiModelProperty(
      value = "对接项目数量",
      required = false
  )
  private Integer businessAmount;

  /**
   * 对接硬件数量
   */
  @ApiModelProperty(
      value = "对接硬件数量",
      required = false
  )
  private Integer deviceAmount;

  /**
   * 今日接口访问数量
   */
  @ApiModelProperty(
      value = "今日接口访问数量",
      required = false
  )
  private Integer interfaceAccessAmount;

  /**
   * 今日数据增加量
   */
  @ApiModelProperty(
      value = "今日数据增加量",
      required = false
  )
  private Integer increaceDataAmount;

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

  public Integer getItemRegionId() {
    return itemRegionId;
  }

  public void setItemRegionId(Integer itemRegionId) {
    this.itemRegionId = itemRegionId;
  }

  public Integer getParentRegionId() {
    return parentRegionId;
  }

  public void setParentRegionId(Integer parentRegionId) {
    this.parentRegionId = parentRegionId;
  }

  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public Integer getBusinessAmount() {
    return businessAmount;
  }

  public void setBusinessAmount(Integer businessAmount) {
    this.businessAmount = businessAmount;
  }

  public Integer getDeviceAmount() {
    return deviceAmount;
  }

  public void setDeviceAmount(Integer deviceAmount) {
    this.deviceAmount = deviceAmount;
  }

  public Integer getInterfaceAccessAmount() {
    return interfaceAccessAmount;
  }

  public void setInterfaceAccessAmount(Integer interfaceAccessAmount) {
    this.interfaceAccessAmount = interfaceAccessAmount;
  }

  public Integer getIncreaceDataAmount() {
    return increaceDataAmount;
  }

  public void setIncreaceDataAmount(Integer increaceDataAmount) {
    this.increaceDataAmount = increaceDataAmount;
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
