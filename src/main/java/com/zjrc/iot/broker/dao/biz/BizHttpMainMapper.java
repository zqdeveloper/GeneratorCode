package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizHttpMain;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * http任务表
 */
public interface BizHttpMainMapper {
  Integer insert(BizHttpMain bizHttpMain);

  Integer update(BizHttpMain bizHttpMain);

  List<Map<String, Object>> page(BizHttpMain bizHttpMain);

  Integer delete(String ids);
}
