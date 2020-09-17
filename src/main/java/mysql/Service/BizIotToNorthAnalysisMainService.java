package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizIotToNorthAnalysisMain;
import java.lang.String;

public interface BizIotToNorthAnalysisMainService {
  Result insertBizIotToNorthAnalysisMain(BizIotToNorthAnalysisMain bizIotToNorthAnalysisMain);

  Result updateBizIotToNorthAnalysisMain(BizIotToNorthAnalysisMain bizIotToNorthAnalysisMain);

  PageResult list(BizIotToNorthAnalysisMain bizIotToNorthAnalysisMain);

  Result deleteByIds(String ids);
}
