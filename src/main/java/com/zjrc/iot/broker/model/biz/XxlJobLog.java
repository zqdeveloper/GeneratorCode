package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "XxlJobLog",
    description = ""
)
public class XxlJobLog extends BaseObject {
  @ApiModelProperty(
      value = "",
      required = false
  )
  private Integer id;

  /**
   * 执行器主键ID
   */
  @ApiModelProperty(
      value = "执行器主键ID",
      required = false
  )
  private Integer jobGroup;

  /**
   * 任务，主键ID
   */
  @ApiModelProperty(
      value = "任务，主键ID",
      required = false
  )
  private Integer jobId;

  /**
   * 执行器地址，本次执行的地址
   */
  @ApiModelProperty(
      value = "执行器地址，本次执行的地址",
      required = true
  )
  private String executorAddress;

  /**
   * 执行器任务handler
   */
  @ApiModelProperty(
      value = "执行器任务handler",
      required = true
  )
  private String executorHandler;

  /**
   * 执行器任务参数
   */
  @ApiModelProperty(
      value = "执行器任务参数",
      required = true
  )
  private String executorParam;

  /**
   * 执行器任务分片参数，格式如 1/2
   */
  @ApiModelProperty(
      value = "执行器任务分片参数，格式如 1/2",
      required = true
  )
  private String executorShardingParam;

  /**
   * 失败重试次数
   */
  @ApiModelProperty(
      value = "失败重试次数",
      required = false
  )
  private Integer executorFailRetryCount;

  /**
   * 调度-时间
   */
  @ApiModelProperty(
      value = "调度-时间",
      required = true
  )
  private String triggerTime;

  /**
   * 调度-结果
   */
  @ApiModelProperty(
      value = "调度-结果",
      required = false
  )
  private Integer triggerCode;

  /**
   * 调度-日志
   */
  @ApiModelProperty(
      value = "调度-日志",
      required = true
  )
  private String triggerMsg;

  /**
   * 执行-时间
   */
  @ApiModelProperty(
      value = "执行-时间",
      required = true
  )
  private String handleTime;

  /**
   * 执行-状态
   */
  @ApiModelProperty(
      value = "执行-状态",
      required = false
  )
  private Integer handleCode;

  /**
   * 执行-日志
   */
  @ApiModelProperty(
      value = "执行-日志",
      required = true
  )
  private String handleMsg;

  /**
   * 告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败
   */
  @ApiModelProperty(
      value = "告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败",
      required = false
  )
  private Integer alarmStatus;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getJobGroup() {
    return jobGroup;
  }

  public void setJobGroup(Integer jobGroup) {
    this.jobGroup = jobGroup;
  }

  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  public String getExecutorAddress() {
    return executorAddress;
  }

  public void setExecutorAddress(String executorAddress) {
    this.executorAddress = executorAddress;
  }

  public String getExecutorHandler() {
    return executorHandler;
  }

  public void setExecutorHandler(String executorHandler) {
    this.executorHandler = executorHandler;
  }

  public String getExecutorParam() {
    return executorParam;
  }

  public void setExecutorParam(String executorParam) {
    this.executorParam = executorParam;
  }

  public String getExecutorShardingParam() {
    return executorShardingParam;
  }

  public void setExecutorShardingParam(String executorShardingParam) {
    this.executorShardingParam = executorShardingParam;
  }

  public Integer getExecutorFailRetryCount() {
    return executorFailRetryCount;
  }

  public void setExecutorFailRetryCount(Integer executorFailRetryCount) {
    this.executorFailRetryCount = executorFailRetryCount;
  }

  public String getTriggerTime() {
    return triggerTime;
  }

  public void setTriggerTime(String triggerTime) {
    this.triggerTime = triggerTime;
  }

  public Integer getTriggerCode() {
    return triggerCode;
  }

  public void setTriggerCode(Integer triggerCode) {
    this.triggerCode = triggerCode;
  }

  public String getTriggerMsg() {
    return triggerMsg;
  }

  public void setTriggerMsg(String triggerMsg) {
    this.triggerMsg = triggerMsg;
  }

  public String getHandleTime() {
    return handleTime;
  }

  public void setHandleTime(String handleTime) {
    this.handleTime = handleTime;
  }

  public Integer getHandleCode() {
    return handleCode;
  }

  public void setHandleCode(Integer handleCode) {
    this.handleCode = handleCode;
  }

  public String getHandleMsg() {
    return handleMsg;
  }

  public void setHandleMsg(String handleMsg) {
    this.handleMsg = handleMsg;
  }

  public Integer getAlarmStatus() {
    return alarmStatus;
  }

  public void setAlarmStatus(Integer alarmStatus) {
    this.alarmStatus = alarmStatus;
  }
}
