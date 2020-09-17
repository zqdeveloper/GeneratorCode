package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysRegion;
import java.lang.String;

public interface SysRegionService {
  Result insertSysRegion(SysRegion sysRegion);

  Result updateSysRegion(SysRegion sysRegion);

  PageResult list(SysRegion sysRegion);

  Result deleteByIds(String ids);
}
