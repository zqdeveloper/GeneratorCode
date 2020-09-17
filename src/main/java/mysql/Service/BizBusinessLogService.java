package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusinessLog;
import java.lang.String;

public interface BizBusinessLogService {
  Result insertBizBusinessLog(BizBusinessLog bizBusinessLog);

  Result updateBizBusinessLog(BizBusinessLog bizBusinessLog);

  PageResult list(BizBusinessLog bizBusinessLog);

  Result deleteByIds(String ids);
}
