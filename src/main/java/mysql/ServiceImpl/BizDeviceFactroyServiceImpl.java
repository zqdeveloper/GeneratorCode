package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceFactroyMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceFactroy;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceFactroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceFactroyServiceImpl implements BizDeviceFactroyService {
  @Autowired
  private BizDeviceFactroyMapper bizDeviceFactroymapper;

  @Override
  public Result insertBizDeviceFactroy(BizDeviceFactroy bizDeviceFactroy) {
    return null;
  }

  @Override
  public Result updateBizDeviceFactroy(BizDeviceFactroy bizDeviceFactroy) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceFactroy bizDeviceFactroy) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceFactroy.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceFactroy.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceFactroymapper.page(bizDeviceFactroy);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceFactroy.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
