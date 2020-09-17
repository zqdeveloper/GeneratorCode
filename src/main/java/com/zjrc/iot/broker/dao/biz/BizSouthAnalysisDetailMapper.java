package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizSouthAnalysisDetail;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 南向数据解析表
 */
public interface BizSouthAnalysisDetailMapper {
  Integer insert(BizSouthAnalysisDetail bizSouthAnalysisDetail);

  Integer update(BizSouthAnalysisDetail bizSouthAnalysisDetail);

  List<Map<String, Object>> page(BizSouthAnalysisDetail bizSouthAnalysisDetail);

  Integer delete(String ids);
}
