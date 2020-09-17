package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDataStream;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface BizDataStreamMapper {
  Integer insert(BizDataStream bizDataStream);

  Integer update(BizDataStream bizDataStream);

  List<Map<String, Object>> page(BizDataStream bizDataStream);

  Integer delete(String ids);
}
