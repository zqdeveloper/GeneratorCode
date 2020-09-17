package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessDeviceStatusMapper;
import com.zjrc.iot.broker.model.biz.BizBusinessDeviceStatus;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessDeviceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessDeviceStatusServiceImpl implements BizBusinessDeviceStatusService {
  @Autowired
  private BizBusinessDeviceStatusMapper bizBusinessDeviceStatusmapper;

  @Override
  public Result insertBizBusinessDeviceStatus(BizBusinessDeviceStatus bizBusinessDeviceStatus) {
    return null;
  }

  @Override
  public Result updateBizBusinessDeviceStatus(BizBusinessDeviceStatus bizBusinessDeviceStatus) {
    return null;
  }

  @Override
  public PageResult list(BizBusinessDeviceStatus bizBusinessDeviceStatus) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusinessDeviceStatus.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusinessDeviceStatus.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessDeviceStatusmapper.page(bizBusinessDeviceStatus);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusinessDeviceStatus.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
