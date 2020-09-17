package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysBizUseronlinehistory;
import java.lang.String;

public interface SysBizUseronlinehistoryService {
  Result insertSysBizUseronlinehistory(SysBizUseronlinehistory sysBizUseronlinehistory);

  Result updateSysBizUseronlinehistory(SysBizUseronlinehistory sysBizUseronlinehistory);

  PageResult list(SysBizUseronlinehistory sysBizUseronlinehistory);

  Result deleteByIds(String ids);
}
