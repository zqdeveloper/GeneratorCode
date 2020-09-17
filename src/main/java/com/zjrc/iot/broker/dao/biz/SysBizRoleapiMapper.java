package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizRoleapi;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 角色接口关联信息表
 */
public interface SysBizRoleapiMapper {
  Integer insert(SysBizRoleapi sysBizRoleapi);

  Integer update(SysBizRoleapi sysBizRoleapi);

  List<Map<String, Object>> page(SysBizRoleapi sysBizRoleapi);

  Integer delete(String ids);
}
