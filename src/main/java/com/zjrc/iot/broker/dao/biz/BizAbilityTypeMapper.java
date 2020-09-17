package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizAbilityType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 能力类型表
 */
public interface BizAbilityTypeMapper {
  Integer insert(BizAbilityType bizAbilityType);

  Integer update(BizAbilityType bizAbilityType);

  List<Map<String, Object>> page(BizAbilityType bizAbilityType);

  Integer delete(String ids);
}
