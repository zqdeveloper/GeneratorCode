package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizSouthToIotAnalysisDetailMapper;
import com.zjrc.iot.broker.model.biz.BizSouthToIotAnalysisDetail;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizSouthToIotAnalysisDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizSouthToIotAnalysisDetailServiceImpl implements BizSouthToIotAnalysisDetailService {
  @Autowired
  private BizSouthToIotAnalysisDetailMapper bizSouthToIotAnalysisDetailmapper;

  @Override
  public Result insertBizSouthToIotAnalysisDetail(
      BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail) {
    return null;
  }

  @Override
  public Result updateBizSouthToIotAnalysisDetail(
      BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail) {
    return null;
  }

  @Override
  public PageResult list(BizSouthToIotAnalysisDetail bizSouthToIotAnalysisDetail) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizSouthToIotAnalysisDetail.getPage();
        		PageResult pageRes = new PageResult();
        		bizSouthToIotAnalysisDetail.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizSouthToIotAnalysisDetailmapper.page(bizSouthToIotAnalysisDetail);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizSouthToIotAnalysisDetail.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
