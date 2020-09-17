package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizWhitePaper;
import java.lang.String;

public interface BizWhitePaperService {
  Result insertBizWhitePaper(BizWhitePaper bizWhitePaper);

  Result updateBizWhitePaper(BizWhitePaper bizWhitePaper);

  PageResult list(BizWhitePaper bizWhitePaper);

  Result deleteByIds(String ids);
}
