package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.BizMqttTopicMapper;
import com.zjrc.iot.broker.model.biz.BizMqttTopic;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.BizMqttTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BizMqttTopicServiceImpl implements BizMqttTopicService {
  @Autowired
  private BizMqttTopicMapper bizMqttTopicmapper;

  @Override
  public Result insertBizMqttTopic(BizMqttTopic bizMqttTopic) {
    return null;
  }

  @Override
  public Result updateBizMqttTopic(BizMqttTopic bizMqttTopic) {
    return null;
  }

  @Override
  public PageResult list(BizMqttTopic bizMqttTopic) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =bizMqttTopic.getPage();
        		PageResult pageRes = new PageResult();
        		bizMqttTopic.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = bizMqttTopicmapper.page(bizMqttTopic);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(bizMqttTopic.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
