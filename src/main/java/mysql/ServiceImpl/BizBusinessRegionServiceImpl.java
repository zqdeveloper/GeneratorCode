package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessRegionMapper;
import com.zjrc.iot.broker.model.biz.BizBusinessRegion;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessRegionServiceImpl implements BizBusinessRegionService {
  @Autowired
  private BizBusinessRegionMapper bizBusinessRegionmapper;

  @Override
  public Result insertBizBusinessRegion(BizBusinessRegion bizBusinessRegion) {
    return null;
  }

  @Override
  public Result updateBizBusinessRegion(BizBusinessRegion bizBusinessRegion) {
    return null;
  }

  @Override
  public PageResult list(BizBusinessRegion bizBusinessRegion) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusinessRegion.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusinessRegion.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessRegionmapper.page(bizBusinessRegion);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusinessRegion.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
