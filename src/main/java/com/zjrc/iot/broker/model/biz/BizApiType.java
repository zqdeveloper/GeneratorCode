package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 接口类型信息表
 */
@ApiModel(
    value = "BizApiType",
    description = "接口类型信息表"
)
public class BizApiType extends BaseObject {
  /**
   * 接口类型ID
   */
  @ApiModelProperty(
      value = "接口类型ID",
      required = false
  )
  private Integer apiTypeId;

  /**
   * 编号
   */
  @ApiModelProperty(
      value = "编号",
      required = false
  )
  private String apiTypeCode;

  /**
   * 名称
   */
  @ApiModelProperty(
      value = "名称",
      required = false
  )
  private String apiTypeName;

  /**
   * 等级编码
   */
  @ApiModelProperty(
      value = "等级编码",
      required = false
  )
  private String apiTypeLevelCode;

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

  public Integer getApiTypeId() {
    return apiTypeId;
  }

  public void setApiTypeId(Integer apiTypeId) {
    this.apiTypeId = apiTypeId;
  }

  public String getApiTypeCode() {
    return apiTypeCode;
  }

  public void setApiTypeCode(String apiTypeCode) {
    this.apiTypeCode = apiTypeCode;
  }

  public String getApiTypeName() {
    return apiTypeName;
  }

  public void setApiTypeName(String apiTypeName) {
    this.apiTypeName = apiTypeName;
  }

  public String getApiTypeLevelCode() {
    return apiTypeLevelCode;
  }

  public void setApiTypeLevelCode(String apiTypeLevelCode) {
    this.apiTypeLevelCode = apiTypeLevelCode;
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
