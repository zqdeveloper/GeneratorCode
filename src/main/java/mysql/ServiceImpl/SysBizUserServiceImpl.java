package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizUserMapper;
import com.zjrc.iot.broker.model.biz.SysBizUser;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizUserServiceImpl implements SysBizUserService {
  @Autowired
  private SysBizUserMapper sysBizUsermapper;

  @Override
  public Result insertSysBizUser(SysBizUser sysBizUser) {
    return null;
  }

  @Override
  public Result updateSysBizUser(SysBizUser sysBizUser) {
    return null;
  }

  @Override
  public PageResult list(SysBizUser sysBizUser) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizUser.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizUser.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizUsermapper.page(sysBizUser);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizUser.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
