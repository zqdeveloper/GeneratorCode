package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysIp;
import java.lang.String;

public interface SysIpService {
  Result insertSysIp(SysIp sysIp);

  Result updateSysIp(SysIp sysIp);

  PageResult list(SysIp sysIp);

  Result deleteByIds(String ids);
}
