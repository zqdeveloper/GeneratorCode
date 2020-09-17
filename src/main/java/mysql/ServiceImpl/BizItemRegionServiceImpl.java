package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizItemRegionMapper;
import com.zjrc.iot.broker.model.biz.BizItemRegion;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizItemRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizItemRegionServiceImpl implements BizItemRegionService {
  @Autowired
  private BizItemRegionMapper bizItemRegionmapper;

  @Override
  public Result insertBizItemRegion(BizItemRegion bizItemRegion) {
    return null;
  }

  @Override
  public Result updateBizItemRegion(BizItemRegion bizItemRegion) {
    return null;
  }

  @Override
  public PageResult list(BizItemRegion bizItemRegion) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizItemRegion.getPage();
        		PageResult pageRes = new PageResult();
        		bizItemRegion.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizItemRegionmapper.page(bizItemRegion);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizItemRegion.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
