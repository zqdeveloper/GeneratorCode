package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizMonthAnalysisMapper;
import com.zjrc.iot.broker.model.biz.BizMonthAnalysis;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizMonthAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizMonthAnalysisServiceImpl implements BizMonthAnalysisService {
  @Autowired
  private BizMonthAnalysisMapper bizMonthAnalysismapper;

  @Override
  public Result insertBizMonthAnalysis(BizMonthAnalysis bizMonthAnalysis) {
    return null;
  }

  @Override
  public Result updateBizMonthAnalysis(BizMonthAnalysis bizMonthAnalysis) {
    return null;
  }

  @Override
  public PageResult list(BizMonthAnalysis bizMonthAnalysis) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizMonthAnalysis.getPage();
        		PageResult pageRes = new PageResult();
        		bizMonthAnalysis.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizMonthAnalysismapper.page(bizMonthAnalysis);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizMonthAnalysis.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
