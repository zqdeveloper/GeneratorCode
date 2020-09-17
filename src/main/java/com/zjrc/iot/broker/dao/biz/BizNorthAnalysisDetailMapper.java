package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizNorthAnalysisDetail;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 北向json返回配置表
 */
public interface BizNorthAnalysisDetailMapper {
  Integer insert(BizNorthAnalysisDetail bizNorthAnalysisDetail);

  Integer update(BizNorthAnalysisDetail bizNorthAnalysisDetail);

  List<Map<String, Object>> page(BizNorthAnalysisDetail bizNorthAnalysisDetail);

  Integer delete(String ids);
}
