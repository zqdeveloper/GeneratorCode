package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizHttpCallbackMapper;
import com.zjrc.iot.broker.model.biz.BizHttpCallback;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizHttpCallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizHttpCallbackServiceImpl implements BizHttpCallbackService {
  @Autowired
  private BizHttpCallbackMapper bizHttpCallbackmapper;

  @Override
  public Result insertBizHttpCallback(BizHttpCallback bizHttpCallback) {
    return null;
  }

  @Override
  public Result updateBizHttpCallback(BizHttpCallback bizHttpCallback) {
    return null;
  }

  @Override
  public PageResult list(BizHttpCallback bizHttpCallback) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizHttpCallback.getPage();
        		PageResult pageRes = new PageResult();
        		bizHttpCallback.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizHttpCallbackmapper.page(bizHttpCallback);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizHttpCallback.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
