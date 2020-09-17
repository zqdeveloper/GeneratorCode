package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSouthToIotAnalysisDetail;
import java.lang.String;

public interface BizSouthToIotAnalysisDetailService {
  Result insertBizSouthToIotAnalysisDetail(BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail);

  Result updateBizSouthToIotAnalysisDetail(BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail);

  PageResult list(BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail);

  Result deleteByIds(String ids);
}
