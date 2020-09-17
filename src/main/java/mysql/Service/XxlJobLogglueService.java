package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.XxlJobLogglue;
import java.lang.String;

public interface XxlJobLogglueService {
  Result insertXxlJobLogglue(XxlJobLogglue xxlJobLogglue);

  Result updateXxlJobLogglue(XxlJobLogglue xxlJobLogglue);

  PageResult list(XxlJobLogglue xxlJobLogglue);

  Result deleteByIds(String ids);
}
