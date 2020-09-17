package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizHttpApi;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface BizHttpApiMapper {
  Integer insert(BizHttpApi bizHttpApi);

  Integer update(BizHttpApi bizHttpApi);

  List<Map<String, Object>> page(BizHttpApi bizHttpApi);

  Integer delete(String ids);
}
