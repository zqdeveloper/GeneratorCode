package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceBusinessType;
import java.lang.String;

public interface BizDeviceBusinessTypeService {
  Result insertBizDeviceBusinessType(BizDeviceBusinessType bizDeviceBusinessType);

  Result updateBizDeviceBusinessType(BizDeviceBusinessType bizDeviceBusinessType);

  PageResult list(BizDeviceBusinessType bizDeviceBusinessType);

  Result deleteByIds(String ids);
}
