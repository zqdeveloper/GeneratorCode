package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobLogReport;
import java.lang.String;

public interface XxlJobLogReportService {
  Result insertXxlJobLogReport(XxlJobLogReport xxlJobLogReport);

  Result updateXxlJobLogReport(XxlJobLogReport xxlJobLogReport);

  PageResult list(XxlJobLogReport xxlJobLogReport);

  Result deleteByIds(String ids);
}
