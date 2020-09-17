package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBaseDataMapper;
import com.zjrc.iot.broker.model.biz.BizBaseData;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBaseDataServiceImpl implements BizBaseDataService {
  @Autowired
  private BizBaseDataMapper bizBaseDatamapper;

  @Override
  public Result insertBizBaseData(BizBaseData bizBaseData) {
    return null;
  }

  @Override
  public Result updateBizBaseData(BizBaseData bizBaseData) {
    return null;
  }

  @Override
  public PageResult list(BizBaseData bizBaseData) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBaseData.getPage();
        		PageResult pageRes = new PageResult();
        		bizBaseData.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBaseDatamapper.page(bizBaseData);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBaseData.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
