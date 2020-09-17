package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizSouthToIotAnalysisMain;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 南向推送中台数据解析主表
 */
public interface BizSouthToIotAnalysisMainMapper {
  Integer insert(BizSouthToIotAnalysisMain bizSouthToIotAnalysisMain);

  Integer update(BizSouthToIotAnalysisMain bizSouthToIotAnalysisMain);

  List<Map<String, Object>> page(BizSouthToIotAnalysisMain bizSouthToIotAnalysisMain);

  Integer delete(String ids);
}
