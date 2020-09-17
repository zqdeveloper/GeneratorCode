package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizSouthAnalysisDetailMapper;
import com.zjrc.iot.broker.model.biz.BizSouthAnalysisDetail;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizSouthAnalysisDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizSouthAnalysisDetailServiceImpl implements BizSouthAnalysisDetailService {
  @Autowired
  private BizSouthAnalysisDetailMapper bizSouthAnalysisDetailmapper;

  @Override
  public Result insertBizSouthAnalysisDetail(BizSouthAnalysisDetail bizSouthAnalysisDetail) {
    return null;
  }

  @Override
  public Result updateBizSouthAnalysisDetail(BizSouthAnalysisDetail bizSouthAnalysisDetail) {
    return null;
  }

  @Override
  public PageResult list(BizSouthAnalysisDetail bizSouthAnalysisDetail) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizSouthAnalysisDetail.getPage();
        		PageResult pageRes = new PageResult();
        		bizSouthAnalysisDetail.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizSouthAnalysisDetailmapper.page(bizSouthAnalysisDetail);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizSouthAnalysisDetail.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
