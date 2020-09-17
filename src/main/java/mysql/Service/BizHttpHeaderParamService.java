package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizHttpHeaderParam;
import java.lang.String;

public interface BizHttpHeaderParamService {
  Result insertBizHttpHeaderParam(BizHttpHeaderParam bizHttpHeaderParam);

  Result updateBizHttpHeaderParam(BizHttpHeaderParam bizHttpHeaderParam);

  PageResult list(BizHttpHeaderParam bizHttpHeaderParam);

  Result deleteByIds(String ids);
}
