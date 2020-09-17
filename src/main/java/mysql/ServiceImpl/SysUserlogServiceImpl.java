package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysUserlogMapper;
import com.zjrc.iot.broker.model.biz.SysUserlog;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysUserlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysUserlogServiceImpl implements SysUserlogService {
  @Autowired
  private SysUserlogMapper sysUserlogmapper;

  @Override
  public Result insertSysUserlog(SysUserlog sysUserlog) {
    return null;
  }

  @Override
  public Result updateSysUserlog(SysUserlog sysUserlog) {
    return null;
  }

  @Override
  public PageResult list(SysUserlog sysUserlog) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysUserlog.getPage();
        		PageResult pageRes = new PageResult();
        		sysUserlog.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysUserlogmapper.page(sysUserlog);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysUserlog.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
