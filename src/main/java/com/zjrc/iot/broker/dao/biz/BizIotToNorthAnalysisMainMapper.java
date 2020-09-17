package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizIotToNorthAnalysisMain;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 中台推送北向json返回主表
 */
public interface BizIotToNorthAnalysisMainMapper {
  Integer insert(BizIotToNorthAnalysisMain bizIotToNorthAnalysisMain);

  Integer update(BizIotToNorthAnalysisMain bizIotToNorthAnalysisMain);

  List<Map<String, Object>> page(BizIotToNorthAnalysisMain bizIotToNorthAnalysisMain);

  Integer delete(String ids);
}
