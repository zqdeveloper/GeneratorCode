package com.zjrc.iot.broker.model.biz;

import com.zjrc.iot.broker.common.util.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.String;

@ApiModel(
    value = "XxlJobLock",
    description = ""
)
public class XxlJobLock extends BaseObject {
  /**
   * 锁名称
   */
  @ApiModelProperty(
      value = "锁名称",
      required = false
  )
  private String lockName;

  public String getLockName() {
    return lockName;
  }

  public void setLockName(String lockName) {
    this.lockName = lockName;
  }
}
