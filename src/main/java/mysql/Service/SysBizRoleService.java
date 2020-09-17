package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizRole;
import java.lang.String;

public interface SysBizRoleService {
  Result insertSysBizRole(SysBizRole sysBizRole);

  Result updateSysBizRole(SysBizRole sysBizRole);

  PageResult list(SysBizRole sysBizRole);

  Result deleteByIds(String ids);
}
