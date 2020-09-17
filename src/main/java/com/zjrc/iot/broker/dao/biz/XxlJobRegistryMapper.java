package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobRegistry;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobRegistryMapper {
  Integer insert(XxlJobRegistry xxlJobRegistry);

  Integer update(XxlJobRegistry xxlJobRegistry);

  List<Map<String, Object>> page(XxlJobRegistry xxlJobRegistry);

  Integer delete(String ids);
}
