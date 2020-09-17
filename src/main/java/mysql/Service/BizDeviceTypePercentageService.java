package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceTypePercentage;
import java.lang.String;

public interface BizDeviceTypePercentageService {
  Result insertBizDeviceTypePercentage(BizDeviceTypePercentage bizDeviceTypePercentage);

  Result updateBizDeviceTypePercentage(BizDeviceTypePercentage bizDeviceTypePercentage);

  PageResult list(BizDeviceTypePercentage bizDeviceTypePercentage);

  Result deleteByIds(String ids);
}
