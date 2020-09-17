package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizHttpCallback;
import java.lang.String;

public interface BizHttpCallbackService {
  Result insertBizHttpCallback(BizHttpCallback bizHttpCallback);

  Result updateBizHttpCallback(BizHttpCallback bizHttpCallback);

  PageResult list(BizHttpCallback bizHttpCallback);

  Result deleteByIds(String ids);
}
