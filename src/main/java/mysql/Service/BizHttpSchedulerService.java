package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizHttpScheduler;
import java.lang.String;

public interface BizHttpSchedulerService {
  Result insertBizHttpScheduler(BizHttpScheduler bizHttpScheduler);

  Result updateBizHttpScheduler(BizHttpScheduler bizHttpScheduler);

  PageResult list(BizHttpScheduler bizHttpScheduler);

  Result deleteByIds(String ids);
}
