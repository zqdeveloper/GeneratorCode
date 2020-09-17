package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "XxlJobRegistry",
    description = ""
)
public class XxlJobRegistry extends BaseObject {
  @ApiModelProperty(
      value = "",
      required = false
  )
  private Integer id;

  @ApiModelProperty(
      value = "",
      required = false
  )
  private String registryGroup;

  @ApiModelProperty(
      value = "",
      required = false
  )
  private String registryKey;

  @ApiModelProperty(
      value = "",
      required = false
  )
  private String registryValue;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String updateTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRegistryGroup() {
    return registryGroup;
  }

  public void setRegistryGroup(String registryGroup) {
    this.registryGroup = registryGroup;
  }

  public String getRegistryKey() {
    return registryKey;
  }

  public void setRegistryKey(String registryKey) {
    this.registryKey = registryKey;
  }

  public String getRegistryValue() {
    return registryValue;
  }

  public void setRegistryValue(String registryValue) {
    this.registryValue = registryValue;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }
}
