package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobUser;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobUserMapper {
  Integer insert(XxlJobUser xxlJobUser);

  Integer update(XxlJobUser xxlJobUser);

  List<Map<String, Object>> page(XxlJobUser xxlJobUser);

  Integer delete(String ids);
}
