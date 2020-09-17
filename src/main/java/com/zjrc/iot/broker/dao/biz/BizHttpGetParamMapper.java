package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizHttpGetParam;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * http get参数表
 */
public interface BizHttpGetParamMapper {
  Integer insert(BizHttpGetParam bizHttpGetParam);

  Integer update(BizHttpGetParam bizHttpGetParam);

  List<Map<String, Object>> page(BizHttpGetParam bizHttpGetParam);

  Integer delete(String ids);
}
