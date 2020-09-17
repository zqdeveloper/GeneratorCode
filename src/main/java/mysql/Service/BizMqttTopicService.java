package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizMqttTopic;
import java.lang.String;

public interface BizMqttTopicService {
  Result insertBizMqttTopic(BizMqttTopic bizMqttTopic);

  Result updateBizMqttTopic(BizMqttTopic bizMqttTopic);

  PageResult list(BizMqttTopic bizMqttTopic);

  Result deleteByIds(String ids);
}
