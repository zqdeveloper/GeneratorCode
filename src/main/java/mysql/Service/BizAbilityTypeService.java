package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizAbilityType;
import java.lang.String;

public interface BizAbilityTypeService {
  Result insertBizAbilityType(BizAbilityType bizAbilityType);

  Result updateBizAbilityType(BizAbilityType bizAbilityType);

  PageResult list(BizAbilityType bizAbilityType);

  Result deleteByIds(String ids);
}
