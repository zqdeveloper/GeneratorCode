package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobLog;
import java.lang.String;

public interface XxlJobLogService {
  Result insertXxlJobLog(XxlJobLog xxlJobLog);

  Result updateXxlJobLog(XxlJobLog xxlJobLog);

  PageResult list(XxlJobLog xxlJobLog);

  Result deleteByIds(String ids);
}
