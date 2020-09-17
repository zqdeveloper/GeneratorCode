package com.zjrc.iot.broker.dao.biz;

import com.zjrc.iot.broker.model.biz.BizDeviceAgreement;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * 设备协议表
 */
public interface BizDeviceAgreementMapper {
  Integer insert(BizDeviceAgreement bizDeviceAgreement);

  Integer update(BizDeviceAgreement bizDeviceAgreement);

  List<Map<String, Object>> page(BizDeviceAgreement bizDeviceAgreement);

  Integer delete(String ids);
}
