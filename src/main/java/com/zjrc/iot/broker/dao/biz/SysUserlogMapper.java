package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysUserlog;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 用户操作日志表
 */
public interface SysUserlogMapper {
  Integer insert(SysUserlog sysUserlog);

  Integer update(SysUserlog sysUserlog);

  List<Map<String, Object>> page(SysUserlog sysUserlog);

  Integer delete(String ids);
}
