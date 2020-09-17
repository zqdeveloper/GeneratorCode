package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobInfo;
import java.lang.String;

public interface XxlJobInfoService {
  Result insertXxlJobInfo(XxlJobInfo xxlJobInfo);

  Result updateXxlJobInfo(XxlJobInfo xxlJobInfo);

  PageResult list(XxlJobInfo xxlJobInfo);

  Result deleteByIds(String ids);
}
