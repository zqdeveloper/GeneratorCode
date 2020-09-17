package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizWhitePaperMapper;
import com.zjrc.iot.broker.model.biz.BizWhitePaper;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizWhitePaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizWhitePaperServiceImpl implements BizWhitePaperService {
  @Autowired
  private BizWhitePaperMapper bizWhitePapermapper;

  @Override
  public Result insertBizWhitePaper(BizWhitePaper bizWhitePaper) {
    return null;
  }

  @Override
  public Result updateBizWhitePaper(BizWhitePaper bizWhitePaper) {
    return null;
  }

  @Override
  public PageResult list(BizWhitePaper bizWhitePaper) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizWhitePaper.getPage();
        		PageResult pageRes = new PageResult();
        		bizWhitePaper.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizWhitePapermapper.page(bizWhitePaper);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizWhitePaper.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
