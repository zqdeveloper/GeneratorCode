package mysql.Controller;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.BizDeviceAgreement;
import java.lang.Exception;
import java.lang.String;
import mysql.Service.BizDeviceAgreementService;
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
public class BizDeviceAgreementController {
  @Autowired
  private BizDeviceAgreementService bizDeviceAgreementService;

  @ResponseBody
  @RequestMapping("/insert")
  public Result insert(@RequestBody BizDeviceAgreement bizDeviceAgreement) {
    try {
      return bizDeviceAgreementService.insertBizDeviceAgreement(bizDeviceAgreement);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/update")
  public Result update(@RequestBody BizDeviceAgreement bizDeviceAgreement) {
    try {
      return bizDeviceAgreementService.updateBizDeviceAgreement(bizDeviceAgreement);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/delete")
  public Result deleteByIds(@RequestBody String ids) {
    try {
      return bizDeviceAgreementService.deleteByIds(ids);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/list")
  public PageResult list(@RequestBody BizDeviceAgreement bizDeviceAgreement) {
    try {
      return bizDeviceAgreementService.list(bizDeviceAgreement);
    } catch (Exception e) {
       PageResult pageRes = new PageResult();
                      e.printStackTrace();
                      pageRes.setCode(Constant.FAIL_);
                      pageRes.setMsg(Constant.SEARCH_MESSAGE_FAIL);
                      return pageRes;
    }
  }
}
