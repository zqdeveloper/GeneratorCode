package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDevice;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 设备表
 */
public interface BizDeviceMapper {
  Integer insert(BizDevice bizDevice);

  Integer update(BizDevice bizDevice);

  List<Map<String, Object>> page(BizDevice bizDevice);

  Integer delete(String ids);
}
