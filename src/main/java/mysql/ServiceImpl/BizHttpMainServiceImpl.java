package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizHttpMainMapper;
import com.zjrc.iot.broker.model.biz.BizHttpMain;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizHttpMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizHttpMainServiceImpl implements BizHttpMainService {
  @Autowired
  private BizHttpMainMapper bizHttpMainmapper;

  @Override
  public Result insertBizHttpMain(BizHttpMain bizHttpMain) {
    return null;
  }

  @Override
  public Result updateBizHttpMain(BizHttpMain bizHttpMain) {
    return null;
  }

  @Override
  public PageResult list(BizHttpMain bizHttpMain) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizHttpMain.getPage();
        		PageResult pageRes = new PageResult();
        		bizHttpMain.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizHttpMainmapper.page(bizHttpMain);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizHttpMain.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
