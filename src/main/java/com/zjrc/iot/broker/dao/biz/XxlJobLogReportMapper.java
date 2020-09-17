package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.XxlJobLogReport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface XxlJobLogReportMapper {
  Integer insert(XxlJobLogReport xxlJobLogReport);

  Integer update(XxlJobLogReport xxlJobLogReport);

  List<Map<String, Object>> page(XxlJobLogReport xxlJobLogReport);

  Integer delete(String ids);
}
