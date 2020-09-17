package mysql.Controller;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizSouthAnalysisMain;
import java.lang.Exception;
import java.lang.String;
import mysql.Service.BizSouthAnalysisMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(
    method = RequestMethod.POST
)
@RestController
@CrossOrigin
public class BizSouthAnalysisMainController {
  @Autowired
  private BizSouthAnalysisMainService bizSouthAnalysisMainService;

  @ResponseBody
  @RequestMapping("/insert")
  public Result insert(@RequestBody BizSouthAnalysisMain bizSouthAnalysisMain) {
    try {
      return bizSouthAnalysisMainService.insertBizSouthAnalysisMain(bizSouthAnalysisMain);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/update")
  public Result update(@RequestBody BizSouthAnalysisMain bizSouthAnalysisMain) {
    try {
      return bizSouthAnalysisMainService.updateBizSouthAnalysisMain(bizSouthAnalysisMain);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/delete")
  public Result deleteByIds(@RequestBody String ids) {
    try {
      return bizSouthAnalysisMainService.deleteByIds(ids);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/list")
  public PageResult list(@RequestBody BizSouthAnalysisMain bizSouthAnalysisMain) {
    try {
      return bizSouthAnalysisMainService.list(bizSouthAnalysisMain);
    } catch (Exception e) {
       PageResult pageRes = new PageResult();
                      e.printStackTrace();
                      pageRes.setCode(Constant.FAIL_);
                      pageRes.setMsg(Constant.SEARCH_MESSAGE_FAIL);
                      return pageRes;
    }
  }
}
