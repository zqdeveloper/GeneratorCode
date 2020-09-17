package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizUseronlinehistory;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 员工在线历史记录表
 */
public interface SysBizUseronlinehistoryMapper {
  Integer insert(SysBizUseronlinehistory sysBizUseronlinehistory);

  Integer update(SysBizUseronlinehistory sysBizUseronlinehistory);

  List<Map<String, Object>> page(SysBizUseronlinehistory sysBizUseronlinehistory);

  Integer delete(String ids);
}
