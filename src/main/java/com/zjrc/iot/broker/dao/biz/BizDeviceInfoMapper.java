package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 设备信息表
 */
public interface BizDeviceInfoMapper {
  Integer insert(BizDeviceInfo bizDeviceInfo);

  Integer update(BizDeviceInfo bizDeviceInfo);

  List<Map<String, Object>> page(BizDeviceInfo bizDeviceInfo);

  Integer delete(String ids);
}
