package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceBusinessTypeMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceBusinessType;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceBusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceBusinessTypeServiceImpl implements BizDeviceBusinessTypeService {
  @Autowired
  private BizDeviceBusinessTypeMapper bizDeviceBusinessTypemapper;

  @Override
  public Result insertBizDeviceBusinessType(BizDeviceBusinessType bizDeviceBusinessType) {
    return null;
  }

  @Override
  public Result updateBizDeviceBusinessType(BizDeviceBusinessType bizDeviceBusinessType) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceBusinessType bizDeviceBusinessType) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceBusinessType.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceBusinessType.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceBusinessTypemapper.page(bizDeviceBusinessType);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceBusinessType.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
