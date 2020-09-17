package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizMonthAnalysis;
import java.lang.String;

public interface BizMonthAnalysisService {
  Result insertBizMonthAnalysis(BizMonthAnalysis bizMonthAnalysis);

  Result updateBizMonthAnalysis(BizMonthAnalysis bizMonthAnalysis);

  PageResult list(BizMonthAnalysis bizMonthAnalysis);

  Result deleteByIds(String ids);
}
