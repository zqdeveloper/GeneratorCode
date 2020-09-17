package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceTypeCountMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceTypeCount;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceTypeCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceTypeCountServiceImpl implements BizDeviceTypeCountService {
  @Autowired
  private BizDeviceTypeCountMapper bizDeviceTypeCountmapper;

  @Override
  public Result insertBizDeviceTypeCount(BizDeviceTypeCount bizDeviceTypeCount) {
    return null;
  }

  @Override
  public Result updateBizDeviceTypeCount(BizDeviceTypeCount bizDeviceTypeCount) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceTypeCount bizDeviceTypeCount) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceTypeCount.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceTypeCount.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceTypeCountmapper.page(bizDeviceTypeCount);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceTypeCount.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
