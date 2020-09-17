package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysRegionMapper;
import com.zjrc.iot.broker.model.biz.SysRegion;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysRegionServiceImpl implements SysRegionService {
  @Autowired
  private SysRegionMapper sysRegionmapper;

  @Override
  public Result insertSysRegion(SysRegion sysRegion) {
    return null;
  }

  @Override
  public Result updateSysRegion(SysRegion sysRegion) {
    return null;
  }

  @Override
  public PageResult list(SysRegion sysRegion) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysRegion.getPage();
        		PageResult pageRes = new PageResult();
        		sysRegion.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysRegionmapper.page(sysRegion);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysRegion.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
