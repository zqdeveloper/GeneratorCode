package mysql.ServiceImpl;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.dao.biz.SysBizAreaMapper;
import com.zjrc.iot.broker.model.biz.SysBizArea;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import mysql.Service.SysBizAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysBizAreaServiceImpl implements SysBizAreaService {
  @Autowired
  private SysBizAreaMapper sysBizAreamapper;

  @Override
  public Result insertSysBizArea(SysBizArea sysBizArea) {
    return null;
  }

  @Override
  public Result updateSysBizArea(SysBizArea sysBizArea) {
    return null;
  }

  @Override
  public PageResult list(SysBizArea sysBizArea) {
    /*
        		 * 设置对象分页参数
        		 */
        		Page page =sysBizArea.getPage();
        		PageResult pageRes = new PageResult();
        		sysBizArea.setPage(page);
        		// 分页查询
        		List<Map<String, Object>> list = sysBizAreamapper.page(sysBizArea);
        		/*
        		 * 组装响应结果
        		 */
        		pageRes.setAaData(list);
        		if (page.getCurrentPage() != null && page.getPageSize() != null) {
        			pageRes.setItotalRecords(sysBizArea.getPage().getTotalCount());
        		}
        		pageRes.setCode(Constant.SUCCESS_);
        		return pageRes;
  }

  @Override
  public Result deleteByIds(String ids) {
    return null;
  }
}
