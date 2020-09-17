package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizNorthAnalysisMain;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 北向json返回主表
 */
public interface BizNorthAnalysisMainMapper {
  Integer insert(BizNorthAnalysisMain bizNorthAnalysisMain);

  Integer update(BizNorthAnalysisMain bizNorthAnalysisMain);

  List<Map<String, Object>> page(BizNorthAnalysisMain bizNorthAnalysisMain);

  Integer delete(String ids);
}
