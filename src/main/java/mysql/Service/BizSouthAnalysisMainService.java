package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSouthAnalysisMain;
import java.lang.String;

public interface BizSouthAnalysisMainService {
  Result insertBizSouthAnalysisMain(BizSouthAnalysisMain bizSouthAnalysisMain);

  Result updateBizSouthAnalysisMain(BizSouthAnalysisMain bizSouthAnalysisMain);

  PageResult list(BizSouthAnalysisMain bizSouthAnalysisMain);

  Result deleteByIds(String ids);
}
