package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizArea;
import java.lang.String;

public interface SysBizAreaService {
  Result insertSysBizArea(SysBizArea sysBizArea);

  Result updateSysBizArea(SysBizArea sysBizArea);

  PageResult list(SysBizArea sysBizArea);

  Result deleteByIds(String ids);
}
