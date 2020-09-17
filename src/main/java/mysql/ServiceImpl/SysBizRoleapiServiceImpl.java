package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizRoleapiMapper;
import com.zjrc.iot.broker.model.biz.SysBizRoleapi;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizRoleapiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizRoleapiServiceImpl implements SysBizRoleapiService {
  @Autowired
  private SysBizRoleapiMapper sysBizRoleapimapper;

  @Override
  public Result insertSysBizRoleapi(SysBizRoleapi sysBizRoleapi) {
    return null;
  }

  @Override
  public Result updateSysBizRoleapi(SysBizRoleapi sysBizRoleapi) {
    return null;
  }

  @Override
  public PageResult list(SysBizRoleapi sysBizRoleapi) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizRoleapi.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizRoleapi.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizRoleapimapper.page(sysBizRoleapi);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizRoleapi.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
