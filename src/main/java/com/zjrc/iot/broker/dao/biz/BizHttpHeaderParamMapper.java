package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizHttpHeaderParam;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface BizHttpHeaderParamMapper {
  Integer insert(BizHttpHeaderParam bizHttpHeaderParam);

  Integer update(BizHttpHeaderParam bizHttpHeaderParam);

  List<Map<String, Object>> page(BizHttpHeaderParam bizHttpHeaderParam);

  Integer delete(String ids);
}
