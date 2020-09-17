package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobUserMapper;
import com.zjrc.iot.broker.model.biz.XxlJobUser;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobUserServiceImpl implements XxlJobUserService {
  @Autowired
  private XxlJobUserMapper xxlJobUsermapper;

  @Override
  public Result insertXxlJobUser(XxlJobUser xxlJobUser) {
    return null;
  }

  @Override
  public Result updateXxlJobUser(XxlJobUser xxlJobUser) {
    return null;
  }

  @Override
  public PageResult list(XxlJobUser xxlJobUser) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobUser.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobUser.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobUsermapper.page(xxlJobUser);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobUser.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
