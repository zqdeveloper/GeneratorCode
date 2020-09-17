package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobGroupMapper;
import com.zjrc.iot.broker.model.biz.XxlJobGroup;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobGroupServiceImpl implements XxlJobGroupService {
  @Autowired
  private XxlJobGroupMapper xxlJobGroupmapper;

  @Override
  public Result insertXxlJobGroup(XxlJobGroup xxlJobGroup) {
    return null;
  }

  @Override
  public Result updateXxlJobGroup(XxlJobGroup xxlJobGroup) {
    return null;
  }

  @Override
  public PageResult list(XxlJobGroup xxlJobGroup) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobGroup.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobGroup.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobGroupmapper.page(xxlJobGroup);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobGroup.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
