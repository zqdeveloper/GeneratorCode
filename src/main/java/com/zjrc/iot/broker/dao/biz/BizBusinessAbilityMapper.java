package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusinessAbility;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 上层应用(接入平台)和能力关联表
 */
public interface BizBusinessAbilityMapper {
  Integer insert(BizBusinessAbility bizBusinessAbility);

  Integer update(BizBusinessAbility bizBusinessAbility);

  List<Map<String, Object>> page(BizBusinessAbility bizBusinessAbility);

  Integer delete(String ids);
}
