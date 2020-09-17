package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDailyLogCount;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 每日日志数量表
 */
public interface BizDailyLogCountMapper {
  Integer insert(BizDailyLogCount bizDailyLogCount);

  Integer update(BizDailyLogCount bizDailyLogCount);

  List<Map<String, Object>> page(BizDailyLogCount bizDailyLogCount);

  Integer delete(String ids);
}
