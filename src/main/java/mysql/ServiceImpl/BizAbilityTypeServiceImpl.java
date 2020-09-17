package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizAbilityTypeMapper;
import com.zjrc.iot.broker.model.biz.BizAbilityType;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizAbilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizAbilityTypeServiceImpl implements BizAbilityTypeService {
  @Autowired
  private BizAbilityTypeMapper bizAbilityTypemapper;

  @Override
  public Result insertBizAbilityType(BizAbilityType bizAbilityType) {
    return null;
  }

  @Override
  public Result updateBizAbilityType(BizAbilityType bizAbilityType) {
    return null;
  }

  @Override
  public PageResult list(BizAbilityType bizAbilityType) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizAbilityType.getPage();
        		PageResult pageRes = new PageResult();
        		bizAbilityType.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizAbilityTypemapper.page(bizAbilityType);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizAbilityType.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
