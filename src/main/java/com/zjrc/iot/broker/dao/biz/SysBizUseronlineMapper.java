package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizUseronline;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 员工在线状态表
 */
public interface SysBizUseronlineMapper {
  Integer insert(SysBizUseronline sysBizUseronline);

  Integer update(SysBizUseronline sysBizUseronline);

  List<Map<String, Object>> page(SysBizUseronline sysBizUseronline);

  Integer delete(String ids);
}
