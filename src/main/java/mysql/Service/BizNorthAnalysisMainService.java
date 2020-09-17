package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizNorthAnalysisMain;
import java.lang.String;

public interface BizNorthAnalysisMainService {
  Result insertBizNorthAnalysisMain(BizNorthAnalysisMain bizNorthAnalysisMain);

  Result updateBizNorthAnalysisMain(BizNorthAnalysisMain bizNorthAnalysisMain);

  PageResult list(BizNorthAnalysisMain bizNorthAnalysisMain);

  Result deleteByIds(String ids);
}
