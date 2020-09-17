package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizHttpPostformParamMapper;
import com.zjrc.iot.broker.model.biz.BizHttpPostformParam;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizHttpPostformParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizHttpPostformParamServiceImpl implements BizHttpPostformParamService {
  @Autowired
  private BizHttpPostformParamMapper bizHttpPostformParammapper;

  @Override
  public Result insertBizHttpPostformParam(BizHttpPostformParam bizHttpPostformParam) {
    return null;
  }

  @Override
  public Result updateBizHttpPostformParam(BizHttpPostformParam bizHttpPostformParam) {
    return null;
  }

  @Override
  public PageResult list(BizHttpPostformParam bizHttpPostformParam) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizHttpPostformParam.getPage();
        		PageResult pageRes = new PageResult();
        		bizHttpPostformParam.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizHttpPostformParammapper.page(bizHttpPostformParam);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizHttpPostformParam.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
