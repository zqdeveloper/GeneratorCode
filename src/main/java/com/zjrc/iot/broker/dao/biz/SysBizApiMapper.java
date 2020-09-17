package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizApi;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 业务接口信息表
 */
public interface SysBizApiMapper {
  Integer insert(SysBizApi sysBizApi);

  Integer update(SysBizApi sysBizApi);

  List<Map<String, Object>> page(SysBizApi sysBizApi);

  Integer delete(String ids);
}
