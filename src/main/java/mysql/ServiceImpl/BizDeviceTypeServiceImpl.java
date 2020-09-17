package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceTypeMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceType;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceTypeServiceImpl implements BizDeviceTypeService {
  @Autowired
  private BizDeviceTypeMapper bizDeviceTypemapper;

  @Override
  public Result insertBizDeviceType(BizDeviceType bizDeviceType) {
    return null;
  }

  @Override
  public Result updateBizDeviceType(BizDeviceType bizDeviceType) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceType bizDeviceType) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceType.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceType.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceTypemapper.page(bizDeviceType);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceType.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
