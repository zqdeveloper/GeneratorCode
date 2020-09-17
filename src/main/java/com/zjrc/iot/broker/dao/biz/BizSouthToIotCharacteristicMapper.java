package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizSouthToIotCharacteristic;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 南向推送中台数据解析 特征量表
 */
public interface BizSouthToIotCharacteristicMapper {
  Integer insert(BizSouthToIotCharacteristic bizSouthToIotCharacteristic);

  Integer update(BizSouthToIotCharacteristic bizSouthToIotCharacteristic);

  List<Map<String, Object>> page(BizSouthToIotCharacteristic bizSouthToIotCharacteristic);

  Integer delete(String ids);
}
