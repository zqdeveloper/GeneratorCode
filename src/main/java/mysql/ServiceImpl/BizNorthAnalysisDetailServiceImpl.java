package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizNorthAnalysisDetailMapper;
import com.zjrc.iot.broker.model.biz.BizNorthAnalysisDetail;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizNorthAnalysisDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizNorthAnalysisDetailServiceImpl implements BizNorthAnalysisDetailService {
  @Autowired
  private BizNorthAnalysisDetailMapper bizNorthAnalysisDetailmapper;

  @Override
  public Result insertBizNorthAnalysisDetail(BizNorthAnalysisDetail bizNorthAnalysisDetail) {
    return null;
  }

  @Override
  public Result updateBizNorthAnalysisDetail(BizNorthAnalysisDetail bizNorthAnalysisDetail) {
    return null;
  }

  @Override
  public PageResult list(BizNorthAnalysisDetail bizNorthAnalysisDetail) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizNorthAnalysisDetail.getPage();
        		PageResult pageRes = new PageResult();
        		bizNorthAnalysisDetail.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizNorthAnalysisDetailmapper.page(bizNorthAnalysisDetail);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizNorthAnalysisDetail.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
