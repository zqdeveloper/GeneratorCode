package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobLogglue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobLogglueMapper {
  Integer insert(XxlJobLogglue xxlJobLogglue);

  Integer update(XxlJobLogglue xxlJobLogglue);

  List<Map<String, Object>> page(XxlJobLogglue xxlJobLogglue);

  Integer delete(String ids);
}
