package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceFactroyType;
import java.lang.String;

public interface BizDeviceFactroyTypeService {
  Result insertBizDeviceFactroyType(BizDeviceFactroyType bizDeviceFactroyType);

  Result updateBizDeviceFactroyType(BizDeviceFactroyType bizDeviceFactroyType);

  PageResult list(BizDeviceFactroyType bizDeviceFactroyType);

  Result deleteByIds(String ids);
}
