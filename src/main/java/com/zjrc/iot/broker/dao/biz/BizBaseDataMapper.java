package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBaseData;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 基础数据表
 */
public interface BizBaseDataMapper {
  Integer insert(BizBaseData bizBaseData);

  Integer update(BizBaseData bizBaseData);

  List<Map<String, Object>> page(BizBaseData bizBaseData);

  Integer delete(String ids);
}
