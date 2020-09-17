package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizFactoryPercentage;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 对接平拍厂商百分比表
 */
public interface BizFactoryPercentageMapper {
  Integer insert(BizFactoryPercentage bizFactoryPercentage);

  Integer update(BizFactoryPercentage bizFactoryPercentage);

  List<Map<String, Object>> page(BizFactoryPercentage bizFactoryPercentage);

  Integer delete(String ids);
}
