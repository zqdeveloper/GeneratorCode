package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizThirdPlaform;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 第三方平台表
 */
public interface BizThirdPlaformMapper {
  Integer insert(BizThirdPlaform bizThirdPlaform);

  Integer update(BizThirdPlaform bizThirdPlaform);

  List<Map<String, Object>> page(BizThirdPlaform bizThirdPlaform);

  Integer delete(String ids);
}
