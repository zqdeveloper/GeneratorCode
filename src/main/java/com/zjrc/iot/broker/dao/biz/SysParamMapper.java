package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysParam;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 数据字典表
 */
public interface SysParamMapper {
  Integer insert(SysParam sysParam);

  Integer update(SysParam sysParam);

  List<Map<String, Object>> page(SysParam sysParam);

  Integer delete(String ids);
}
