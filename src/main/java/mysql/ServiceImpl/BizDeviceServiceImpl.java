package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceMapper;
import com.zjrc.iot.broker.model.biz.BizDevice;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceServiceImpl implements BizDeviceService {
  @Autowired
  private BizDeviceMapper bizDevicemapper;

  @Override
  public Result insertBizDevice(BizDevice bizDevice) {
    return null;
  }

  @Override
  public Result updateBizDevice(BizDevice bizDevice) {
    return null;
  }

  @Override
  public PageResult list(BizDevice bizDevice) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDevice.getPage();
        		PageResult pageRes = new PageResult();
        		bizDevice.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDevicemapper.page(bizDevice);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDevice.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
