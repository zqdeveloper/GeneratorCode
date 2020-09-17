package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizThirdPlaformMapper;
import com.zjrc.iot.broker.model.biz.BizThirdPlaform;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizThirdPlaformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizThirdPlaformServiceImpl implements BizThirdPlaformService {
  @Autowired
  private BizThirdPlaformMapper bizThirdPlaformmapper;

  @Override
  public Result insertBizThirdPlaform(BizThirdPlaform bizThirdPlaform) {
    return null;
  }

  @Override
  public Result updateBizThirdPlaform(BizThirdPlaform bizThirdPlaform) {
    return null;
  }

  @Override
  public PageResult list(BizThirdPlaform bizThirdPlaform) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizThirdPlaform.getPage();
        		PageResult pageRes = new PageResult();
        		bizThirdPlaform.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizThirdPlaformmapper.page(bizThirdPlaform);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizThirdPlaform.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
