package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizRole;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 角色信息表
 */
public interface SysBizRoleMapper {
  Integer insert(SysBizRole sysBizRole);

  Integer update(SysBizRole sysBizRole);

  List<Map<String, Object>> page(SysBizRole sysBizRole);

  Integer delete(String ids);
}
