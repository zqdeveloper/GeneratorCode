package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDataStream;
import java.lang.String;

public interface BizDataStreamService {
  Result insertBizDataStream(BizDataStream bizDataStream);

  Result updateBizDataStream(BizDataStream bizDataStream);

  PageResult list(BizDataStream bizDataStream);

  Result deleteByIds(String ids);
}
