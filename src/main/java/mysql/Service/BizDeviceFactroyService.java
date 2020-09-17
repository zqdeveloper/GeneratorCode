package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceFactroy;
import java.lang.String;

public interface BizDeviceFactroyService {
  Result insertBizDeviceFactroy(BizDeviceFactroy bizDeviceFactroy);

  Result updateBizDeviceFactroy(BizDeviceFactroy bizDeviceFactroy);

  PageResult list(BizDeviceFactroy bizDeviceFactroy);

  Result deleteByIds(String ids);
}
