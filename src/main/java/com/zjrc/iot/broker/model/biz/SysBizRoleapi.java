package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 角色接口关联信息表
 */
@ApiModel(
    value = "SysBizRoleapi",
    description = "角色接口关联信息表"
)
public class SysBizRoleapi extends BaseObject {
  /**
   * 角色接口关联ID
   */
  @ApiModelProperty(
      value = "角色接口关联ID",
      required = false
  )
  private Integer roleApiId;

  /**
   * 角色ID
   */
  @ApiModelProperty(
      value = "角色ID",
      required = false
  )
  private Integer roleId;

  /**
   * 接口ID
   */
  @ApiModelProperty(
      value = "接口ID",
      required = false
  )
  private Integer apiId;

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

  public Integer getRoleApiId() {
    return roleApiId;
  }

  public void setRoleApiId(Integer roleApiId) {
    this.roleApiId = roleApiId;
  }

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
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
}
