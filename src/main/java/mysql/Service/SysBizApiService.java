package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizApi;
import java.lang.String;

public interface SysBizApiService {
  Result insertSysBizApi(SysBizApi sysBizApi);

  Result updateSysBizApi(SysBizApi sysBizApi);

  PageResult list(SysBizApi sysBizApi);

  Result deleteByIds(String ids);
}
