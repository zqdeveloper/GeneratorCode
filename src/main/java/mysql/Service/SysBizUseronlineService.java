package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizUseronline;
import java.lang.String;

public interface SysBizUseronlineService {
  Result insertSysBizUseronline(SysBizUseronline sysBizUseronline);

  Result updateSysBizUseronline(SysBizUseronline sysBizUseronline);

  PageResult list(SysBizUseronline sysBizUseronline);

  Result deleteByIds(String ids);
}
