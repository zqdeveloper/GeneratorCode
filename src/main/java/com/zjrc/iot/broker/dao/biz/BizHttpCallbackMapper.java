package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizHttpCallback;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface BizHttpCallbackMapper {
  Integer insert(BizHttpCallback bizHttpCallback);

  Integer update(BizHttpCallback bizHttpCallback);

  List<Map<String, Object>> page(BizHttpCallback bizHttpCallback);

  Integer delete(String ids);
}
