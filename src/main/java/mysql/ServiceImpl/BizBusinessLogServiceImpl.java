package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessLogMapper;
import com.zjrc.iot.broker.model.biz.BizBusinessLog;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessLogServiceImpl implements BizBusinessLogService {
  @Autowired
  private BizBusinessLogMapper bizBusinessLogmapper;

  @Override
  public Result insertBizBusinessLog(BizBusinessLog bizBusinessLog) {
    return null;
  }

  @Override
  public Result updateBizBusinessLog(BizBusinessLog bizBusinessLog) {
    return null;
  }

  @Override
  public PageResult list(BizBusinessLog bizBusinessLog) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusinessLog.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusinessLog.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessLogmapper.page(bizBusinessLog);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusinessLog.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
