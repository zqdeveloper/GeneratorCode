package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysRegion;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

public interface SysRegionMapper {
  Integer insert(SysRegion sysRegion);

  Integer update(SysRegion sysRegion);

  List<Map<String, Object>> page(SysRegion sysRegion);

  Integer delete(String ids);
}
