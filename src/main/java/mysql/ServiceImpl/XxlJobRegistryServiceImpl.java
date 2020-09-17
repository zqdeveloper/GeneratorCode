package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobRegistryMapper;
import com.zjrc.iot.broker.model.biz.XxlJobRegistry;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobRegistryServiceImpl implements XxlJobRegistryService {
  @Autowired
  private XxlJobRegistryMapper xxlJobRegistrymapper;

  @Override
  public Result insertXxlJobRegistry(XxlJobRegistry xxlJobRegistry) {
    return null;
  }

  @Override
  public Result updateXxlJobRegistry(XxlJobRegistry xxlJobRegistry) {
    return null;
  }

  @Override
  public PageResult list(XxlJobRegistry xxlJobRegistry) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobRegistry.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobRegistry.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobRegistrymapper.page(xxlJobRegistry);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobRegistry.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
