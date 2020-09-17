package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobLogReportMapper;
import com.zjrc.iot.broker.model.biz.XxlJobLogReport;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobLogReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobLogReportServiceImpl implements XxlJobLogReportService {
  @Autowired
  private XxlJobLogReportMapper xxlJobLogReportmapper;

  @Override
  public Result insertXxlJobLogReport(XxlJobLogReport xxlJobLogReport) {
    return null;
  }

  @Override
  public Result updateXxlJobLogReport(XxlJobLogReport xxlJobLogReport) {
    return null;
  }

  @Override
  public PageResult list(XxlJobLogReport xxlJobLogReport) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobLogReport.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobLogReport.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobLogReportmapper.page(xxlJobLogReport);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobLogReport.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
