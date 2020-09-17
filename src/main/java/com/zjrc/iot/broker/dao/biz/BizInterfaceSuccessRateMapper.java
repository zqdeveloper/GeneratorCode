package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizInterfaceSuccessRate;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 接口调用成功率趋势表
 */
public interface BizInterfaceSuccessRateMapper {
  Integer insert(BizInterfaceSuccessRate bizInterfaceSuccessRate);

  Integer update(BizInterfaceSuccessRate bizInterfaceSuccessRate);

  List<Map<String, Object>> page(BizInterfaceSuccessRate bizInterfaceSuccessRate);

  Integer delete(String ids);
}
