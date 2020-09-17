package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizNorthAnalysisDetail;
import java.lang.String;

public interface BizNorthAnalysisDetailService {
  Result insertBizNorthAnalysisDetail(BizNorthAnalysisDetail bizNorthAnalysisDetail);

  Result updateBizNorthAnalysisDetail(BizNorthAnalysisDetail bizNorthAnalysisDetail);

  PageResult list(BizNorthAnalysisDetail bizNorthAnalysisDetail);

  Result deleteByIds(String ids);
}
