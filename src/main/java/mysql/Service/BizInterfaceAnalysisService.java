package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizInterfaceAnalysis;
import java.lang.String;

public interface BizInterfaceAnalysisService {
  Result insertBizInterfaceAnalysis(BizInterfaceAnalysis bizInterfaceAnalysis);

  Result updateBizInterfaceAnalysis(BizInterfaceAnalysis bizInterfaceAnalysis);

  PageResult list(BizInterfaceAnalysis bizInterfaceAnalysis);

  Result deleteByIds(String ids);
}
