package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizRoleapi;
import java.lang.String;

public interface SysBizRoleapiService {
  Result insertSysBizRoleapi(SysBizRoleapi sysBizRoleapi);

  Result updateSysBizRoleapi(SysBizRoleapi sysBizRoleapi);

  PageResult list(SysBizRoleapi sysBizRoleapi);

  Result deleteByIds(String ids);
}
