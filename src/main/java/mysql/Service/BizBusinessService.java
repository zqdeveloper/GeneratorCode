package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusiness;
import java.lang.String;

public interface BizBusinessService {
  Result insertBizBusiness(BizBusiness bizBusiness);

  Result updateBizBusiness(BizBusiness bizBusiness);

  PageResult list(BizBusiness bizBusiness);

  Result deleteByIds(String ids);
}
