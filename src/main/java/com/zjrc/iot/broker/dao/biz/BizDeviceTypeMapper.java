package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 设备类型信息表
 */
public interface BizDeviceTypeMapper {
  Integer insert(BizDeviceType bizDeviceType);

  Integer update(BizDeviceType bizDeviceType);

  List<Map<String, Object>> page(BizDeviceType bizDeviceType);

  Integer delete(String ids);
}
