package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "SysRegion",
    description = ""
)
public class SysRegion extends BaseObject {
  @ApiModelProperty(
      value = "",
      required = true
  )
  private Integer regionId;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String regionCode;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String regionName;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private Integer parentId;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private Integer regionLevel;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private Integer regionIndex;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String nameEn;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String shortnameEn;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String provCode;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private Integer createUserId;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String createDate;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private Integer modifyUserId;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String modifyDate;

  @ApiModelProperty(
      value = "",
      required = true
  )
  private String status;

  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
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

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
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
