package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 接口文档表
 */
@ApiModel(
    value = "BizIngerfaceDoc",
    description = "接口文档表"
)
public class BizIngerfaceDoc extends BaseObject {
  /**
   * 接口文档ID
   */
  @ApiModelProperty(
      value = "接口文档ID",
      required = false
  )
  private Integer interfaceDocId;

  /**
   * 接口文档标题
   */
  @ApiModelProperty(
      value = "接口文档标题",
      required = false
  )
  private String interfaceDocTitle;

  /**
   * 接口文档编号
   */
  @ApiModelProperty(
      value = "接口文档编号",
      required = true
  )
  private String interfaceDocCode;

  /**
   * 接口文档版本号
   */
  @ApiModelProperty(
      value = "接口文档版本号",
      required = true
  )
  private String interfaceDocVersion;

  /**
   * 接口文档路径
   */
  @ApiModelProperty(
      value = "接口文档路径",
      required = true
  )
  private String interfaceDocFilePath;

  /**
   * 能力ID
   */
  @ApiModelProperty(
      value = "能力ID",
      required = true
  )
  private Integer abilityId;

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

  public Integer getInterfaceDocId() {
    return interfaceDocId;
  }

  public void setInterfaceDocId(Integer interfaceDocId) {
    this.interfaceDocId = interfaceDocId;
  }

  public String getInterfaceDocTitle() {
    return interfaceDocTitle;
  }

  public void setInterfaceDocTitle(String interfaceDocTitle) {
    this.interfaceDocTitle = interfaceDocTitle;
  }

  public String getInterfaceDocCode() {
    return interfaceDocCode;
  }

  public void setInterfaceDocCode(String interfaceDocCode) {
    this.interfaceDocCode = interfaceDocCode;
  }

  public String getInterfaceDocVersion() {
    return interfaceDocVersion;
  }

  public void setInterfaceDocVersion(String interfaceDocVersion) {
    this.interfaceDocVersion = interfaceDocVersion;
  }

  public String getInterfaceDocFilePath() {
    return interfaceDocFilePath;
  }

  public void setInterfaceDocFilePath(String interfaceDocFilePath) {
    this.interfaceDocFilePath = interfaceDocFilePath;
  }

  public Integer getAbilityId() {
    return abilityId;
  }

  public void setAbilityId(Integer abilityId) {
    this.abilityId = abilityId;
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
