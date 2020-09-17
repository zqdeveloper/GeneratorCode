package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizNorthAnalysisMainMapper;
import com.zjrc.iot.broker.model.biz.BizNorthAnalysisMain;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizNorthAnalysisMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizNorthAnalysisMainServiceImpl implements BizNorthAnalysisMainService {
  @Autowired
  private BizNorthAnalysisMainMapper bizNorthAnalysisMainmapper;

  @Override
  public Result insertBizNorthAnalysisMain(BizNorthAnalysisMain bizNorthAnalysisMain) {
    return null;
  }

  @Override
  public Result updateBizNorthAnalysisMain(BizNorthAnalysisMain bizNorthAnalysisMain) {
    return null;
  }

  @Override
  public PageResult list(BizNorthAnalysisMain bizNorthAnalysisMain) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizNorthAnalysisMain.getPage();
        		PageResult pageRes = new PageResult();
        		bizNorthAnalysisMain.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizNorthAnalysisMainmapper.page(bizNorthAnalysisMain);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizNorthAnalysisMain.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
