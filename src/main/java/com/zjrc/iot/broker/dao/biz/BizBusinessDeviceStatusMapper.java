package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusinessDeviceStatus;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 项目设备实时状态
 */
public interface BizBusinessDeviceStatusMapper {
  Integer insert(BizBusinessDeviceStatus bizBusinessDeviceStatus);

  Integer update(BizBusinessDeviceStatus bizBusinessDeviceStatus);

  List<Map<String, Object>> page(BizBusinessDeviceStatus bizBusinessDeviceStatus);

  Integer delete(String ids);
}
