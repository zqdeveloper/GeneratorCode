package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDataStreamMapper;
import com.zjrc.iot.broker.model.biz.BizDataStream;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDataStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDataStreamServiceImpl implements BizDataStreamService {
  @Autowired
  private BizDataStreamMapper bizDataStreammapper;

  @Override
  public Result insertBizDataStream(BizDataStream bizDataStream) {
    return null;
  }

  @Override
  public Result updateBizDataStream(BizDataStream bizDataStream) {
    return null;
  }

  @Override
  public PageResult list(BizDataStream bizDataStream) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDataStream.getPage();
        		PageResult pageRes = new PageResult();
        		bizDataStream.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDataStreammapper.page(bizDataStream);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDataStream.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
