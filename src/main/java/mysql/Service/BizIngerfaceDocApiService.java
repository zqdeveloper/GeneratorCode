package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizIngerfaceDocApi;
import java.lang.String;

public interface BizIngerfaceDocApiService {
  Result insertBizIngerfaceDocApi(BizIngerfaceDocApi bizIngerfaceDocApi);

  Result updateBizIngerfaceDocApi(BizIngerfaceDocApi bizIngerfaceDocApi);

  PageResult list(BizIngerfaceDocApi bizIngerfaceDocApi);

  Result deleteByIds(String ids);
}
