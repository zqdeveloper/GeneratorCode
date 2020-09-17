package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysIpMapper;
import com.zjrc.iot.broker.model.biz.SysIp;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysIpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysIpServiceImpl implements SysIpService {
  @Autowired
  private SysIpMapper sysIpmapper;

  @Override
  public Result insertSysIp(SysIp sysIp) {
    return null;
  }

  @Override
  public Result updateSysIp(SysIp sysIp) {
    return null;
  }

  @Override
  public PageResult list(SysIp sysIp) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysIp.getPage();
        		PageResult pageRes = new PageResult();
        		sysIp.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysIpmapper.page(sysIp);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysIp.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
