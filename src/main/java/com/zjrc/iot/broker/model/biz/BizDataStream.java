package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "BizDataStream",
    description = ""
)
public class BizDataStream extends BaseObject {
  /**
   * 数据流ID
   */
  @ApiModelProperty(
      value = "数据流ID",
      required = false
  )
  private Integer dataStreamId;

  /**
   * 数据流编号
   */
  @ApiModelProperty(
      value = "数据流编号",
      required = false
  )
  private String dataStreamCode;

  /**
   * 数据流名称
   */
  @ApiModelProperty(
      value = "数据流名称",
      required = false
  )
  private String dataStreamName;

  /**
   * 上层应用编号
   */
  @ApiModelProperty(
      value = "上层应用编号",
      required = false
  )
  private String appCode;

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

  public Integer getDataStreamId() {
    return dataStreamId;
  }

  public void setDataStreamId(Integer dataStreamId) {
    this.dataStreamId = dataStreamId;
  }

  public String getDataStreamCode() {
    return dataStreamCode;
  }

  public void setDataStreamCode(String dataStreamCode) {
    this.dataStreamCode = dataStreamCode;
  }

  public String getDataStreamName() {
    return dataStreamName;
  }

  public void setDataStreamName(String dataStreamName) {
    this.dataStreamName = dataStreamName;
  }

  public String getAppCode() {
    return appCode;
  }

  public void setAppCode(String appCode) {
    this.appCode = appCode;
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
