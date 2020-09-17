package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizUser;
import java.lang.String;

public interface SysBizUserService {
  Result insertSysBizUser(SysBizUser sysBizUser);

  Result updateSysBizUser(SysBizUser sysBizUser);

  PageResult list(SysBizUser sysBizUser);

  Result deleteByIds(String ids);
}
