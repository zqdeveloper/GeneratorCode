package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizHttpGetParam;
import java.lang.String;

public interface BizHttpGetParamService {
  Result insertBizHttpGetParam(BizHttpGetParam bizHttpGetParam);

  Result updateBizHttpGetParam(BizHttpGetParam bizHttpGetParam);

  PageResult list(BizHttpGetParam bizHttpGetParam);

  Result deleteByIds(String ids);
}
