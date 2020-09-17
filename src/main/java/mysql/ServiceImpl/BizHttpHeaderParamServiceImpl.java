package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizHttpHeaderParamMapper;
import com.zjrc.iot.broker.model.biz.BizHttpHeaderParam;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizHttpHeaderParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizHttpHeaderParamServiceImpl implements BizHttpHeaderParamService {
  @Autowired
  private BizHttpHeaderParamMapper bizHttpHeaderParammapper;

  @Override
  public Result insertBizHttpHeaderParam(BizHttpHeaderParam bizHttpHeaderParam) {
    return null;
  }

  @Override
  public Result updateBizHttpHeaderParam(BizHttpHeaderParam bizHttpHeaderParam) {
    return null;
  }

  @Override
  public PageResult list(BizHttpHeaderParam bizHttpHeaderParam) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizHttpHeaderParam.getPage();
        		PageResult pageRes = new PageResult();
        		bizHttpHeaderParam.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizHttpHeaderParammapper.page(bizHttpHeaderParam);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizHttpHeaderParam.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
