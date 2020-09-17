package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceFactroyType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 设备厂家和设备类型关联表
 */
public interface BizDeviceFactroyTypeMapper {
  Integer insert(BizDeviceFactroyType bizDeviceFactroyType);

  Integer update(BizDeviceFactroyType bizDeviceFactroyType);

  List<Map<String, Object>> page(BizDeviceFactroyType bizDeviceFactroyType);

  Integer delete(String ids);
}
