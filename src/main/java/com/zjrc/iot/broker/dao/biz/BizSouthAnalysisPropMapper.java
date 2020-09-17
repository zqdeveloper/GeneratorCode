package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizSouthAnalysisProp;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 南向具体属性获取表
 */
public interface BizSouthAnalysisPropMapper {
  Integer insert(BizSouthAnalysisProp bizSouthAnalysisProp);

  Integer update(BizSouthAnalysisProp bizSouthAnalysisProp);

  List<Map<String, Object>> page(BizSouthAnalysisProp bizSouthAnalysisProp);

  Integer delete(String ids);
}
