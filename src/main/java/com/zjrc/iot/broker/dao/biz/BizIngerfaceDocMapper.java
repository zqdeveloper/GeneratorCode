package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizIngerfaceDoc;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 接口文档表
 */
public interface BizIngerfaceDocMapper {
  Integer insert(BizIngerfaceDoc bizIngerfaceDoc);

  Integer update(BizIngerfaceDoc bizIngerfaceDoc);

  List<Map<String, Object>> page(BizIngerfaceDoc bizIngerfaceDoc);

  Integer delete(String ids);
}
