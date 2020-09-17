package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizApiMapper;
import com.zjrc.iot.broker.model.biz.SysBizApi;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizApiServiceImpl implements SysBizApiService {
  @Autowired
  private SysBizApiMapper sysBizApimapper;

  @Override
  public Result insertSysBizApi(SysBizApi sysBizApi) {
    return null;
  }

  @Override
  public Result updateSysBizApi(SysBizApi sysBizApi) {
    return null;
  }

  @Override
  public PageResult list(SysBizApi sysBizApi) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizApi.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizApi.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizApimapper.page(sysBizApi);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizApi.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
