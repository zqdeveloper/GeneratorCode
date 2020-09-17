package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusinessDeviceStatus;
import java.lang.String;

public interface BizBusinessDeviceStatusService {
  Result insertBizBusinessDeviceStatus(BizBusinessDeviceStatus bizBusinessDeviceStatus);

  Result updateBizBusinessDeviceStatus(BizBusinessDeviceStatus bizBusinessDeviceStatus);

  PageResult list(BizBusinessDeviceStatus bizBusinessDeviceStatus);

  Result deleteByIds(String ids);
}
