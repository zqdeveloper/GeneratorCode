package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizBusinessDeviceTypeMapper;
import com.zjrc.iot.broker.model.biz.BizBusinessDeviceType;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizBusinessDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizBusinessDeviceTypeServiceImpl implements BizBusinessDeviceTypeService {
  @Autowired
  private BizBusinessDeviceTypeMapper bizBusinessDeviceTypemapper;

  @Override
  public Result insertBizBusinessDeviceType(BizBusinessDeviceType bizBusinessDeviceType) {
    return null;
  }

  @Override
  public Result updateBizBusinessDeviceType(BizBusinessDeviceType bizBusinessDeviceType) {
    return null;
  }

  @Override
  public PageResult list(BizBusinessDeviceType bizBusinessDeviceType) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizBusinessDeviceType.getPage();
        		PageResult pageRes = new PageResult();
        		bizBusinessDeviceType.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizBusinessDeviceTypemapper.page(bizBusinessDeviceType);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizBusinessDeviceType.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
