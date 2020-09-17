package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 用户信息表
 */
@ApiModel(
    value = "SysBizUser",
    description = "用户信息表"
)
public class SysBizUser extends BaseObject {
  /**
   * 用户ID
   */
  @ApiModelProperty(
      value = "用户ID",
      required = false
  )
  private Integer userId;

  /**
   * 所属部门ID
   */
  @ApiModelProperty(
      value = "所属部门ID",
      required = false
  )
  private Integer deptId;

  /**
   * 用户编号
   */
  @ApiModelProperty(
      value = "用户编号",
      required = false
  )
  private String userCode;

  /**
   * 员工登录账号
   */
  @ApiModelProperty(
      value = "员工登录账号",
      required = false
  )
  private String loginName;

  /**
   * 员工登录密码
   */
  @ApiModelProperty(
      value = "员工登录密码",
      required = false
  )
  private String password;

  /**
   * 员工姓名
   */
  @ApiModelProperty(
      value = "员工姓名",
      required = false
  )
  private String userName;

  /**
   * 员工中文拼音名称
   */
  @ApiModelProperty(
      value = "员工中文拼音名称",
      required = false
  )
  private String pinyinName;

  /**
   * 性别(与数据字典USER_SEX关联)
   */
  @ApiModelProperty(
      value = "性别(与数据字典USER_SEX关联)",
      required = false
  )
  private String sex;

  /**
   * 手机号码
   */
  @ApiModelProperty(
      value = "手机号码",
      required = true
  )
  private String mobile;

  /**
   * 电子邮箱
   */
  @ApiModelProperty(
      value = "电子邮箱",
      required = true
  )
  private String email;

  /**
   * 头像文件URL
   */
  @ApiModelProperty(
      value = "头像文件URL",
      required = true
  )
  private String photoFileUrl;

  /**
   * 修改密码时间
   */
  @ApiModelProperty(
      value = "修改密码时间",
      required = true
  )
  private String modPassDate;

  /**
   * 是否开通(0:否, 1:是)
   */
  @ApiModelProperty(
      value = "是否开通(0:否, 1:是)",
      required = true
  )
  private String openState;

  /**
   * 开通时间
   */
  @ApiModelProperty(
      value = "开通时间",
      required = true
  )
  private String openDate;

  /**
   * 关闭时间
   */
  @ApiModelProperty(
      value = "关闭时间",
      required = true
  )
  private String closeDate;

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

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPinyinName() {
    return pinyinName;
  }

  public void setPinyinName(String pinyinName) {
    this.pinyinName = pinyinName;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhotoFileUrl() {
    return photoFileUrl;
  }

  public void setPhotoFileUrl(String photoFileUrl) {
    this.photoFileUrl = photoFileUrl;
  }

  public String getModPassDate() {
    return modPassDate;
  }

  public void setModPassDate(String modPassDate) {
    this.modPassDate = modPassDate;
  }

  public String getOpenState() {
    return openState;
  }

  public void setOpenState(String openState) {
    this.openState = openState;
  }

  public String getOpenDate() {
    return openDate;
  }

  public void setOpenDate(String openDate) {
    this.openDate = openDate;
  }

  public String getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
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
