package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizIotToNorthAnalysisDetail;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 中台推送北向json返回配置表
 */
public interface BizIotToNorthAnalysisDetailMapper {
  Integer insert(BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail);

  Integer update(BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail);

  List<Map<String, Object>> page(BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail);

  Integer delete(String ids);
}
