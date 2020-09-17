package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessDetailMapper;
import com.zjrc.iot.broker.model.biz.BizBusinessDetail;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessDetailServiceImpl implements BizBusinessDetailService {
  @Autowired
  private BizBusinessDetailMapper bizBusinessDetailmapper;

  @Override
  public Result insertBizBusinessDetail(BizBusinessDetail bizBusinessDetail) {
    return null;
  }

  @Override
  public Result updateBizBusinessDetail(BizBusinessDetail bizBusinessDetail) {
    return null;
  }

  @Override
  public PageResult list(BizBusinessDetail bizBusinessDetail) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusinessDetail.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusinessDetail.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessDetailmapper.page(bizBusinessDetail);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusinessDetail.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
