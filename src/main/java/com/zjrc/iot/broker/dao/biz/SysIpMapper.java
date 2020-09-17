package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysIp;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * ip信息表
 */
public interface SysIpMapper {
  Integer insert(SysIp sysIp);

  Integer update(SysIp sysIp);

  List<Map<String, Object>> page(SysIp sysIp);

  Integer delete(String ids);
}
