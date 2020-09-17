package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizInterfaceLogMapper;
import com.zjrc.iot.broker.model.biz.BizInterfaceLog;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizInterfaceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizInterfaceLogServiceImpl implements BizInterfaceLogService {
  @Autowired
  private BizInterfaceLogMapper bizInterfaceLogmapper;

  @Override
  public Result insertBizInterfaceLog(BizInterfaceLog bizInterfaceLog) {
    return null;
  }

  @Override
  public Result updateBizInterfaceLog(BizInterfaceLog bizInterfaceLog) {
    return null;
  }

  @Override
  public PageResult list(BizInterfaceLog bizInterfaceLog) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizInterfaceLog.getPage();
        		PageResult pageRes = new PageResult();
        		bizInterfaceLog.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizInterfaceLogmapper.page(bizInterfaceLog);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizInterfaceLog.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
