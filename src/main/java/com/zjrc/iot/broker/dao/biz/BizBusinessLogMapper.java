package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusinessLog;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 业务接口日志表
 */
public interface BizBusinessLogMapper {
  Integer insert(BizBusinessLog bizBusinessLog);

  Integer update(BizBusinessLog bizBusinessLog);

  List<Map<String, Object>> page(BizBusinessLog bizBusinessLog);

  Integer delete(String ids);
}
