package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizUseronlinehistoryMapper;
import com.zjrc.iot.broker.model.biz.SysBizUseronlinehistory;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizUseronlinehistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizUseronlinehistoryServiceImpl implements SysBizUseronlinehistoryService {
  @Autowired
  private SysBizUseronlinehistoryMapper sysBizUseronlinehistorymapper;

  @Override
  public Result insertSysBizUseronlinehistory(SysBizUseronlinehistory sysBizUseronlinehistory) {
    return null;
  }

  @Override
  public Result updateSysBizUseronlinehistory(SysBizUseronlinehistory sysBizUseronlinehistory) {
    return null;
  }

  @Override
  public PageResult list(SysBizUseronlinehistory sysBizUseronlinehistory) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizUseronlinehistory.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizUseronlinehistory.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizUseronlinehistorymapper.page(sysBizUseronlinehistory);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizUseronlinehistory.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
