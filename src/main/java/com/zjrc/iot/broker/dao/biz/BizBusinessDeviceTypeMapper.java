package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusinessDeviceType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 项目设备类型分析
 */
public interface BizBusinessDeviceTypeMapper {
  Integer insert(BizBusinessDeviceType bizBusinessDeviceType);

  Integer update(BizBusinessDeviceType bizBusinessDeviceType);

  List<Map<String, Object>> page(BizBusinessDeviceType bizBusinessDeviceType);

  Integer delete(String ids);
}
