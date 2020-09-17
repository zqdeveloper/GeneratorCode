package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizSouthAnalysisMainMapper;
import com.zjrc.iot.broker.model.biz.BizSouthAnalysisMain;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizSouthAnalysisMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizSouthAnalysisMainServiceImpl implements BizSouthAnalysisMainService {
  @Autowired
  private BizSouthAnalysisMainMapper bizSouthAnalysisMainmapper;

  @Override
  public Result insertBizSouthAnalysisMain(BizSouthAnalysisMain bizSouthAnalysisMain) {
    return null;
  }

  @Override
  public Result updateBizSouthAnalysisMain(BizSouthAnalysisMain bizSouthAnalysisMain) {
    return null;
  }

  @Override
  public PageResult list(BizSouthAnalysisMain bizSouthAnalysisMain) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizSouthAnalysisMain.getPage();
        		PageResult pageRes = new PageResult();
        		bizSouthAnalysisMain.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizSouthAnalysisMainmapper.page(bizSouthAnalysisMain);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizSouthAnalysisMain.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
