package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * http任务表
 */
@ApiModel(
    value = "BizHttpMain",
    description = "http任务表"
)
public class BizHttpMain extends BaseObject {
  /**
   * HTTP任务ID
   */
  @ApiModelProperty(
      value = "HTTP任务ID",
      required = false
  )
  private Integer httpId;

  /**
   * HTTP任务编号
   */
  @ApiModelProperty(
      value = "HTTP任务编号",
      required = false
  )
  private String httpCode;

  /**
   * HTTP任务名称
   */
  @ApiModelProperty(
      value = "HTTP任务名称",
      required = false
  )
  private String httpName;

  /**
   * HTTP运行模式| 1:对外接口|2:定时任务
   */
  @ApiModelProperty(
      value = "HTTP运行模式| 1:对外接口|2:定时任务",
      required = false
  )
  private String httpMode;

  /**
   * HTTP URL
   */
  @ApiModelProperty(
      value = "HTTP URL",
      required = false
  )
  private String httpUrl;

  /**
   * HTPP方法| 1:GET|2:POST|3:PUT|4:DELETE|5:PATCH
   */
  @ApiModelProperty(
      value = "HTPP方法| 1:GET|2:POST|3:PUT|4:DELETE|5:PATCH",
      required = false
  )
  private String httpMethod;

  /**
   * POST参数类型 |1 json | 2 form | 字符串
   */
  @ApiModelProperty(
      value = "POST参数类型 |1 json | 2 form | 字符串",
      required = false
  )
  private String postFormType;

  /**
   * 非json参数 
   */
  @ApiModelProperty(
      value = "非json参数 ",
      required = true
  )
  private String postParam;

  /**
   * 是否启用 | 1 启用 0 停止
   */
  @ApiModelProperty(
      value = "是否启用 | 1 启用 0 停止",
      required = true
  )
  private String isOpen;

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

  public Integer getHttpId() {
    return httpId;
  }

  public void setHttpId(Integer httpId) {
    this.httpId = httpId;
  }

  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public String getHttpName() {
    return httpName;
  }

  public void setHttpName(String httpName) {
    this.httpName = httpName;
  }

  public String getHttpMode() {
    return httpMode;
  }

  public void setHttpMode(String httpMode) {
    this.httpMode = httpMode;
  }

  public String getHttpUrl() {
    return httpUrl;
  }

  public void setHttpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
  }

  public String getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }

  public String getPostFormType() {
    return postFormType;
  }

  public void setPostFormType(String postFormType) {
    this.postFormType = postFormType;
  }

  public String getPostParam() {
    return postParam;
  }

  public void setPostParam(String postParam) {
    this.postParam = postParam;
  }

  public String getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(String isOpen) {
    this.isOpen = isOpen;
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
