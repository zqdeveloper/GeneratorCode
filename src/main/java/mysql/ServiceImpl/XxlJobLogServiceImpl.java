package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobLogMapper;
import com.zjrc.iot.broker.model.biz.XxlJobLog;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobLogServiceImpl implements XxlJobLogService {
  @Autowired
  private XxlJobLogMapper xxlJobLogmapper;

  @Override
  public Result insertXxlJobLog(XxlJobLog xxlJobLog) {
    return null;
  }

  @Override
  public Result updateXxlJobLog(XxlJobLog xxlJobLog) {
    return null;
  }

  @Override
  public PageResult list(XxlJobLog xxlJobLog) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobLog.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobLog.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobLogmapper.page(xxlJobLog);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobLog.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
