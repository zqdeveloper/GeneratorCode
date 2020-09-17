package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizUserrole;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 人员角色关联信息表
 */
public interface SysBizUserroleMapper {
  Integer insert(SysBizUserrole sysBizUserrole);

  Integer update(SysBizUserrole sysBizUserrole);

  List<Map<String, Object>> page(SysBizUserrole sysBizUserrole);

  Integer delete(String ids);
}
