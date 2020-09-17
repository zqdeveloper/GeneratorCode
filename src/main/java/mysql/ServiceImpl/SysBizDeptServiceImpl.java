package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizDeptMapper;
import com.zjrc.iot.broker.model.biz.SysBizDept;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizDeptServiceImpl implements SysBizDeptService {
  @Autowired
  private SysBizDeptMapper sysBizDeptmapper;

  @Override
  public Result insertSysBizDept(SysBizDept sysBizDept) {
    return null;
  }

  @Override
  public Result updateSysBizDept(SysBizDept sysBizDept) {
    return null;
  }

  @Override
  public PageResult list(SysBizDept sysBizDept) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizDept.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizDept.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizDeptmapper.page(sysBizDept);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizDept.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
