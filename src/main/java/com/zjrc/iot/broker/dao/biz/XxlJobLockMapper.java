package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobLock;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobLockMapper {
  Integer insert(XxlJobLock xxlJobLock);

  Integer update(XxlJobLock xxlJobLock);

  List<Map<String, Object>> page(XxlJobLock xxlJobLock);

  Integer delete(String ids);
}
