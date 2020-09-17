package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizBusinessAbility;
import java.lang.String;

public interface BizBusinessAbilityService {
  Result insertBizBusinessAbility(BizBusinessAbility bizBusinessAbility);

  Result updateBizBusinessAbility(BizBusinessAbility bizBusinessAbility);

  PageResult list(BizBusinessAbility bizBusinessAbility);

  Result deleteByIds(String ids);
}
