package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "XxlJobInfo",
    description = ""
)
public class XxlJobInfo extends BaseObject {
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
   * 任务执行CRON
   */
  @ApiModelProperty(
      value = "任务执行CRON",
      required = false
  )
  private String jobCron;

  @ApiModelProperty(
      value = "",
      required = false
  )
  private String jobDesc;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String addTime;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String updateTime;

  /**
   * 作者
   */
  @ApiModelProperty(
      value = "作者",
      required = true
  )
  private String author;

  /**
   * 报警邮件
   */
  @ApiModelProperty(
      value = "报警邮件",
      required = true
  )
  private String alarmEmail;

  /**
   * 执行器路由策略
   */
  @ApiModelProperty(
      value = "执行器路由策略",
      required = true
  )
  private String executorRouteStrategy;

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
   * 阻塞处理策略
   */
  @ApiModelProperty(
      value = "阻塞处理策略",
      required = true
  )
  private String executorBlockStrategy;

  /**
   * 任务执行超时时间，单位秒
   */
  @ApiModelProperty(
      value = "任务执行超时时间，单位秒",
      required = false
  )
  private Integer executorTimeout;

  /**
   * 失败重试次数
   */
  @ApiModelProperty(
      value = "失败重试次数",
      required = false
  )
  private Integer executorFailRetryCount;

  /**
   * GLUE类型
   */
  @ApiModelProperty(
      value = "GLUE类型",
      required = false
  )
  private String glueType;

  /**
   * GLUE源代码
   */
  @ApiModelProperty(
      value = "GLUE源代码",
      required = true
  )
  private String glueSource;

  /**
   * GLUE备注
   */
  @ApiModelProperty(
      value = "GLUE备注",
      required = true
  )
  private String glueRemark;

  /**
   * GLUE更新时间
   */
  @ApiModelProperty(
      value = "GLUE更新时间",
      required = true
  )
  private String glueUpdatetime;

  /**
   * 子任务ID，多个逗号分隔
   */
  @ApiModelProperty(
      value = "子任务ID，多个逗号分隔",
      required = true
  )
  private String childJobid;

  /**
   * 调度状态：0-停止，1-运行
   */
  @ApiModelProperty(
      value = "调度状态：0-停止，1-运行",
      required = false
  )
  private Integer triggerStatus;

  /**
   * 上次调度时间
   */
  @ApiModelProperty(
      value = "上次调度时间",
      required = false
  )
  private Integer triggerLastTime;

  /**
   * 下次调度时间
   */
  @ApiModelProperty(
      value = "下次调度时间",
      required = false
  )
  private Integer triggerNextTime;

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

  public String getJobCron() {
    return jobCron;
  }

  public void setJobCron(String jobCron) {
    this.jobCron = jobCron;
  }

  public String getJobDesc() {
    return jobDesc;
  }

  public void setJobDesc(String jobDesc) {
    this.jobDesc = jobDesc;
  }

  public String getAddTime() {
    return addTime;
  }

  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAlarmEmail() {
    return alarmEmail;
  }

  public void setAlarmEmail(String alarmEmail) {
    this.alarmEmail = alarmEmail;
  }

  public String getExecutorRouteStrategy() {
    return executorRouteStrategy;
  }

  public void setExecutorRouteStrategy(String executorRouteStrategy) {
    this.executorRouteStrategy = executorRouteStrategy;
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

  public String getExecutorBlockStrategy() {
    return executorBlockStrategy;
  }

  public void setExecutorBlockStrategy(String executorBlockStrategy) {
    this.executorBlockStrategy = executorBlockStrategy;
  }

  public Integer getExecutorTimeout() {
    return executorTimeout;
  }

  public void setExecutorTimeout(Integer executorTimeout) {
    this.executorTimeout = executorTimeout;
  }

  public Integer getExecutorFailRetryCount() {
    return executorFailRetryCount;
  }

  public void setExecutorFailRetryCount(Integer executorFailRetryCount) {
    this.executorFailRetryCount = executorFailRetryCount;
  }

  public String getGlueType() {
    return glueType;
  }

  public void setGlueType(String glueType) {
    this.glueType = glueType;
  }

  public String getGlueSource() {
    return glueSource;
  }

  public void setGlueSource(String glueSource) {
    this.glueSource = glueSource;
  }

  public String getGlueRemark() {
    return glueRemark;
  }

  public void setGlueRemark(String glueRemark) {
    this.glueRemark = glueRemark;
  }

  public String getGlueUpdatetime() {
    return glueUpdatetime;
  }

  public void setGlueUpdatetime(String glueUpdatetime) {
    this.glueUpdatetime = glueUpdatetime;
  }

  public String getChildJobid() {
    return childJobid;
  }

  public void setChildJobid(String childJobid) {
    this.childJobid = childJobid;
  }

  public Integer getTriggerStatus() {
    return triggerStatus;
  }

  public void setTriggerStatus(Integer triggerStatus) {
    this.triggerStatus = triggerStatus;
  }

  public Integer getTriggerLastTime() {
    return triggerLastTime;
  }

  public void setTriggerLastTime(Integer triggerLastTime) {
    this.triggerLastTime = triggerLastTime;
  }

  public Integer getTriggerNextTime() {
    return triggerNextTime;
  }

  public void setTriggerNextTime(Integer triggerNextTime) {
    this.triggerNextTime = triggerNextTime;
  }
}
