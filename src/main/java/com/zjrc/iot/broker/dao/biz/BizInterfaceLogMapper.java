package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizInterfaceLog;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 接口日志表
 */
public interface BizInterfaceLogMapper {
  Integer insert(BizInterfaceLog bizInterfaceLog);

  Integer update(BizInterfaceLog bizInterfaceLog);

  List<Map<String, Object>> page(BizInterfaceLog bizInterfaceLog);

  Integer delete(String ids);
}
