package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "XxlJobLogReport",
    description = ""
)
public class XxlJobLogReport extends BaseObject {
  @ApiModelProperty(
      value = "",
      required = false
  )
  private Integer id;

  /**
   * 调度-时间
   */
  @ApiModelProperty(
      value = "调度-时间",
      required = true
  )
  private String triggerDay;

  /**
   * 运行中-日志数量
   */
  @ApiModelProperty(
      value = "运行中-日志数量",
      required = false
  )
  private Integer runningCount;

  /**
   * 执行成功-日志数量
   */
  @ApiModelProperty(
      value = "执行成功-日志数量",
      required = false
  )
  private Integer sucCount;

  /**
   * 执行失败-日志数量
   */
  @ApiModelProperty(
      value = "执行失败-日志数量",
      required = false
  )
  private Integer failCount;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTriggerDay() {
    return triggerDay;
  }

  public void setTriggerDay(String triggerDay) {
    this.triggerDay = triggerDay;
  }

  public Integer getRunningCount() {
    return runningCount;
  }

  public void setRunningCount(Integer runningCount) {
    this.runningCount = runningCount;
  }

  public Integer getSucCount() {
    return sucCount;
  }

  public void setSucCount(Integer sucCount) {
    this.sucCount = sucCount;
  }

  public Integer getFailCount() {
    return failCount;
  }

  public void setFailCount(Integer failCount) {
    this.failCount = failCount;
  }
}
