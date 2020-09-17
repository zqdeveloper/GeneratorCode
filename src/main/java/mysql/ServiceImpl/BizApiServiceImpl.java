package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizApiMapper;
import com.zjrc.iot.broker.model.biz.BizApi;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizApiServiceImpl implements BizApiService {
  @Autowired
  private BizApiMapper bizApimapper;

  @Override
  public Result insertBizApi(BizApi bizApi) {
    return null;
  }

  @Override
  public Result updateBizApi(BizApi bizApi) {
    return null;
  }

  @Override
  public PageResult list(BizApi bizApi) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizApi.getPage();
        		PageResult pageRes = new PageResult();
        		bizApi.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizApimapper.page(bizApi);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizApi.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
