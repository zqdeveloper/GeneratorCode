package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

@ApiModel(
    value = "BizHttpPostformParam",
    description = ""
)
public class BizHttpPostformParam extends BaseObject {
  /**
   * FORM参数ID
   */
  @ApiModelProperty(
      value = "FORM参数ID",
      required = false
  )
  private Integer formParamId;

  /**
   * HTTP任务编号
   */
  @ApiModelProperty(
      value = "HTTP任务编号",
      required = false
  )
  private String httpCode;

  /**
   * FORM参数名称
   */
  @ApiModelProperty(
      value = "FORM参数名称",
      required = false
  )
  private String formParamName;

  /**
   * FORM参数值
   */
  @ApiModelProperty(
      value = "FORM参数值",
      required = true
  )
  private String formParamValue;

  /**
   * FORM参数类型 |1:string,2:Interget
   */
  @ApiModelProperty(
      value = "FORM参数类型 |1:string,2:Interget",
      required = false
  )
  private String formParamType;

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

  public Integer getFormParamId() {
    return formParamId;
  }

  public void setFormParamId(Integer formParamId) {
    this.formParamId = formParamId;
  }

  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public String getFormParamName() {
    return formParamName;
  }

  public void setFormParamName(String formParamName) {
    this.formParamName = formParamName;
  }

  public String getFormParamValue() {
    return formParamValue;
  }

  public void setFormParamValue(String formParamValue) {
    this.formParamValue = formParamValue;
  }

  public String getFormParamType() {
    return formParamType;
  }

  public void setFormParamType(String formParamType) {
    this.formParamType = formParamType;
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
