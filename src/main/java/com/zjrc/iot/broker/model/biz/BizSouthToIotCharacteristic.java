package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 南向推送中台数据解析 特征量表
 */
@ApiModel(
    value = "BizSouthToIotCharacteristic",
    description = "南向推送中台数据解析 特征量表"
)
public class BizSouthToIotCharacteristic extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer southToIotCharacteristicId;

  /**
   * 南向推送中台数据解析主表ID
   */
  @ApiModelProperty(
      value = "南向推送中台数据解析主表ID",
      required = false
  )
  private Integer southToIotAnalysisMainId;

  /**
   * 南向推送中台数据解析表ID
   */
  @ApiModelProperty(
      value = "南向推送中台数据解析表ID",
      required = false
  )
  private Integer southToIotAnalysisDetailId;

  /**
   * 具体值
   */
  @ApiModelProperty(
      value = "具体值",
      required = false
  )
  private String characteristicValue;

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

  public Integer getSouthToIotCharacteristicId() {
    return southToIotCharacteristicId;
  }

  public void setSouthToIotCharacteristicId(Integer southToIotCharacteristicId) {
    this.southToIotCharacteristicId = southToIotCharacteristicId;
  }

  public Integer getSouthToIotAnalysisMainId() {
    return southToIotAnalysisMainId;
  }

  public void setSouthToIotAnalysisMainId(Integer southToIotAnalysisMainId) {
    this.southToIotAnalysisMainId = southToIotAnalysisMainId;
  }

  public Integer getSouthToIotAnalysisDetailId() {
    return southToIotAnalysisDetailId;
  }

  public void setSouthToIotAnalysisDetailId(Integer southToIotAnalysisDetailId) {
    this.southToIotAnalysisDetailId = southToIotAnalysisDetailId;
  }

  public String getCharacteristicValue() {
    return characteristicValue;
  }

  public void setCharacteristicValue(String characteristicValue) {
    this.characteristicValue = characteristicValue;
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
