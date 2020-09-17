package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizInterfaceSuccessRate;
import java.lang.String;

public interface BizInterfaceSuccessRateService {
  Result insertBizInterfaceSuccessRate(BizInterfaceSuccessRate bizInterfaceSuccessRate);

  Result updateBizInterfaceSuccessRate(BizInterfaceSuccessRate bizInterfaceSuccessRate);

  PageResult list(BizInterfaceSuccessRate bizInterfaceSuccessRate);

  Result deleteByIds(String ids);
}
