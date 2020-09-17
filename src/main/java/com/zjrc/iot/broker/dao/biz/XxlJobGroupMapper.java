package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobGroup;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobGroupMapper {
  Integer insert(XxlJobGroup xxlJobGroup);

  Integer update(XxlJobGroup xxlJobGroup);

  List<Map<String, Object>> page(XxlJobGroup xxlJobGroup);

  Integer delete(String ids);
}
