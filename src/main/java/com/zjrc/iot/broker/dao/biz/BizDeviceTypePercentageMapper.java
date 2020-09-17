package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceTypePercentage;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 对接设备类型 百分比表
 */
public interface BizDeviceTypePercentageMapper {
  Integer insert(BizDeviceTypePercentage bizDeviceTypePercentage);

  Integer update(BizDeviceTypePercentage bizDeviceTypePercentage);

  List<Map<String, Object>> page(BizDeviceTypePercentage bizDeviceTypePercentage);

  Integer delete(String ids);
}
