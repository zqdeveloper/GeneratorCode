package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobInfoMapper {
  Integer insert(XxlJobInfo xxlJobInfo);

  Integer update(XxlJobInfo xxlJobInfo);

  List<Map<String, Object>> page(XxlJobInfo xxlJobInfo);

  Integer delete(String ids);
}
