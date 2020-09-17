package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizIngerfaceDocApi;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 接口文档 接口编号 关联表
 */
public interface BizIngerfaceDocApiMapper {
  Integer insert(BizIngerfaceDocApi bizIngerfaceDocApi);

  Integer update(BizIngerfaceDocApi bizIngerfaceDocApi);

  List<Map<String, Object>> page(BizIngerfaceDocApi bizIngerfaceDocApi);

  Integer delete(String ids);
}
