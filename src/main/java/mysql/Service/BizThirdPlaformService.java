package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizThirdPlaform;
import java.lang.String;

public interface BizThirdPlaformService {
  Result insertBizThirdPlaform(BizThirdPlaform bizThirdPlaform);

  Result updateBizThirdPlaform(BizThirdPlaform bizThirdPlaform);

  PageResult list(BizThirdPlaform bizThirdPlaform);

  Result deleteByIds(String ids);
}
