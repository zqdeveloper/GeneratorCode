package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizIngerfaceDocMapper;
import com.zjrc.iot.broker.model.biz.BizIngerfaceDoc;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizIngerfaceDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizIngerfaceDocServiceImpl implements BizIngerfaceDocService {
  @Autowired
  private BizIngerfaceDocMapper bizIngerfaceDocmapper;

  @Override
  public Result insertBizIngerfaceDoc(BizIngerfaceDoc bizIngerfaceDoc) {
    return null;
  }

  @Override
  public Result updateBizIngerfaceDoc(BizIngerfaceDoc bizIngerfaceDoc) {
    return null;
  }

  @Override
  public PageResult list(BizIngerfaceDoc bizIngerfaceDoc) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizIngerfaceDoc.getPage();
        		PageResult pageRes = new PageResult();
        		bizIngerfaceDoc.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizIngerfaceDocmapper.page(bizIngerfaceDoc);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizIngerfaceDoc.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
