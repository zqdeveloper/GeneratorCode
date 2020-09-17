package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.XxlJobInfoMapper;
import com.zjrc.iot.broker.model.biz.XxlJobInfo;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.XxlJobInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class XxlJobInfoServiceImpl implements XxlJobInfoService {
  @Autowired
  private XxlJobInfoMapper xxlJobInfomapper;

  @Override
  public Result insertXxlJobInfo(XxlJobInfo xxlJobInfo) {
    return null;
  }

  @Override
  public Result updateXxlJobInfo(XxlJobInfo xxlJobInfo) {
    return null;
  }

  @Override
  public PageResult list(XxlJobInfo xxlJobInfo) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =xxlJobInfo.getPage();
        		PageResult pageRes = new PageResult();
        		xxlJobInfo.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = xxlJobInfomapper.page(xxlJobInfo);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(xxlJobInfo.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
