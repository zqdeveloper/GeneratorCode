package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 业务接口信息表
 */
@ApiModel(
    value = "SysBizApi",
    description = "业务接口信息表"
)
public class SysBizApi extends BaseObject {
  /**
   * 接口ID
   */
  @ApiModelProperty(
      value = "接口ID",
      required = false
  )
  private Integer apiId;

  /**
   * 编号
   */
  @ApiModelProperty(
      value = "编号",
      required = false
  )
  private String apiCode;

  /**
   * 名称
   */
  @ApiModelProperty(
      value = "名称",
      required = false
  )
  private String apiName;

  /**
   * 菜单类型(与数据字典API_MENU_TYPE关联)
   */
  @ApiModelProperty(
      value = "菜单类型(与数据字典API_MENU_TYPE关联)",
      required = false
  )
  private String apiMenuType;

  /**
   * URL地址
   */
  @ApiModelProperty(
      value = "URL地址",
      required = true
  )
  private String apiUrl;

  /**
   * 排序
   */
  @ApiModelProperty(
      value = "排序",
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
  private String apiLevelCode;

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

  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
  }

  public String getApiCode() {
    return apiCode;
  }

  public void setApiCode(String apiCode) {
    this.apiCode = apiCode;
  }

  public String getApiName() {
    return apiName;
  }

  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public String getApiMenuType() {
    return apiMenuType;
  }

  public void setApiMenuType(String apiMenuType) {
    this.apiMenuType = apiMenuType;
  }

  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public String getApiLevelCode() {
    return apiLevelCode;
  }

  public void setApiLevelCode(String apiLevelCode) {
    this.apiLevelCode = apiLevelCode;
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
