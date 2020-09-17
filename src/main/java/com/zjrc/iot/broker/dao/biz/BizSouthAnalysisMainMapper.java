package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizSouthAnalysisMain;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 南向数据解析主表
 */
public interface BizSouthAnalysisMainMapper {
  Integer insert(BizSouthAnalysisMain bizSouthAnalysisMain);

  Integer update(BizSouthAnalysisMain bizSouthAnalysisMain);

  List<Map<String, Object>> page(BizSouthAnalysisMain bizSouthAnalysisMain);

  Integer delete(String ids);
}
