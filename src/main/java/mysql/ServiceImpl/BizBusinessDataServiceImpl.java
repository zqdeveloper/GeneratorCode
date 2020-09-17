package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessDataMapper;
import com.zjrc.iot.broker.model.biz.BizBusinessData;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessDataServiceImpl implements BizBusinessDataService {
  @Autowired
  private BizBusinessDataMapper bizBusinessDatamapper;

  @Override
  public Result insertBizBusinessData(BizBusinessData bizBusinessData) {
    return null;
  }

  @Override
  public Result updateBizBusinessData(BizBusinessData bizBusinessData) {
    return null;
  }

  @Override
  public PageResult list(BizBusinessData bizBusinessData) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusinessData.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusinessData.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessDatamapper.page(bizBusinessData);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusinessData.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
