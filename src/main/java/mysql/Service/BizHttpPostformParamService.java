package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizHttpPostformParam;
import java.lang.String;

public interface BizHttpPostformParamService {
  Result insertBizHttpPostformParam(BizHttpPostformParam bizHttpPostformParam);

  Result updateBizHttpPostformParam(BizHttpPostformParam bizHttpPostformParam);

  PageResult list(BizHttpPostformParam bizHttpPostformParam);

  Result deleteByIds(String ids);
}
