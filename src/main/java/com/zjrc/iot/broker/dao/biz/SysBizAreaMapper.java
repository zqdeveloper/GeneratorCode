package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.SysBizArea;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 区域信息表
 */
public interface SysBizAreaMapper {
  Integer insert(SysBizArea sysBizArea);

  Integer update(SysBizArea sysBizArea);

  List<Map<String, Object>> page(SysBizArea sysBizArea);

  Integer delete(String ids);
}
