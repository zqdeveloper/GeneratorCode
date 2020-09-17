package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceTypeCount;
import java.lang.String;

public interface BizDeviceTypeCountService {
  Result insertBizDeviceTypeCount(BizDeviceTypeCount bizDeviceTypeCount);

  Result updateBizDeviceTypeCount(BizDeviceTypeCount bizDeviceTypeCount);

  PageResult list(BizDeviceTypeCount bizDeviceTypeCount);

  Result deleteByIds(String ids);
}
