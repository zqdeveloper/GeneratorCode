package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSouthToIotAnalysisMain;
import java.lang.String;

public interface BizSouthToIotAnalysisMainService {
  Result insertBizSouthToIotAnalysisMain(BizSouthToIotAnalysisMain bizSouthToIotAnalysisMain);

  Result updateBizSouthToIotAnalysisMain(BizSouthToIotAnalysisMain bizSouthToIotAnalysisMain);

  PageResult list(BizSouthToIotAnalysisMain bizSouthToIotAnalysisMain);

  Result deleteByIds(String ids);
}
