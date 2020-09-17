package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusinessRegion;
import java.lang.String;

public interface BizBusinessRegionService {
  Result insertBizBusinessRegion(BizBusinessRegion bizBusinessRegion);

  Result updateBizBusinessRegion(BizBusinessRegion bizBusinessRegion);

  PageResult list(BizBusinessRegion bizBusinessRegion);

  Result deleteByIds(String ids);
}
