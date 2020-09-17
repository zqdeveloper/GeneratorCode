package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobGroup;
import java.lang.String;

public interface XxlJobGroupService {
  Result insertXxlJobGroup(XxlJobGroup xxlJobGroup);

  Result updateXxlJobGroup(XxlJobGroup xxlJobGroup);

  PageResult list(XxlJobGroup xxlJobGroup);

  Result deleteByIds(String ids);
}
