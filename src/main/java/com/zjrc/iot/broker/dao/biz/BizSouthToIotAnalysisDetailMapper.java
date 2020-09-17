package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizSouthToIotAnalysisDetail;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 南向推送中台数据解析表
 */
public interface BizSouthToIotAnalysisDetailMapper {
  Integer insert(BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail);

  Integer update(BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail);

  List<Map<String, Object>> page(BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail);

  Integer delete(String ids);
}
