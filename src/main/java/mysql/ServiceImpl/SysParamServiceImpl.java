package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysParamMapper;
import com.zjrc.iot.broker.model.biz.SysParam;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysParamServiceImpl implements SysParamService {
  @Autowired
  private SysParamMapper sysParammapper;

  @Override
  public Result insertSysParam(SysParam sysParam) {
    return null;
  }

  @Override
  public Result updateSysParam(SysParam sysParam) {
    return null;
  }

  @Override
  public PageResult list(SysParam sysParam) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysParam.getPage();
        		PageResult pageRes = new PageResult();
        		sysParam.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysParammapper.page(sysParam);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysParam.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
