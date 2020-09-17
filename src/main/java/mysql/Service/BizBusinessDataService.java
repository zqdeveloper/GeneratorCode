package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusinessData;
import java.lang.String;

public interface BizBusinessDataService {
  Result insertBizBusinessData(BizBusinessData bizBusinessData);

  Result updateBizBusinessData(BizBusinessData bizBusinessData);

  PageResult list(BizBusinessData bizBusinessData);

  Result deleteByIds(String ids);
}
