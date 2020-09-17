package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobRegistry;
import java.lang.String;

public interface XxlJobRegistryService {
  Result insertXxlJobRegistry(XxlJobRegistry xxlJobRegistry);

  Result updateXxlJobRegistry(XxlJobRegistry xxlJobRegistry);

  PageResult list(XxlJobRegistry xxlJobRegistry);

  Result deleteByIds(String ids);
}
