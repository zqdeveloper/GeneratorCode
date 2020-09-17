package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizSourthCallbackUrl;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 南向平台推送中台URL
 */
public interface BizSourthCallbackUrlMapper {
  Integer insert(BizSourthCallbackUrl bizSourthCallbackUrl);

  Integer update(BizSourthCallbackUrl bizSourthCallbackUrl);

  List<Map<String, Object>> page(BizSourthCallbackUrl bizSourthCallbackUrl);

  Integer delete(String ids);
}
