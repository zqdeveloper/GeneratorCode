package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobLockMapper;
import com.zjrc.iot.broker.model.biz.XxlJobLock;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobLockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobLockServiceImpl implements XxlJobLockService {
  @Autowired
  private XxlJobLockMapper xxlJobLockmapper;

  @Override
  public Result insertXxlJobLock(XxlJobLock xxlJobLock) {
    return null;
  }

  @Override
  public Result updateXxlJobLock(XxlJobLock xxlJobLock) {
    return null;
  }

  @Override
  public PageResult list(XxlJobLock xxlJobLock) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobLock.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobLock.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobLockmapper.page(xxlJobLock);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobLock.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
