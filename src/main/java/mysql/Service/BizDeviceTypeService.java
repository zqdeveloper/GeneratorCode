package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceType;
import java.lang.String;

public interface BizDeviceTypeService {
  Result insertBizDeviceType(BizDeviceType bizDeviceType);

  Result updateBizDeviceType(BizDeviceType bizDeviceType);

  PageResult list(BizDeviceType bizDeviceType);

  Result deleteByIds(String ids);
}
