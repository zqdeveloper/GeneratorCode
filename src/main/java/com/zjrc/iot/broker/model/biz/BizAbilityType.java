package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 能力类型表
 */
@ApiModel(
    value = "BizAbilityType",
    description = "能力类型表"
)
public class BizAbilityType extends BaseObject {
  /**
   * 能力ID
   */
  @ApiModelProperty(
      value = "能力ID",
      required = false
  )
  private Integer abilityTypeId;

  /**
   * 能力类型编号
   */
  @ApiModelProperty(
      value = "能力类型编号",
      required = false
  )
  private String abilityTypeCode;

  /**
   * 能力类型名称
   */
  @ApiModelProperty(
      value = "能力类型名称",
      required = false
  )
  private String abilityTypeName;

  /**
   * 能力介绍
   */
  @ApiModelProperty(
      value = "能力介绍",
      required = true
  )
  private String abilityIntroduce;

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

  public Integer getAbilityTypeId() {
    return abilityTypeId;
  }

  public void setAbilityTypeId(Integer abilityTypeId) {
    this.abilityTypeId = abilityTypeId;
  }

  public String getAbilityTypeCode() {
    return abilityTypeCode;
  }

  public void setAbilityTypeCode(String abilityTypeCode) {
    this.abilityTypeCode = abilityTypeCode;
  }

  public String getAbilityTypeName() {
    return abilityTypeName;
  }

  public void setAbilityTypeName(String abilityTypeName) {
    this.abilityTypeName = abilityTypeName;
  }

  public String getAbilityIntroduce() {
    return abilityIntroduce;
  }

  public void setAbilityIntroduce(String abilityIntroduce) {
    this.abilityIntroduce = abilityIntroduce;
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
