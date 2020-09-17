package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceBusinessType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 上层应用(接入平台)和设备类型关联表
 */
public interface BizDeviceBusinessTypeMapper {
  Integer insert(BizDeviceBusinessType bizDeviceBusinessType);

  Integer update(BizDeviceBusinessType bizDeviceBusinessType);

  List<Map<String, Object>> page(BizDeviceBusinessType bizDeviceBusinessType);

  Integer delete(String ids);
}
