package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysRegion20200619;
import java.lang.String;

public interface SysRegion20200619Service {
  Result insertSysRegion20200619(SysRegion20200619 sysRegion20200619);

  Result updateSysRegion20200619(SysRegion20200619 sysRegion20200619);

  PageResult list(SysRegion20200619 sysRegion20200619);

  Result deleteByIds(String ids);
}
