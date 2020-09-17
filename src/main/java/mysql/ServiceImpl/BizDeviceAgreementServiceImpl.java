package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizDeviceAgreementMapper;
import com.zjrc.iot.broker.model.biz.BizDeviceAgreement;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizDeviceAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizDeviceAgreementServiceImpl implements BizDeviceAgreementService {
  @Autowired
  private BizDeviceAgreementMapper bizDeviceAgreementmapper;

  @Override
  public Result insertBizDeviceAgreement(BizDeviceAgreement bizDeviceAgreement) {
    return null;
  }

  @Override
  public Result updateBizDeviceAgreement(BizDeviceAgreement bizDeviceAgreement) {
    return null;
  }

  @Override
  public PageResult list(BizDeviceAgreement bizDeviceAgreement) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizDeviceAgreement.getPage();
        		PageResult pageRes = new PageResult();
        		bizDeviceAgreement.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizDeviceAgreementmapper.page(bizDeviceAgreement);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizDeviceAgreement.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
