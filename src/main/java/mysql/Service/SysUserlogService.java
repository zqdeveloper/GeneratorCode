package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysUserlog;
import java.lang.String;

public interface SysUserlogService {
  Result insertSysUserlog(SysUserlog sysUserlog);

  Result updateSysUserlog(SysUserlog sysUserlog);

  PageResult list(SysUserlog sysUserlog);

  Result deleteByIds(String ids);
}
