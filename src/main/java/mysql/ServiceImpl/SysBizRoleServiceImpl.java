package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizRoleMapper;
import com.zjrc.iot.broker.model.biz.SysBizRole;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizRoleServiceImpl implements SysBizRoleService {
  @Autowired
  private SysBizRoleMapper sysBizRolemapper;

  @Override
  public Result insertSysBizRole(SysBizRole sysBizRole) {
    return null;
  }

  @Override
  public Result updateSysBizRole(SysBizRole sysBizRole) {
    return null;
  }

  @Override
  public PageResult list(SysBizRole sysBizRole) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizRole.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizRole.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizRolemapper.page(sysBizRole);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizRole.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
