package mysql.Controller;

import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import com.zjrc.iot.broker.model.biz.SysRegion20200619;
import java.lang.Exception;
import java.lang.String;
import mysql.Service.SysRegion20200619Service;
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
public class SysRegion20200619Controller {
  @Autowired
  private SysRegion20200619Service sysRegion20200619Service;

  @ResponseBody
  @RequestMapping("/insert")
  public Result insert(@RequestBody SysRegion20200619 sysRegion20200619) {
    try {
      return sysRegion20200619Service.insertSysRegion20200619(sysRegion20200619);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/update")
  public Result update(@RequestBody SysRegion20200619 sysRegion20200619) {
    try {
      return sysRegion20200619Service.updateSysRegion20200619(sysRegion20200619);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/delete")
  public Result deleteByIds(@RequestBody String ids) {
    try {
      return sysRegion20200619Service.deleteByIds(ids);
    } catch (Exception e) {
      e.printStackTrace();
                return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null);
    }
  }

  @ResponseBody
  @RequestMapping("/list")
  public PageResult list(@RequestBody SysRegion20200619 sysRegion20200619) {
    try {
      return sysRegion20200619Service.list(sysRegion20200619);
    } catch (Exception e) {
       PageResult pageRes = new PageResult();
                      e.printStackTrace();
                      pageRes.setCode(Constant.FAIL_);
                      pageRes.setMsg(Constant.SEARCH_MESSAGE_FAIL);
                      return pageRes;
    }
  }
}
