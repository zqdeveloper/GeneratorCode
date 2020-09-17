package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBaseData;
import java.lang.String;

public interface BizBaseDataService {
  Result insertBizBaseData(BizBaseData bizBaseData);

  Result updateBizBaseData(BizBaseData bizBaseData);

  PageResult list(BizBaseData bizBaseData);

  Result deleteByIds(String ids);
}
