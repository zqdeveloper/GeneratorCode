package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizUseronlineMapper;
import com.zjrc.iot.broker.model.biz.SysBizUseronline;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizUseronlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizUseronlineServiceImpl implements SysBizUseronlineService {
  @Autowired
  private SysBizUseronlineMapper sysBizUseronlinemapper;

  @Override
  public Result insertSysBizUseronline(SysBizUseronline sysBizUseronline) {
    return null;
  }

  @Override
  public Result updateSysBizUseronline(SysBizUseronline sysBizUseronline) {
    return null;
  }

  @Override
  public PageResult list(SysBizUseronline sysBizUseronline) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizUseronline.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizUseronline.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizUseronlinemapper.page(sysBizUseronline);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizUseronline.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
