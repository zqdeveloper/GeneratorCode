package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizIngerfaceDoc;
import java.lang.String;

public interface BizIngerfaceDocService {
  Result insertBizIngerfaceDoc(BizIngerfaceDoc bizIngerfaceDoc);

  Result updateBizIngerfaceDoc(BizIngerfaceDoc bizIngerfaceDoc);

  PageResult list(BizIngerfaceDoc bizIngerfaceDoc);

  Result deleteByIds(String ids);
}
