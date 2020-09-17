package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusinessRegion;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 项目关联地区表
 */
public interface BizBusinessRegionMapper {
  Integer insert(BizBusinessRegion bizBusinessRegion);

  Integer update(BizBusinessRegion bizBusinessRegion);

  List<Map<String, Object>> page(BizBusinessRegion bizBusinessRegion);

  Integer delete(String ids);
}
