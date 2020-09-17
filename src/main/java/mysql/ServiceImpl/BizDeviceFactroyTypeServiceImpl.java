package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceFactroyTypeMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceFactroyType;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceFactroyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceFactroyTypeServiceImpl implements BizDeviceFactroyTypeService {
  @Autowired
  private BizDeviceFactroyTypeMapper bizDeviceFactroyTypemapper;

  @Override
  public Result insertBizDeviceFactroyType(BizDeviceFactroyType bizDeviceFactroyType) {
    return null;
  }

  @Override
  public Result updateBizDeviceFactroyType(BizDeviceFactroyType bizDeviceFactroyType) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceFactroyType bizDeviceFactroyType) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceFactroyType.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceFactroyType.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceFactroyTypemapper.page(bizDeviceFactroyType);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceFactroyType.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
