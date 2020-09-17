package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusinessDeviceType;
import java.lang.String;

public interface BizBusinessDeviceTypeService {
  Result insertBizBusinessDeviceType(BizBusinessDeviceType bizBusinessDeviceType);

  Result updateBizBusinessDeviceType(BizBusinessDeviceType bizBusinessDeviceType);

  PageResult list(BizBusinessDeviceType bizBusinessDeviceType);

  Result deleteByIds(String ids);
}
