package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizApiTypeMapper;
import com.zjrc.iot.broker.model.biz.BizApiType;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizApiTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizApiTypeServiceImpl implements BizApiTypeService {
  @Autowired
  private BizApiTypeMapper bizApiTypemapper;

  @Override
  public Result insertBizApiType(BizApiType bizApiType) {
    return null;
  }

  @Override
  public Result updateBizApiType(BizApiType bizApiType) {
    return null;
  }

  @Override
  public PageResult list(BizApiType bizApiType) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizApiType.getPage();
        		PageResult pageRes = new PageResult();
        		bizApiType.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizApiTypemapper.page(bizApiType);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizApiType.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
