package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceInfo;
import java.lang.String;

public interface BizDeviceInfoService {
  Result insertBizDeviceInfo(BizDeviceInfo bizDeviceInfo);

  Result updateBizDeviceInfo(BizDeviceInfo bizDeviceInfo);

  PageResult list(BizDeviceInfo bizDeviceInfo);

  Result deleteByIds(String ids);
}
