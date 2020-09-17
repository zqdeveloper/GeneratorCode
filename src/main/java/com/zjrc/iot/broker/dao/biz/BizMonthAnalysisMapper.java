package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizMonthAnalysis;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 每月(按类别)增长趋势分析
 */
public interface BizMonthAnalysisMapper {
  Integer insert(BizMonthAnalysis bizMonthAnalysis);

  Integer update(BizMonthAnalysis bizMonthAnalysis);

  List<Map<String, Object>> page(BizMonthAnalysis bizMonthAnalysis);

  Integer delete(String ids);
}
