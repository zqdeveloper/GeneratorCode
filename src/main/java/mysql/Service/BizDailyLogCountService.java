package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDailyLogCount;
import java.lang.String;

public interface BizDailyLogCountService {
  Result insertBizDailyLogCount(BizDailyLogCount bizDailyLogCount);

  Result updateBizDailyLogCount(BizDailyLogCount bizDailyLogCount);

  PageResult list(BizDailyLogCount bizDailyLogCount);

  Result deleteByIds(String ids);
}
