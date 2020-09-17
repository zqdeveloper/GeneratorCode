package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysFile;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 文件信息表
 */
public interface SysFileMapper {
  Integer insert(SysFile sysFile);

  Integer update(SysFile sysFile);

  List<Map<String, Object>> page(SysFile sysFile);

  Integer delete(String ids);
}
