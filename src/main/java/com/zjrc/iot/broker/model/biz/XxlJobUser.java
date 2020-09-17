package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "XxlJobUser",
    description = ""
)
public class XxlJobUser extends BaseObject {
  @ApiModelProperty(
      value = "",
      required = false
  )
  private Integer id;

  /**
   * 账号
   */
  @ApiModelProperty(
      value = "账号",
      required = false
  )
  private String username;

  /**
   * 密码
   */
  @ApiModelProperty(
      value = "密码",
      required = false
  )
  private String password;

  /**
   * 角色：0-普通用户、1-管理员
   */
  @ApiModelProperty(
      value = "角色：0-普通用户、1-管理员",
      required = false
  )
  private Integer role;

  /**
   * 权限：执行器ID列表，多个逗号分割
   */
  @ApiModelProperty(
      value = "权限：执行器ID列表，多个逗号分割",
      required = true
  )
  private String permission;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }

  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }
}
