package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSouthToIotCharacteristic;
import java.lang.String;

public interface BizSouthToIotCharacteristicService {
  Result insertBizSouthToIotCharacteristic(BizSouthToIotCharacteristic bizSouthToIotCharacteristic);

  Result updateBizSouthToIotCharacteristic(BizSouthToIotCharacteristic bizSouthToIotCharacteristic);

  PageResult list(BizSouthToIotCharacteristic bizSouthToIotCharacteristic);

  Result deleteByIds(String ids);
}
