package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizWhitePaper;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 白皮书表
 */
public interface BizWhitePaperMapper {
  Integer insert(BizWhitePaper bizWhitePaper);

  Integer update(BizWhitePaper bizWhitePaper);

  List<Map<String, Object>> page(BizWhitePaper bizWhitePaper);

  Integer delete(String ids);
}
