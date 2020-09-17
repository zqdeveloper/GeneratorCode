package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizInterfaceSuccessRateMapper;
import com.zjrc.iot.broker.model.biz.BizInterfaceSuccessRate;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizInterfaceSuccessRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizInterfaceSuccessRateServiceImpl implements BizInterfaceSuccessRateService {
  @Autowired
  private BizInterfaceSuccessRateMapper bizInterfaceSuccessRatemapper;

  @Override
  public Result insertBizInterfaceSuccessRate(BizInterfaceSuccessRate bizInterfaceSuccessRate) {
    return null;
  }

  @Override
  public Result updateBizInterfaceSuccessRate(BizInterfaceSuccessRate bizInterfaceSuccessRate) {
    return null;
  }

  @Override
  public PageResult list(BizInterfaceSuccessRate bizInterfaceSuccessRate) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizInterfaceSuccessRate.getPage();
        		PageResult pageRes = new PageResult();
        		bizInterfaceSuccessRate.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizInterfaceSuccessRatemapper.page(bizInterfaceSuccessRate);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizInterfaceSuccessRate.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
