package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizApiType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 接口类型信息表
 */
public interface BizApiTypeMapper {
  Integer insert(BizApiType bizApiType);

  Integer update(BizApiType bizApiType);

  List<Map<String, Object>> page(BizApiType bizApiType);

  Integer delete(String ids);
}
