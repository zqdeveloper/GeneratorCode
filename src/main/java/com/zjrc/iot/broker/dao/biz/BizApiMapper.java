package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizApi;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 接口信息表
 */
public interface BizApiMapper {
  Integer insert(BizApi bizApi);

  Integer update(BizApi bizApi);

  List<Map<String, Object>> page(BizApi bizApi);

  Integer delete(String ids);
}
