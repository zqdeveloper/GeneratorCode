package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 地区表
 */
@ApiModel(
    value = "SysRegion20200619",
    description = "地区表"
)
public class SysRegion20200619 extends BaseObject {
  /**
   * 地区ID
   */
  @ApiModelProperty(
      value = "地区ID",
      required = false
  )
  private Integer sysRegionId;

  /**
   * 地区编码
   */
  @ApiModelProperty(
      value = "地区编码",
      required = false
  )
  private String regionCode;

  /**
   * 地区名称
   */
  @ApiModelProperty(
      value = "地区名称",
      required = false
  )
  private String regionName;

  /**
   * 等级
   */
  @ApiModelProperty(
      value = "等级",
      required = false
  )
  private Integer regionLevel;

  /**
   * 排序
   */
  @ApiModelProperty(
      value = "排序",
      required = false
  )
  private Integer regionIndex;

  /**
   * 英文名称
   */
  @ApiModelProperty(
      value = "英文名称",
      required = true
  )
  private String nameEn;

  /**
   * 英文短称
   */
  @ApiModelProperty(
      value = "英文短称",
      required = true
  )
  private String shortnameEn;

  /**
   * 省份编码
   */
  @ApiModelProperty(
      value = "省份编码",
      required = true
  )
  private String provCode;

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
   * 记录状态
   */
  @ApiModelProperty(
      value = "记录状态",
      required = false
  )
  private String status;

  public Integer getSysRegionId() {
    return sysRegionId;
  }

  public void setSysRegionId(Integer sysRegionId) {
    this.sysRegionId = sysRegionId;
  }

  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public Integer getRegionLevel() {
    return regionLevel;
  }

  public void setRegionLevel(Integer regionLevel) {
    this.regionLevel = regionLevel;
  }

  public Integer getRegionIndex() {
    return regionIndex;
  }

  public void setRegionIndex(Integer regionIndex) {
    this.regionIndex = regionIndex;
  }

  public String getNameEn() {
    return nameEn;
  }

  public void setNameEn(String nameEn) {
    this.nameEn = nameEn;
  }

  public String getShortnameEn() {
    return shortnameEn;
  }

  public void setShortnameEn(String shortnameEn) {
    this.shortnameEn = shortnameEn;
  }

  public String getProvCode() {
    return provCode;
  }

  public void setProvCode(String provCode) {
    this.provCode = provCode;
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
