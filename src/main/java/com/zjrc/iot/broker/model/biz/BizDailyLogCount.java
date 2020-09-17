package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 每日日志数量表
 */
@ApiModel(
    value = "BizDailyLogCount",
    description = "每日日志数量表"
)
public class BizDailyLogCount extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer dailyLogCountId;

  /**
   * 日志类型(1:操作日志;2:接口日志)
   */
  @ApiModelProperty(
      value = "日志类型(1:操作日志;2:接口日志)",
      required = false
  )
  private String dailyLogType;

  /**
   * 数量
   */
  @ApiModelProperty(
      value = "数量",
      required = false
  )
  private Integer count;

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

  public Integer getDailyLogCountId() {
    return dailyLogCountId;
  }

  public void setDailyLogCountId(Integer dailyLogCountId) {
    this.dailyLogCountId = dailyLogCountId;
  }

  public String getDailyLogType() {
    return dailyLogType;
  }

  public void setDailyLogType(String dailyLogType) {
    this.dailyLogType = dailyLogType;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
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
