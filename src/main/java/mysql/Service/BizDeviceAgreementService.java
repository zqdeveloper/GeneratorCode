package mysql.Service;

import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceAgreement;
import java.lang.String;

public interface BizDeviceAgreementService {
  Result insertBizDeviceAgreement(BizDeviceAgreement bizDeviceAgreement);

  Result updateBizDeviceAgreement(BizDeviceAgreement bizDeviceAgreement);

  PageResult list(BizDeviceAgreement bizDeviceAgreement);

  Result deleteByIds(String ids);
}
