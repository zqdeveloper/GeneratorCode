package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusinessDetail;
import java.lang.String;

public interface BizBusinessDetailService {
  Result insertBizBusinessDetail(BizBusinessDetail bizBusinessDetail);

  Result updateBizBusinessDetail(BizBusinessDetail bizBusinessDetail);

  PageResult list(BizBusinessDetail bizBusinessDetail);

  Result deleteByIds(String ids);
}
