package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceTypeCount;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 对接设备类型 对应数量表
 */
public interface BizDeviceTypeCountMapper {
  Integer insert(BizDeviceTypeCount bizDeviceTypeCount);

  Integer update(BizDeviceTypeCount bizDeviceTypeCount);

  List<Map<String, Object>> page(BizDeviceTypeCount bizDeviceTypeCount);

  Integer delete(String ids);
}
