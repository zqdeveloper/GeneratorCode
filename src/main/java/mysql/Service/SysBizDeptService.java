package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizDept;
import java.lang.String;

public interface SysBizDeptService {
  Result insertSysBizDept(SysBizDept sysBizDept);

  Result updateSysBizDept(SysBizDept sysBizDept);

  PageResult list(SysBizDept sysBizDept);

  Result deleteByIds(String ids);
}
