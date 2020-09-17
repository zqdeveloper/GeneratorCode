package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 北向json返回主表
 */
@ApiModel(
    value = "BizNorthAnalysisMain",
    description = "北向json返回主表"
)
public class BizNorthAnalysisMain extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer northAnalysisMainId;

  /**
   * 北向json返回编号
   */
  @ApiModelProperty(
      value = "北向json返回编号",
      required = false
  )
  private String northAnalysisMainCode;

  /**
   * 北向json返回名称
   */
  @ApiModelProperty(
      value = "北向json返回名称",
      required = false
  )
  private String northAnalysisMainName;

  /**
   * 北向接口id
   */
  @ApiModelProperty(
      value = "北向接口id",
      required = false
  )
  private Integer northHttpId;

  /**
   * 北向接口CODE
   */
  @ApiModelProperty(
      value = "北向接口CODE",
      required = false
  )
  private String northHttpCode;

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

  public Integer getNorthAnalysisMainId() {
    return northAnalysisMainId;
  }

  public void setNorthAnalysisMainId(Integer northAnalysisMainId) {
    this.northAnalysisMainId = northAnalysisMainId;
  }

  public String getNorthAnalysisMainCode() {
    return northAnalysisMainCode;
  }

  public void setNorthAnalysisMainCode(String northAnalysisMainCode) {
    this.northAnalysisMainCode = northAnalysisMainCode;
  }

  public String getNorthAnalysisMainName() {
    return northAnalysisMainName;
  }

  public void setNorthAnalysisMainName(String northAnalysisMainName) {
    this.northAnalysisMainName = northAnalysisMainName;
  }

  public Integer getNorthHttpId() {
    return northHttpId;
  }

  public void setNorthHttpId(Integer northHttpId) {
    this.northHttpId = northHttpId;
  }

  public String getNorthHttpCode() {
    return northHttpCode;
  }

  public void setNorthHttpCode(String northHttpCode) {
    this.northHttpCode = northHttpCode;
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
