package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizApiType;
import java.lang.String;

public interface BizApiTypeService {
  Result insertBizApiType(BizApiType bizApiType);

  Result updateBizApiType(BizApiType bizApiType);

  PageResult list(BizApiType bizApiType);

  Result deleteByIds(String ids);
}
