package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * 白皮书表
 */
@ApiModel(
    value = "BizWhitePaper",
    description = "白皮书表"
)
public class BizWhitePaper extends BaseObject {
  /**
   * 主键ID
   */
  @ApiModelProperty(
      value = "主键ID",
      required = false
  )
  private Integer whitePaperId;

  /**
   * 白皮书标题
   */
  @ApiModelProperty(
      value = "白皮书标题",
      required = false
  )
  private String whitePaperTitle;

  /**
   * 白皮书摘要
   */
  @ApiModelProperty(
      value = "白皮书摘要",
      required = true
  )
  private String whitePaperSummay;

  /**
   * 文件路径
   */
  @ApiModelProperty(
      value = "文件路径",
      required = true
  )
  private String whitePaperFilePath;

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

  public Integer getWhitePaperId() {
    return whitePaperId;
  }

  public void setWhitePaperId(Integer whitePaperId) {
    this.whitePaperId = whitePaperId;
  }

  public String getWhitePaperTitle() {
    return whitePaperTitle;
  }

  public void setWhitePaperTitle(String whitePaperTitle) {
    this.whitePaperTitle = whitePaperTitle;
  }

  public String getWhitePaperSummay() {
    return whitePaperSummay;
  }

  public void setWhitePaperSummay(String whitePaperSummay) {
    this.whitePaperSummay = whitePaperSummay;
  }

  public String getWhitePaperFilePath() {
    return whitePaperFilePath;
  }

  public void setWhitePaperFilePath(String whitePaperFilePath) {
    this.whitePaperFilePath = whitePaperFilePath;
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
