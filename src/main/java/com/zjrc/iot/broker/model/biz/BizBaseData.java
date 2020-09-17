package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 基础数据表
 */
@ApiModel(
    value = "BizBaseData",
    description = "基础数据表"
)
public class BizBaseData extends BaseObject {
  /**
   * 基础数据ID
   */
  @ApiModelProperty(
      value = "基础数据ID",
      required = false
  )
  private Integer baseDataId;

  /**
   * 业务数据名称
   */
  @ApiModelProperty(
      value = "业务数据名称",
      required = false
  )
  private String baseDataName;

  /**
   * 业务数据占比
   */
  @ApiModelProperty(
      value = "业务数据占比",
      required = true
  )
  private String baseDataRate;

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

  public Integer getBaseDataId() {
    return baseDataId;
  }

  public void setBaseDataId(Integer baseDataId) {
    this.baseDataId = baseDataId;
  }

  public String getBaseDataName() {
    return baseDataName;
  }

  public void setBaseDataName(String baseDataName) {
    this.baseDataName = baseDataName;
  }

  public String getBaseDataRate() {
    return baseDataRate;
  }

  public void setBaseDataRate(String baseDataRate) {
    this.baseDataRate = baseDataRate;
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
