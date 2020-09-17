package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizHttpSchedulerMapper;
import com.zjrc.iot.broker.model.biz.BizHttpScheduler;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizHttpSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizHttpSchedulerServiceImpl implements BizHttpSchedulerService {
  @Autowired
  private BizHttpSchedulerMapper bizHttpSchedulermapper;

  @Override
  public Result insertBizHttpScheduler(BizHttpScheduler bizHttpScheduler) {
    return null;
  }

  @Override
  public Result updateBizHttpScheduler(BizHttpScheduler bizHttpScheduler) {
    return null;
  }

  @Override
  public PageResult list(BizHttpScheduler bizHttpScheduler) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizHttpScheduler.getPage();
        		PageResult pageRes = new PageResult();
        		bizHttpScheduler.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizHttpSchedulermapper.page(bizHttpScheduler);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizHttpScheduler.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
