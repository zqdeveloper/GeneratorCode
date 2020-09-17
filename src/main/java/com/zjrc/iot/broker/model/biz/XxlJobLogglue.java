package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "XxlJobLogglue",
    description = ""
)
public class XxlJobLogglue extends BaseObject {
  @ApiModelProperty(
      value = "",
      required = false
  )
  private Integer id;

  /**
   * 任务，主键ID
   */
  @ApiModelProperty(
      value = "任务，主键ID",
      required = false
  )
  private Integer jobId;

  /**
   * GLUE类型
   */
  @ApiModelProperty(
      value = "GLUE类型",
      required = true
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
      required = false
  )
  private String glueRemark;

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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
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
}
