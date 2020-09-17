package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 区域信息表
 */
@ApiModel(
    value = "SysBizArea",
    description = "区域信息表"
)
public class SysBizArea extends BaseObject {
  /**
   * 区域ID
   */
  @ApiModelProperty(
      value = "区域ID",
      required = false
  )
  private Integer areaId;

  /**
   * 区域名称
   */
  @ApiModelProperty(
      value = "区域名称",
      required = false
  )
  private String areaName;

  /**
   * 区域描述
   */
  @ApiModelProperty(
      value = "区域描述",
      required = true
  )
  private String areaDesc;

  /**
   * 区域排序
   */
  @ApiModelProperty(
      value = "区域排序",
      required = true
  )
  private Integer index;

  /**
   * 等级编码
   */
  @ApiModelProperty(
      value = "等级编码",
      required = false
  )
  private String areaLevelCode;

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

  public Integer getAreaId() {
    return areaId;
  }

  public void setAreaId(Integer areaId) {
    this.areaId = areaId;
  }

  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public String getAreaDesc() {
    return areaDesc;
  }

  public void setAreaDesc(String areaDesc) {
    this.areaDesc = areaDesc;
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public String getAreaLevelCode() {
    return areaLevelCode;
  }

  public void setAreaLevelCode(String areaLevelCode) {
    this.areaLevelCode = areaLevelCode;
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
