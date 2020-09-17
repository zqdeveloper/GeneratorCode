package mysql.Controller;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceTypePercentage;
import java.lang.Exception;
import java.lang.String;
import mysql.Service.BizDeviceTypePercentageService;
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
public class BizDeviceTypePercentageController {
  @Autowired
  private BizDeviceTypePercentageService bizDeviceTypePercentageService;

  @ResponseBody
  @RequestMapping("/insert")
  public Result insert(@RequestBody BizDeviceTypePercentage bizDeviceTypePercentage) {
    try {
      return bizDeviceTypePercentageService.insertBizDeviceTypePercentage(bizDeviceTypePercentage);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/update")
  public Result update(@RequestBody BizDeviceTypePercentage bizDeviceTypePercentage) {
    try {
      return bizDeviceTypePercentageService.updateBizDeviceTypePercentage(bizDeviceTypePercentage);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/delete")
  public Result deleteByIds(@RequestBody String ids) {
    try {
      return bizDeviceTypePercentageService.deleteByIds(ids);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/list")
  public PageResult list(@RequestBody BizDeviceTypePercentage bizDeviceTypePercentage) {
    try {
      return bizDeviceTypePercentageService.list(bizDeviceTypePercentage);
    } catch (Exception e) {
       PageResult pageRes = new PageResult();
                      e.printStackTrace();
                      pageRes.setCode(Constant.FAIL_);
                      pageRes.setMsg(Constant.SEARCH_MESSAGE_FAIL);
                      return pageRes;
    }
  }
}
