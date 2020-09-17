package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizItemRegion;
import java.lang.String;

public interface BizItemRegionService {
  Result insertBizItemRegion(BizItemRegion bizItemRegion);

  Result updateBizItemRegion(BizItemRegion bizItemRegion);

  PageResult list(BizItemRegion bizItemRegion);

  Result deleteByIds(String ids);
}
