package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizSouthToIotCharacteristicMapper;
import com.zjrc.iot.broker.model.biz.BizSouthToIotCharacteristic;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizSouthToIotCharacteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizSouthToIotCharacteristicServiceImpl implements BizSouthToIotCharacteristicService {
  @Autowired
  private BizSouthToIotCharacteristicMapper bizSouthToIotCharacteristicmapper;

  @Override
  public Result insertBizSouthToIotCharacteristic(
      BizSouthToIotCharacteristic bizSouthToIotCharacteristic) {
    return null;
  }

  @Override
  public Result updateBizSouthToIotCharacteristic(
      BizSouthToIotCharacteristic bizSouthToIotCharacteristic) {
    return null;
  }

  @Override
  public PageResult list(BizSouthToIotCharacteristic bizSouthToIotCharacteristic) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizSouthToIotCharacteristic.getPage();
        		PageResult pageRes = new PageResult();
        		bizSouthToIotCharacteristic.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizSouthToIotCharacteristicmapper.page(bizSouthToIotCharacteristic);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizSouthToIotCharacteristic.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
