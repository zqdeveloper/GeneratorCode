package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessMapper;
import com.zjrc.iot.broker.model.biz.BizBusiness;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessServiceImpl implements BizBusinessService {
  @Autowired
  private BizBusinessMapper bizBusinessmapper;

  @Override
  public Result insertBizBusiness(BizBusiness bizBusiness) {
    return null;
  }

  @Override
  public Result updateBizBusiness(BizBusiness bizBusiness) {
    return null;
  }

  @Override
  public PageResult list(BizBusiness bizBusiness) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusiness.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusiness.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessmapper.page(bizBusiness);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusiness.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
