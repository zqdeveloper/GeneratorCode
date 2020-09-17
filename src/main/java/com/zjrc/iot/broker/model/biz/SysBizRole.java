package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 角色信息表
 */
@ApiModel(
    value = "SysBizRole",
    description = "角色信息表"
)
public class SysBizRole extends BaseObject {
  /**
   * 角色ID
   */
  @ApiModelProperty(
      value = "角色ID",
      required = false
  )
  private Integer roleId;

  /**
   * 编号
   */
  @ApiModelProperty(
      value = "编号",
      required = true
  )
  private String roleCode;

  /**
   * 名称
   */
  @ApiModelProperty(
      value = "名称",
      required = false
  )
  private String roleName;

  /**
   * 是否开通(0:否,1:是)
   */
  @ApiModelProperty(
      value = "是否开通(0:否,1:是)",
      required = true
  )
  private String openState;

  /**
   * 关闭时间
   */
  @ApiModelProperty(
      value = "关闭时间",
      required = true
  )
  private String closeDate;

  /**
   * 开通时间
   */
  @ApiModelProperty(
      value = "开通时间",
      required = true
  )
  private String openDate;

  /**
   * 数据范围(与数据字典ROLE_DATA_SCOPE关联)
   */
  @ApiModelProperty(
      value = "数据范围(与数据字典ROLE_DATA_SCOPE关联)",
      required = false
  )
  private String dataScope;

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

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getOpenState() {
    return openState;
  }

  public void setOpenState(String openState) {
    this.openState = openState;
  }

  public String getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }

  public String getOpenDate() {
    return openDate;
  }

  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }

  public String getDataScope() {
    return dataScope;
  }

  public void setDataScope(String dataScope) {
    this.dataScope = dataScope;
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
