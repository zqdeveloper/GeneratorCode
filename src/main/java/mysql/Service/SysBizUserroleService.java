package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizUserrole;
import java.lang.String;

public interface SysBizUserroleService {
  Result insertSysBizUserrole(SysBizUserrole sysBizUserrole);

  Result updateSysBizUserrole(SysBizUserrole sysBizUserrole);

  PageResult list(SysBizUserrole sysBizUserrole);

  Result deleteByIds(String ids);
}
