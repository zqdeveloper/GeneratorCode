package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizBusinessDetail;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 项目详情表(大屏)
 */
public interface BizBusinessDetailMapper {
  Integer insert(BizBusinessDetail bizBusinessDetail);

  Integer update(BizBusinessDetail bizBusinessDetail);

  List<Map<String, Object>> page(BizBusinessDetail bizBusinessDetail);

  Integer delete(String ids);
}
