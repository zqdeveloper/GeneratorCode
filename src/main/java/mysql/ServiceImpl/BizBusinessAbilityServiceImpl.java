package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessAbilityMapper;
import com.zjrc.iot.broker.model.biz.BizBusinessAbility;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessAbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessAbilityServiceImpl implements BizBusinessAbilityService {
  @Autowired
  private BizBusinessAbilityMapper bizBusinessAbilitymapper;

  @Override
  public Result insertBizBusinessAbility(BizBusinessAbility bizBusinessAbility) {
    return null;
  }

  @Override
  public Result updateBizBusinessAbility(BizBusinessAbility bizBusinessAbility) {
    return null;
  }

  @Override
  public PageResult list(BizBusinessAbility bizBusinessAbility) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusinessAbility.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusinessAbility.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessAbilitymapper.page(bizBusinessAbility);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusinessAbility.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
