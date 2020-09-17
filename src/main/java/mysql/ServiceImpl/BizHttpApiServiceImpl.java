package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizHttpApiMapper;
import com.zjrc.iot.broker.model.biz.BizHttpApi;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizHttpApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizHttpApiServiceImpl implements BizHttpApiService {
  @Autowired
  private BizHttpApiMapper bizHttpApimapper;

  @Override
  public Result insertBizHttpApi(BizHttpApi bizHttpApi) {
    return null;
  }

  @Override
  public Result updateBizHttpApi(BizHttpApi bizHttpApi) {
    return null;
  }

  @Override
  public PageResult list(BizHttpApi bizHttpApi) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizHttpApi.getPage();
        		PageResult pageRes = new PageResult();
        		bizHttpApi.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizHttpApimapper.page(bizHttpApi);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizHttpApi.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
