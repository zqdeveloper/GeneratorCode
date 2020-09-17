package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 数据字典表
 */
@ApiModel(
    value = "SysParam",
    description = "数据字典表"
)
public class SysParam extends BaseObject {
  /**
   * 数据字典ID
   */
  @ApiModelProperty(
      value = "数据字典ID",
      required = false
  )
  private Integer sysParamId;

  /**
   * 关键字类别
   */
  @ApiModelProperty(
      value = "关键字类别",
      required = false
  )
  private String paramType;

  /**
   * 关键字ID
   */
  @ApiModelProperty(
      value = "关键字ID",
      required = false
  )
  private String paramId;

  /**
   * 关键字值
   */
  @ApiModelProperty(
      value = "关键字值",
      required = false
  )
  private String paramValue;

  /**
   * 关键字次序
   */
  @ApiModelProperty(
      value = "关键字次序",
      required = false
  )
  private Integer paramIndex;

  /**
   * 父节点ID(默认值为0)
   */
  @ApiModelProperty(
      value = "父节点ID(默认值为0)",
      required = false
  )
  private Integer parentId;

  /**
   * 创建人员
   */
  @ApiModelProperty(
      value = "创建人员",
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
   * 修改人员
   */
  @ApiModelProperty(
      value = "修改人员",
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

  public Integer getSysParamId() {
    return sysParamId;
  }

  public void setSysParamId(Integer sysParamId) {
    this.sysParamId = sysParamId;
  }

  public String getParamType() {
    return paramType;
  }

  public void setParamType(String paramType) {
    this.paramType = paramType;
  }

  public String getParamId() {
    return paramId;
  }

  public void setParamId(String paramId) {
    this.paramId = paramId;
  }

  public String getParamValue() {
    return paramValue;
  }

  public void setParamValue(String paramValue) {
    this.paramValue = paramValue;
  }

  public Integer getParamIndex() {
    return paramIndex;
  }

  public void setParamIndex(Integer paramIndex) {
    this.paramIndex = paramIndex;
  }

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
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
