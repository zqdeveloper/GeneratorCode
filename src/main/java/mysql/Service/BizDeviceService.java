package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDevice;
import java.lang.String;

public interface BizDeviceService {
  Result insertBizDevice(BizDevice bizDevice);

  Result updateBizDevice(BizDevice bizDevice);

  PageResult list(BizDevice bizDevice);

  Result deleteByIds(String ids);
}
