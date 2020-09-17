package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizIotToNorthAnalysisDetail;
import java.lang.String;

public interface BizIotToNorthAnalysisDetailService {
  Result insertBizIotToNorthAnalysisDetail(BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail);

  Result updateBizIotToNorthAnalysisDetail(BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail);

  PageResult list(BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail);

  Result deleteByIds(String ids);
}
