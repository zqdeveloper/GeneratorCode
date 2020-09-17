package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysFile;
import java.lang.String;

public interface SysFileService {
  Result insertSysFile(SysFile sysFile);

  Result updateSysFile(SysFile sysFile);

  PageResult list(SysFile sysFile);

  Result deleteByIds(String ids);
}
