package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizApi;
import java.lang.String;

public interface BizApiService {
  Result insertBizApi(BizApi bizApi);

  Result updateBizApi(BizApi bizApi);

  PageResult list(BizApi bizApi);

  Result deleteByIds(String ids);
}
