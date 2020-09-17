package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizHttpScheduler;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface BizHttpSchedulerMapper {
  Integer insert(BizHttpScheduler bizHttpScheduler);

  Integer update(BizHttpScheduler bizHttpScheduler);

  List<Map<String, Object>> page(BizHttpScheduler bizHttpScheduler);

  Integer delete(String ids);
}
