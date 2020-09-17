package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizSourthCallbackUrlMapper;
import com.zjrc.iot.broker.model.biz.BizSourthCallbackUrl;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizSourthCallbackUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizSourthCallbackUrlServiceImpl implements BizSourthCallbackUrlService {
  @Autowired
  private BizSourthCallbackUrlMapper bizSourthCallbackUrlmapper;

  @Override
  public Result insertBizSourthCallbackUrl(BizSourthCallbackUrl bizSourthCallbackUrl) {
    return null;
  }

  @Override
  public Result updateBizSourthCallbackUrl(BizSourthCallbackUrl bizSourthCallbackUrl) {
    return null;
  }

  @Override
  public PageResult list(BizSourthCallbackUrl bizSourthCallbackUrl) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizSourthCallbackUrl.getPage();
        		PageResult pageRes = new PageResult();
        		bizSourthCallbackUrl.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizSourthCallbackUrlmapper.page(bizSourthCallbackUrl);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizSourthCallbackUrl.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
