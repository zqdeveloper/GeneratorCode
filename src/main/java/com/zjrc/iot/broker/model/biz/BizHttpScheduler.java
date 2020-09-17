package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "BizHttpScheduler",
    description = ""
)
public class BizHttpScheduler extends BaseObject {
  /**
   * 定时任务ID
   */
  @ApiModelProperty(
      value = "定时任务ID",
      required = false
  )
  private Integer schedulerId;

  /**
   * 定时任务编号
   */
  @ApiModelProperty(
      value = "定时任务编号",
      required = false
  )
  private String schedulerCode;

  /**
   * 定时任务名称
   */
  @ApiModelProperty(
      value = "定时任务名称",
      required = false
  )
  private String schedulerName;

  /**
   * HTTP任务编号
   */
  @ApiModelProperty(
      value = "HTTP任务编号",
      required = false
  )
  private String httpCode;

  /**
   * 数据流编号
   */
  @ApiModelProperty(
      value = "数据流编号",
      required = false
  )
  private String dataStreamCode;

  /**
   * cronz表达式
   */
  @ApiModelProperty(
      value = "cronz表达式",
      required = false
  )
  private String cronz;

  /**
   * 是否启用 | 1 启用 0 停止
   */
  @ApiModelProperty(
      value = "是否启用 | 1 启用 0 停止",
      required = true
  )
  private String isOpen;

  /**
   * xxl任务Id
   */
  @ApiModelProperty(
      value = "xxl任务Id",
      required = true
  )
  private Integer xxljobId;

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

  public Integer getSchedulerId() {
    return schedulerId;
  }

  public void setSchedulerId(Integer schedulerId) {
    this.schedulerId = schedulerId;
  }

  public String getSchedulerCode() {
    return schedulerCode;
  }

  public void setSchedulerCode(String schedulerCode) {
    this.schedulerCode = schedulerCode;
  }

  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public String getDataStreamCode() {
    return dataStreamCode;
  }

  public void setDataStreamCode(String dataStreamCode) {
    this.dataStreamCode = dataStreamCode;
  }

  public String getCronz() {
    return cronz;
  }

  public void setCronz(String cronz) {
    this.cronz = cronz;
  }

  public String getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(String isOpen) {
    this.isOpen = isOpen;
  }

  public Integer getXxljobId() {
    return xxljobId;
  }

  public void setXxljobId(Integer xxljobId) {
    this.xxljobId = xxljobId;
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
