package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusiness;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 业务信息表
 */
public interface BizBusinessMapper {
  Integer insert(BizBusiness bizBusiness);

  Integer update(BizBusiness bizBusiness);

  List<Map<String, Object>> page(BizBusiness bizBusiness);

  Integer delete(String ids);
}
