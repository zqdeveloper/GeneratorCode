package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizFactoryPercentage;
import java.lang.String;

public interface BizFactoryPercentageService {
  Result insertBizFactoryPercentage(BizFactoryPercentage bizFactoryPercentage);

  Result updateBizFactoryPercentage(BizFactoryPercentage bizFactoryPercentage);

  PageResult list(BizFactoryPercentage bizFactoryPercentage);

  Result deleteByIds(String ids);
}
