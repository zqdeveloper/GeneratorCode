package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysParam;
import java.lang.String;

public interface SysParamService {
  Result insertSysParam(SysParam sysParam);

  Result updateSysParam(SysParam sysParam);

  PageResult list(SysParam sysParam);

  Result deleteByIds(String ids);
}
