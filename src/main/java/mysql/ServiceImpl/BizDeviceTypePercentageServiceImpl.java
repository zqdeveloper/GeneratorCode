package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceTypePercentageMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceTypePercentage;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceTypePercentageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceTypePercentageServiceImpl implements BizDeviceTypePercentageService {
  @Autowired
  private BizDeviceTypePercentageMapper bizDeviceTypePercentagemapper;

  @Override
  public Result insertBizDeviceTypePercentage(BizDeviceTypePercentage bizDeviceTypePercentage) {
    return null;
  }

  @Override
  public Result updateBizDeviceTypePercentage(BizDeviceTypePercentage bizDeviceTypePercentage) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceTypePercentage bizDeviceTypePercentage) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceTypePercentage.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceTypePercentage.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceTypePercentagemapper.page(bizDeviceTypePercentage);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceTypePercentage.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
