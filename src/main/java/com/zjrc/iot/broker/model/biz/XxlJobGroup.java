package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "XxlJobGroup",
    description = ""
)
public class XxlJobGroup extends BaseObject {
  @ApiModelProperty(
      value = "",
      required = false
  )
  private Integer id;

  /**
   * 执行器AppName
   */
  @ApiModelProperty(
      value = "执行器AppName",
      required = false
  )
  private String appName;

  /**
   * 执行器名称
   */
  @ApiModelProperty(
      value = "执行器名称",
      required = false
  )
  private String title;

  /**
   * 排序
   */
  @ApiModelProperty(
      value = "排序",
      required = false
  )
  private Integer order;

  /**
   * 执行器地址类型：0=自动注册、1=手动录入
   */
  @ApiModelProperty(
      value = "执行器地址类型：0=自动注册、1=手动录入",
      required = false
  )
  private Integer addressType;

  /**
   * 执行器地址列表，多地址逗号分隔
   */
  @ApiModelProperty(
      value = "执行器地址列表，多地址逗号分隔",
      required = true
  )
  private String addressList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public Integer getAddressType() {
    return addressType;
  }

  public void setAddressType(Integer addressType) {
    this.addressType = addressType;
  }

  public String getAddressList() {
    return addressList;
  }

  public void setAddressList(String addressList) {
    this.addressList = addressList;
  }
}
