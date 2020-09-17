package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizHttpMain;
import java.lang.String;

public interface BizHttpMainService {
  Result insertBizHttpMain(BizHttpMain bizHttpMain);

  Result updateBizHttpMain(BizHttpMain bizHttpMain);

  PageResult list(BizHttpMain bizHttpMain);

  Result deleteByIds(String ids);
}
