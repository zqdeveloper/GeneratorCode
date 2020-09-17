package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizUserroleMapper;
import com.zjrc.iot.broker.model.biz.SysBizUserrole;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizUserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizUserroleServiceImpl implements SysBizUserroleService {
  @Autowired
  private SysBizUserroleMapper sysBizUserrolemapper;

  @Override
  public Result insertSysBizUserrole(SysBizUserrole sysBizUserrole) {
    return null;
  }

  @Override
  public Result updateSysBizUserrole(SysBizUserrole sysBizUserrole) {
    return null;
  }

  @Override
  public PageResult list(SysBizUserrole sysBizUserrole) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizUserrole.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizUserrole.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizUserrolemapper.page(sysBizUserrole);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizUserrole.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
