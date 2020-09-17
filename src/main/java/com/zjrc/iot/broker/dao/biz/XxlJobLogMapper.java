package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobLog;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobLogMapper {
  Integer insert(XxlJobLog xxlJobLog);

  Integer update(XxlJobLog xxlJobLog);

  List<Map<String, Object>> page(XxlJobLog xxlJobLog);

  Integer delete(String ids);
}
