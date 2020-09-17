package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "BizHttpHeaderParam",
    description = ""
)
public class BizHttpHeaderParam extends BaseObject {
  /**
   * HEADER参数ID
   */
  @ApiModelProperty(
      value = "HEADER参数ID",
      required = false
  )
  private Integer headerParamId;

  /**
   * HTTP任务编号
   */
  @ApiModelProperty(
      value = "HTTP任务编号",
      required = false
  )
  private String httpCode;

  /**
   * HEADER参数名称
   */
  @ApiModelProperty(
      value = "HEADER参数名称",
      required = false
  )
  private String headerParamName;

  /**
   * HEADER参数值
   */
  @ApiModelProperty(
      value = "HEADER参数值",
      required = true
  )
  private String headerParamValue;

  /**
   * HEADER参数类型 |1:string 
   */
  @ApiModelProperty(
      value = "HEADER参数类型 |1:string ",
      required = false
  )
  private String headerParamType;

  /**
   * 是否变量 0:不是|1:是|2:南向具体属性
   */
  @ApiModelProperty(
      value = "是否变量 0:不是|1:是|2:南向具体属性",
      required = false
  )
  private String isVariable;

  /**
   * 是否可为空 1:是|    0:不是
   */
  @ApiModelProperty(
      value = "是否可为空 1:是|    0:不是",
      required = false
  )
  private String isNull;

  /**
   * 南向具体属性ID
   */
  @ApiModelProperty(
      value = "南向具体属性ID",
      required = true
  )
  private Integer southAnalysisPropId;

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

  public Integer getHeaderParamId() {
    return headerParamId;
  }

  public void setHeaderParamId(Integer headerParamId) {
    this.headerParamId = headerParamId;
  }

  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public String getHeaderParamName() {
    return headerParamName;
  }

  public void setHeaderParamName(String headerParamName) {
    this.headerParamName = headerParamName;
  }

  public String getHeaderParamValue() {
    return headerParamValue;
  }

  public void setHeaderParamValue(String headerParamValue) {
    this.headerParamValue = headerParamValue;
  }

  public String getHeaderParamType() {
    return headerParamType;
  }

  public void setHeaderParamType(String headerParamType) {
    this.headerParamType = headerParamType;
  }

  public String getIsVariable() {
    return isVariable;
  }

  public void setIsVariable(String isVariable) {
    this.isVariable = isVariable;
  }

  public String getIsNull() {
    return isNull;
  }

  public void setIsNull(String isNull) {
    this.isNull = isNull;
  }

  public Integer getSouthAnalysisPropId() {
    return southAnalysisPropId;
  }

  public void setSouthAnalysisPropId(Integer southAnalysisPropId) {
    this.southAnalysisPropId = southAnalysisPropId;
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
