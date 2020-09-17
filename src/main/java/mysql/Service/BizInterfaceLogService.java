package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizInterfaceLog;
import java.lang.String;

public interface BizInterfaceLogService {
  Result insertBizInterfaceLog(BizInterfaceLog bizInterfaceLog);

  Result updateBizInterfaceLog(BizInterfaceLog bizInterfaceLog);

  PageResult list(BizInterfaceLog bizInterfaceLog);

  Result deleteByIds(String ids);
}
