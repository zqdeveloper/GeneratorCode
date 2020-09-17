package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizFactoryPercentageMapper;
import com.zjrc.iot.broker.model.biz.BizFactoryPercentage;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizFactoryPercentageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizFactoryPercentageServiceImpl implements BizFactoryPercentageService {
  @Autowired
  private BizFactoryPercentageMapper bizFactoryPercentagemapper;

  @Override
  public Result insertBizFactoryPercentage(BizFactoryPercentage bizFactoryPercentage) {
    return null;
  }

  @Override
  public Result updateBizFactoryPercentage(BizFactoryPercentage bizFactoryPercentage) {
    return null;
  }

  @Override
  public PageResult list(BizFactoryPercentage bizFactoryPercentage) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizFactoryPercentage.getPage();
        		PageResult pageRes = new PageResult();
        		bizFactoryPercentage.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizFactoryPercentagemapper.page(bizFactoryPercentage);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizFactoryPercentage.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
