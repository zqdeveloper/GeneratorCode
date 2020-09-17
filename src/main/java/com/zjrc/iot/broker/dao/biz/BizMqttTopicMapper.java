package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizMqttTopic;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * mqtt 主题管理表
 */
public interface BizMqttTopicMapper {
  Integer insert(BizMqttTopic bizMqttTopic);

  Integer update(BizMqttTopic bizMqttTopic);

  List<Map<String, Object>> page(BizMqttTopic bizMqttTopic);

  Integer delete(String ids);
}
