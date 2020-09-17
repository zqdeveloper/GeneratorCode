package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizInterfaceAnalysis;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 接口调用分析表
 */
public interface BizInterfaceAnalysisMapper {
  Integer insert(BizInterfaceAnalysis bizInterfaceAnalysis);

  Integer update(BizInterfaceAnalysis bizInterfaceAnalysis);

  List<Map<String, Object>> page(BizInterfaceAnalysis bizInterfaceAnalysis);

  Integer delete(String ids);
}
