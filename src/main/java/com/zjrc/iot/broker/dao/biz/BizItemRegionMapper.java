package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizItemRegion;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 指标地区关联表
 */
public interface BizItemRegionMapper {
  Integer insert(BizItemRegion bizItemRegion);

  Integer update(BizItemRegion bizItemRegion);

  List<Map<String, Object>> page(BizItemRegion bizItemRegion);

  Integer delete(String ids);
}
