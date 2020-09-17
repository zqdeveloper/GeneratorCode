package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizSouthAnalysisPropMapper;
import com.zjrc.iot.broker.model.biz.BizSouthAnalysisProp;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizSouthAnalysisPropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizSouthAnalysisPropServiceImpl implements BizSouthAnalysisPropService {
  @Autowired
  private BizSouthAnalysisPropMapper bizSouthAnalysisPropmapper;

  @Override
  public Result insertBizSouthAnalysisProp(BizSouthAnalysisProp bizSouthAnalysisProp) {
    return null;
  }

  @Override
  public Result updateBizSouthAnalysisProp(BizSouthAnalysisProp bizSouthAnalysisProp) {
    return null;
  }

  @Override
  public PageResult list(BizSouthAnalysisProp bizSouthAnalysisProp) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizSouthAnalysisProp.getPage();
        		PageResult pageRes = new PageResult();
        		bizSouthAnalysisProp.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizSouthAnalysisPropmapper.page(bizSouthAnalysisProp);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizSouthAnalysisProp.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
