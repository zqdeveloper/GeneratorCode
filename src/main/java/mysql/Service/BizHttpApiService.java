package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizHttpApi;
import java.lang.String;

public interface BizHttpApiService {
  Result insertBizHttpApi(BizHttpApi bizHttpApi);

  Result updateBizHttpApi(BizHttpApi bizHttpApi);

  PageResult list(BizHttpApi bizHttpApi);

  Result deleteByIds(String ids);
}
