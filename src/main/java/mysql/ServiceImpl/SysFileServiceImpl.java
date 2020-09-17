package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysFileMapper;
import com.zjrc.iot.broker.model.biz.SysFile;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysFileServiceImpl implements SysFileService {
  @Autowired
  private SysFileMapper sysFilemapper;

  @Override
  public Result insertSysFile(SysFile sysFile) {
    return null;
  }

  @Override
  public Result updateSysFile(SysFile sysFile) {
    return null;
  }

  @Override
  public PageResult list(SysFile sysFile) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysFile.getPage();
        		PageResult pageRes = new PageResult();
        		sysFile.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysFilemapper.page(sysFile);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysFile.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
