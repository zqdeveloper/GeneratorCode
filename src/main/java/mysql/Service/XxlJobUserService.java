package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobUser;
import java.lang.String;

public interface XxlJobUserService {
  Result insertXxlJobUser(XxlJobUser xxlJobUser);

  Result updateXxlJobUser(XxlJobUser xxlJobUser);

  PageResult list(XxlJobUser xxlJobUser);

  Result deleteByIds(String ids);
}
