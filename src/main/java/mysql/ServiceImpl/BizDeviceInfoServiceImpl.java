package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceInfoMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceInfo;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceInfoServiceImpl implements BizDeviceInfoService {
  @Autowired
  private BizDeviceInfoMapper bizDeviceInfomapper;

  @Override
  public Result insertBizDeviceInfo(BizDeviceInfo bizDeviceInfo) {
    return null;
  }

  @Override
  public Result updateBizDeviceInfo(BizDeviceInfo bizDeviceInfo) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceInfo bizDeviceInfo) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceInfo.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceInfo.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceInfomapper.page(bizDeviceInfo);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceInfo.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
