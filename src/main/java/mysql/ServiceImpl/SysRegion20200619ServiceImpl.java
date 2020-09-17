package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysRegion20200619Mapper;
import com.zjrc.iot.broker.model.biz.SysRegion20200619;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysRegion20200619Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysRegion20200619ServiceImpl implements SysRegion20200619Service {
  @Autowired
  private SysRegion20200619Mapper sysRegion20200619mapper;

  @Override
  public Result insertSysRegion20200619(SysRegion20200619 sysRegion20200619) {
    return null;
  }

  @Override
  public Result updateSysRegion20200619(SysRegion20200619 sysRegion20200619) {
    return null;
  }

  @Override
  public PageResult list(SysRegion20200619 sysRegion20200619) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysRegion20200619.getPage();
        		PageResult pageRes = new PageResult();
        		sysRegion20200619.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysRegion20200619mapper.page(sysRegion20200619);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysRegion20200619.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
