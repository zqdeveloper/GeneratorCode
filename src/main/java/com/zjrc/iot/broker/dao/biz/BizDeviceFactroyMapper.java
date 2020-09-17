package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceFactroy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 设备厂家表
 */
public interface BizDeviceFactroyMapper {
  Integer insert(BizDeviceFactroy bizDeviceFactroy);

  Integer update(BizDeviceFactroy bizDeviceFactroy);

  List<Map<String, Object>> page(BizDeviceFactroy bizDeviceFactroy);

  Integer delete(String ids);
}
