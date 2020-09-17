package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizDept;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 部门信息表
 */
public interface SysBizDeptMapper {
  Integer insert(SysBizDept sysBizDept);

  Integer update(SysBizDept sysBizDept);

  List<Map<String, Object>> page(SysBizDept sysBizDept);

  Integer delete(String ids);
}
