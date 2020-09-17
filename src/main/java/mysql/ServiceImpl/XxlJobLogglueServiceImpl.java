package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobLogglueMapper;
import com.zjrc.iot.broker.model.biz.XxlJobLogglue;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobLogglueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobLogglueServiceImpl implements XxlJobLogglueService {
  @Autowired
  private XxlJobLogglueMapper xxlJobLoggluemapper;

  @Override
  public Result insertXxlJobLogglue(XxlJobLogglue xxlJobLogglue) {
    return null;
  }

  @Override
  public Result updateXxlJobLogglue(XxlJobLogglue xxlJobLogglue) {
    return null;
  }

  @Override
  public PageResult list(XxlJobLogglue xxlJobLogglue) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobLogglue.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobLogglue.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobLoggluemapper.page(xxlJobLogglue);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobLogglue.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
