package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSourthCallbackUrl;
import java.lang.String;

public interface BizSourthCallbackUrlService {
  Result insertBizSourthCallbackUrl(BizSourthCallbackUrl bizSourthCallbackUrl);

  Result updateBizSourthCallbackUrl(BizSourthCallbackUrl bizSourthCallbackUrl);

  PageResult list(BizSourthCallbackUrl bizSourthCallbackUrl);

  Result deleteByIds(String ids);
}
