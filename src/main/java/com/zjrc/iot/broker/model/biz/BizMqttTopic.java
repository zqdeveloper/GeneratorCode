package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * mqtt 主题管理表
 */
@ApiModel(
    value = "BizMqttTopic",
    description = "mqtt 主题管理表"
)
public class BizMqttTopic extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer mqttTopicId;

  /**
   * MQTT主题编号
   */
  @ApiModelProperty(
      value = "MQTT主题编号",
      required = false
  )
  private String mqttTopicCode;

  /**
   * MQTT主题名称
   */
  @ApiModelProperty(
      value = "MQTT主题名称",
      required = false
  )
  private String mqttTopicName;

  /**
   * MQTT主题
   */
  @ApiModelProperty(
      value = "MQTT主题",
      required = false
  )
  private String mqttTopic;

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

  public Integer getMqttTopicId() {
    return mqttTopicId;
  }

  public void setMqttTopicId(Integer mqttTopicId) {
    this.mqttTopicId = mqttTopicId;
  }

  public String getMqttTopicCode() {
    return mqttTopicCode;
  }

  public void setMqttTopicCode(String mqttTopicCode) {
    this.mqttTopicCode = mqttTopicCode;
  }

  public String getMqttTopicName() {
    return mqttTopicName;
  }

  public void setMqttTopicName(String mqttTopicName) {
    this.mqttTopicName = mqttTopicName;
  }

  public String getMqttTopic() {
    return mqttTopic;
  }

  public void setMqttTopic(String mqttTopic) {
    this.mqttTopic = mqttTopic;
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
