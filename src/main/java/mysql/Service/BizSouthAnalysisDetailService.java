package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSouthAnalysisDetail;
import java.lang.String;

public interface BizSouthAnalysisDetailService {
  Result insertBizSouthAnalysisDetail(BizSouthAnalysisDetail bizSouthAnalysisDetail);

  Result updateBizSouthAnalysisDetail(BizSouthAnalysisDetail bizSouthAnalysisDetail);

  PageResult list(BizSouthAnalysisDetail bizSouthAnalysisDetail);

  Result deleteByIds(String ids);
}
