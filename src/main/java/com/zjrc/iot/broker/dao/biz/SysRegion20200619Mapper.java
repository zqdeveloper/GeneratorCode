package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysRegion20200619;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 地区表
 */
public interface SysRegion20200619Mapper {
  Integer insert(SysRegion20200619 sysRegion20200619);

  Integer update(SysRegion20200619 sysRegion20200619);

  List<Map<String, Object>> page(SysRegion20200619 sysRegion20200619);

  Integer delete(String ids);
}
