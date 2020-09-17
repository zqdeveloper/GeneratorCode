package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizUser;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 用户信息表
 */
public interface SysBizUserMapper {
  Integer insert(SysBizUser sysBizUser);

  Integer update(SysBizUser sysBizUser);

  List<Map<String, Object>> page(SysBizUser sysBizUser);

  Integer delete(String ids);
}
