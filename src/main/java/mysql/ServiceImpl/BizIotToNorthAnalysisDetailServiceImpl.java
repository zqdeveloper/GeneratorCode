package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizIotToNorthAnalysisDetailMapper;
import com.zjrc.iot.broker.model.biz.BizIotToNorthAnalysisDetail;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizIotToNorthAnalysisDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizIotToNorthAnalysisDetailServiceImpl implements BizIotToNorthAnalysisDetailService {
  @Autowired
  private BizIotToNorthAnalysisDetailMapper bizIotToNorthAnalysisDetailmapper;

  @Override
  public Result insertBizIotToNorthAnalysisDetail(
      BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail) {
    return null;
  }

  @Override
  public Result updateBizIotToNorthAnalysisDetail(
      BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail) {
    return null;
  }

  @Override
  public PageResult list(BizIotToNorthAnalysisDetail bizIotToNorthAnalysisDetail) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizIotToNorthAnalysisDetail.getPage();
        		PageResult pageRes = new PageResult();
        		bizIotToNorthAnalysisDetail.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizIotToNorthAnalysisDetailmapper.page(bizIotToNorthAnalysisDetail);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizIotToNorthAnalysisDetail.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
