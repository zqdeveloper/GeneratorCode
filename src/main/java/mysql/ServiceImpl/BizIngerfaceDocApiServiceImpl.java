package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizIngerfaceDocApiMapper;
import com.zjrc.iot.broker.model.biz.BizIngerfaceDocApi;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizIngerfaceDocApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizIngerfaceDocApiServiceImpl implements BizIngerfaceDocApiService {
  @Autowired
  private BizIngerfaceDocApiMapper bizIngerfaceDocApimapper;

  @Override
  public Result insertBizIngerfaceDocApi(BizIngerfaceDocApi bizIngerfaceDocApi) {
    return null;
  }

  @Override
  public Result updateBizIngerfaceDocApi(BizIngerfaceDocApi bizIngerfaceDocApi) {
    return null;
  }

  @Override
  public PageResult list(BizIngerfaceDocApi bizIngerfaceDocApi) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizIngerfaceDocApi.getPage();
        		PageResult pageRes = new PageResult();
        		bizIngerfaceDocApi.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizIngerfaceDocApimapper.page(bizIngerfaceDocApi);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizIngerfaceDocApi.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
