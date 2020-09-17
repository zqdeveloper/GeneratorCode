package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobLock;
import java.lang.String;

public interface XxlJobLockService {
  Result insertXxlJobLock(XxlJobLock xxlJobLock);

  Result updateXxlJobLock(XxlJobLock xxlJobLock);

  PageResult list(XxlJobLock xxlJobLock);

  Result deleteByIds(String ids);
}
