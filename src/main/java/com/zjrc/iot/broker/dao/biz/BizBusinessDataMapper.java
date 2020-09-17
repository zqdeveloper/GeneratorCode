package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusinessData;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 业务数据表
 */
public interface BizBusinessDataMapper {
  Integer insert(BizBusinessData bizBusinessData);

  Integer update(BizBusinessData bizBusinessData);

  List<Map<String, Object>> page(BizBusinessData bizBusinessData);

  Integer delete(String ids);
}
