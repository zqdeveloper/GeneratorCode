package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizHttpPostformParam;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface BizHttpPostformParamMapper {
  Integer insert(BizHttpPostformParam bizHttpPostformParam);

  Integer update(BizHttpPostformParam bizHttpPostformParam);

  List<Map<String, Object>> page(BizHttpPostformParam bizHttpPostformParam);

  Integer delete(String ids);
}
