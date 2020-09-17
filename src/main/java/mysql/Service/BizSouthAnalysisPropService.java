package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSouthAnalysisProp;
import java.lang.String;

public interface BizSouthAnalysisPropService {
  Result insertBizSouthAnalysisProp(BizSouthAnalysisProp bizSouthAnalysisProp);

  Result updateBizSouthAnalysisProp(BizSouthAnalysisProp bizSouthAnalysisProp);

  PageResult list(BizSouthAnalysisProp bizSouthAnalysisProp);

  Result deleteByIds(String ids);
}
