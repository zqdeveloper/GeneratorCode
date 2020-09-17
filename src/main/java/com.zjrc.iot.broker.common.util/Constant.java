package com.zjrc.iot.broker.common.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 常量类
 */
public class Constant {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    public  @interface ACF {
        CF CF(); // 表示通用字段
    }

    public static enum CF {
        CREATEUSERID("createUserId"), CREATEDATE("createDate"), MODIFYUSERID("modifyUserId"), MODIFYDATE("modifyDate"), STATUS("status");

        private String cmmName;

        private CF(String cmmName) {
            this.cmmName = cmmName;
        }

        public String getCmmName() {
            return cmmName;
        }
    }

    /**
     * 响应成功 {@value}
     */
    public static final Integer SUCCESS_ = 0;

    /**
     * 响应失败 {@value}
     */
    public static final Integer FAIL_ = 1;

    /**
     * 响应失败 {@value}
     */
    public static final Integer OTHER_ = 2;

    /**
     * 弱密码字典缓存
     */
    public final static String REDIS_PWD_VERIFY = "IOT_BROKER:BROKERLOCK_WEAK_PASSWORD";

    /**
     * 数据字典缓存
     */
    public final static String REDIS_SYS_PARAM = "IOT_BROKER:REDIS_SYS_PARAM:";

    /**
     * 接口信息缓存
     */
    public final static String REDIS_BIZ_API = "IOT_BROKER:REDIS_BIZ_API:";

    /**
     * appkey token 缓存
     */
    public final static String REDIS_APPKEY_TOKEN = "IOT_BROKER:APPKEY:";

    /**
     * appKey对应的请求次数
     */
    public final static String REDIS_APPKEY_REQUEST_COUNT = "IOT_BROKER:APPKEY_REQUEST_COUNT:";

    /**
     * token失效 {@value}
     */
    public static final Integer TOKEN_INVAILD = 99;

    /**
     * 失败
     */
    public static final String IS_SUCCESS_NO = "0";

    /**
     * 成功
     */
    public static final String IS_SUCCESS_YES = "1";

    /**
     * 数据库记录 无效
     */
    public static final String IS_VALID_NO = "0";

    /**
     * 数据库记录 有效
     */
    public static final String IS_VALID_YES = "1";

    /**
     * 文件视频格式 {@value}
     */
    public static final String FILE_VIDEO_TYPE = "mp4";

    /**
     * 加载配置文件异常 {@value}
     */
    public static final String CONF_FAIL = "加载配置文件异常";

    /**
     * session
     */
    public final static String MYSESSIONID = "MYSESSIONID";
    public final static String MYDOMAIN = null;

    /**
     * 缓存过期时间-3分钟 {@value}
     */
    public final static int REDIS_TIME_OUT_THREE_MINUTES = 180;

    /**
     * 缓存过期时间-5分钟 {@value}
     */
    public final static int REDIS_TIME_OUT_FIVE_MINUTES = 300;

    /**
     * 缓存过期时间-10分钟 {@value}
     */
    public final static int REDIS_TIME_OUT_TEN_MINUTES = 600;

    /**
     * 缓存过期时间-30分钟 {@value}
     */
    public final static int REDIS_TIME_OUT_30MINUTES = 1800;

    /**
     * 缓存过期时间-2小时 {@value}
     */
    public final static int REDIS_TIME_OUT_2HOUR = 7200;

    /**
     * 缓存过期时间-12小时 {@value}
     */
    public final static int REDIS_TIME_OUT_12HOUR = 43200;

    /**
     * 缓存过期时间-24小时 {@value}
     */
    public final static int REDIS_TIME_OUT_24HOUR = 86400;

    /**
     * 缓存过期时间-36小时 {@value}
     */
    public final static int REDIS_TIME_OUT_36HOUR = 129600;

    /**
     * 缓存过期时间-48小时 {@value}
     */
    public final static int REDIS_TIME_OUT_48HOUR = 172800;

    /**
     * 缓存过期时间-7天 {@value}
     */
    public final static int REDIS_TIME_OUT_SEVER_DAYS = 604800;

    /**
     * 数据字典缓存有效时间 30天 {@value}
     */
    public final static int REDIS_PARAM_TIME_OUT = 2592000;

    /**
     * RESTAPI 返回成功code 200
     */
    public final static int RESTAPI_SUCCESS = 200;

    /**
     * RESTAPI 返回失败404
     */
    public final static int RESTAPI_FAILD = 404;


    /**
     * 客户端类型 IOS {@value}
     */
    public static final String IOS_DEVICE_TYPE = "1";
    /**
     * 客户端类型 Web {@value}
     */
    public static final String WEB_DEVICE_TYPE = "2";
    /**
     * 客户端类型 Other {@value}
     */
    public static final String OTHER_DEVICE_TYPE = "3";

    /*
     * count列
     */
    public static final String COLUMN_COUNT = "count";

    /**
     * 登录用户ID
     */
    public final static String REDIS_LOGINUSERID = "BROKERLOCK:REDIS:LOGINUSERID";

    /**
     * 登录用户token
     */
    public final static String REDIS_LOGINUSERTOKEN = "BROKERLOCK:REDIS:LOGINUSERTOKEN";

    /**
     * MD5加密前缀
     */
    public static final String PASSWORD_PREFIX_MD5 = "Zjiotb@10_";

    /**
     * 查询数据失败
     */
    public static final String SEARCH_MESSAGE_FAIL = "查询数据失败";
    /**
     * 查询数据成功
     */
    public static final String SEARCH_MESSAGE_SUCCESS = "查询数据成功";
    /**
     * 添加数据失败
     */
    public static final String ADD_MESSAGE_FAIL = "添加数据失败";
    /**
     * 添加数据成功
     */
    public static final String ADD_MESSAGE_SUCCESS = "添加数据成功";
    /**
     * 修改数据失败
     */
    public static final String UPDATE_MESSAGE_FAIL = "修改数据失败";
    /**
     * 修改数据成功
     */
    public static final String UPDATE_MESSAGE_SUCCESS = "修改数据成功";
    /**
     * 删除数据失败
     */
    public static final String DELETE_MESSAGE_FAIL = "删除数据失败";
    /**
     * 删除数据成功
     */
    public static final String DELETE_MESSAGE_SUCCESS = "删除数据成功";

    /**
     * 操作数据成功
     */
    public static final String OPERATE_MESSAGE_SUCCESS = "操作成功";
    /**
     * 操作数据失败
     */
    public static final String OPERATE_MESSAGE_FAIL = "操作失败";

    /**
     * 处理成功
     */
    public static final String DEAL_MESSAGE_SUCCESS = "处理成功";

    /**
     * 处理失败
     */
    public static final String DEAL_MESSAGE_FAIL = "处理失败";

    /**
     * 上传文件成功
     */
    public static final String UPLOAD_FILE_SUCCESS = "上传文件成功";

    /**
     * 上传文件失败
     */
    public static final String UPLOAD_FILE_FAIL = "上传文件失败";

    /**
     * 下载文件成功
     */
    public static final String DOWNLOAD_FILE_SUCCESS = "下载文件成功";

    /**
     * 下载文件失败
     */
    public static final String DOWNLOAD_FILE_FAIL = "下载文件失败";

    /**
     * 下载文件不存在
     */
    public static final String DOWNLOAD_FILE_NOT_EXIST = "下载文件不存在";

    /**
     * 上传的文件不能大于10M
     */
    public static final String UPLOAD_FILE_SIZE_LIMIT = "上传文件失败【文件大小不能超过10M】";

    /**
     * 删除文件失败
     */
    public static final String DELETE_FILE_FAIL = "删除文件失败";

    /**
     * 删除文件成功
     */
    public static final String DELETE_FILE_SUCCESS = "删除文件成功";

    /**
     * SQL报错
     */
    public static final String SQL_MESSAGE_SUCCESS = "数据库异常";
    /**
     * 获取参数异常
     */
    public static final String PARAM_FAIL = "获取参数异常";
    /**
     * 数据不存在或已删除
     */
    public static final String DATA_NOT_EXIST = "数据不存在或已删除";

    /**
     * 下行指令数据表
     */
    public static final String TABLE_SEND_COMMAND = "i_send_command";

    /**
     * 上行指令数据表
     */
    public static final String TABLE_RECIEVE_DATA = "i_recieve_data";

    /**
     * 需重新推送数据表
     */
    public static final String TABLE_RESEND_DATA = "i_resend_data";

    /**
     * 推送状态-成功
     */
    public static final String SEND_SUCCESS = "1";

    /**
     * 操作日志表
     */
    public static final String TABLE_USER_LOG = "i_user_log";

    /**
     * 接口调用日志表
     */
    public static final String TABLE_INTERFACE_LOG = "i_interface_log";

    /**
     * 操作日志表
     */
    public static final String TABLE_PUSH_FAILD = "i_push_faild";

    /**
     * 数据流入库表
     */
    public static final String TABLE_DATA_STREAM = "i_data_stream";

    /**
     * influxDB表：接口中心接口调用数据表
     */
    public static final String TABLE_APICENTER_DATA = "i_apiCenter_sync_data";

    /**
     * 推送状态-失败
     */
    public static final String SEND_FALSE = "0";

    /**
     * 上行指令-终端通用应答
     */
    public static final String UPSTREAM_TYPE_FEEDBACK = "feedback";

    /**
     * 上行指令-开锁日志
     */
    public static final String UPSTREAM_TYPE_LOG = "log";

    /**
     * 上行指令-设备报警
     */
    public static final String UPSTREAM_TYPE_WARNING = "warning";

    /**
     * 上行指令-心跳
     */
    public static final String UPSTREAM_TYPE_HEARTBEAT = "heartbeat";

    /**
     * 下行指令-平台通用应答
     */
    public static final String DOWNSTREAM_TYPE_NOTIFY = "notify";

    /**
     * 下行指令-新增NFC
     */
    public static final String DOWNSTREAM_TYPE_NFC_ADD = "nfc_add";

    /**
     * 下行指令-删除NFC
     */
    public static final String DOWNSTREAM_TYPE_NFC_DELETE = "nfc_delete";

    /**
     * 下行指令-推送指脉
     */
    public static final String DOWNSTREAM_TYPE_FINGERVEIN_DATA_PUSH = "fingervein_data_push";

    /**
     * 下行指令-分包推送指脉
     */
    public static final String DOWNSTREAM_TYPE_FINGERVEIN_DATA_PUSH_MULTIPLE = "fingervein_data_push_multiple";

    /**
     * 下行指令-能力管理
     */
    public static final String DOWNSTREAM_TYPE_ABILITY_MANAGE = "ability_manage";

    /**
     * 下行指令-清空指静脉或指纹
     */
    public static final String DOWNSTREAM_TYPE_CLEAR_FINGERPRINT = "clear_fingerprint";

    /**
     * 下行指令-主题前缀
     */
    public static final String DOWNSTREAM_TOPIC_PREFIX = "/device/lock";

    /**
     * 下行指令-主题中间
     */
    public static final String DOWNSTREAM_TOPIC_MIDDLE = "/direct";

    /**
     * 下行指令-主题后缀
     */
    public static final String DOWNSTREAM_TOPIC_SUFFIX = "/downstream";

    /**
     * 公租房平台rest接口-开锁日志
     */
    public static final String GONGZUFANG_API_LOG = "/iot/lock/devNotify/v1/log";

    /**
     * 公租房平台rest接口-设备报警
     */
    public static final String GONGZUFANG_API_WARNING = "/iot/lock/devNotify/v1/warning";

    /**
     * 公租房平台rest接口-通用应答
     */
    public static final String GONGZUFANG_API_FEEDBACK = "/iot/lock/devNotify/v1/feedback";

    /**
     * 公租房平台rest接口-设备心跳
     */
    public static final String GONGZUFANG_API_HEARTBEAT = "/iot/lock/devNotify/v1/heartbeat";

    /**
     * 分包-是
     */
    public static final String MULTIPLE_YES = "1";

    /**
     * 分包-否
     */
    public static final String MULTIPLE_NO = "0";

    /**
     * 自动生成编码前缀-系统部门
     */
    public final static String SYSTEM_DEPT = "SD_";
    /**
     * 默认密码前缀
     */
    public static final String PASSWORD_PREFIX = "Zjiotb@10_";

    /**
     * 自动生成编码前缀-系统用户
     */
    public final static String SYSTEM_USER = "SU_";

    /**
     * 自动生成编码前缀-设备企业
     */
    public final static String BIZ_CORP = "CO_";

    /**
     * 自动生成编码前缀-业务
     */
    public final static String BIZ_BUSSINESS = "BS_";

    /**
     * 自动生成编码前缀-数据流
     */
    public final static String BIZ_DATASTREAM = "BD_";

    /**
     * 自动生成编码前缀-定时任务
     */
    public final static String BIZ_HTTPSCHEDULER = "BH_";

    /**
     * 自动生成编码前缀-http任务
     */
    public final static String BIZ_HTTPMAIN = "HM_";

    /**
     * 自动生成编码前缀-httpApi
     */
    public final static String BIZ_HTTPAPI = "HA_";

    /**
     * 自动生成编码前缀-数据流
     */
    public final static String BIZ_CALLBACK = "CB_";

    /**
     * 用户状态-启用
     */
    public static final String USER_STATE_OPEN = "1";

    /**
     * 用户状态-停用
     */
    public static final String USER_STATE_CLOSE = "0";

    /**
     * 自动生成编码前缀-系统菜单
     */
    public final static String SYSTEM_API = "SA_";

    /**
     * 自动生成编码前缀-接口信息
     */
    public final static String BIZ_API = "BA_";

    /**
     * 自动生成编码前缀-接口信息
     */
    public final static String BIZ_API_TYPE = "AT_";

    /**
     * 自动生成编码前缀-建筑物
     */
    public final static String BIZ_DEVICEBUILDING = "BB_";
    /**
     * 自动生成编码前缀-设备信息
     */
    public final static String BIZ_DEVICEINTERFACE = "BI_";

    /**
     * 自动生成编码前缀-设备类型
     */
    public final static String BIZ_DEVICETYPE = "BT_";
    /**
     * 自动生成编码前缀-系统角色
     */
    public final static String SYSTEM_ROLE = "SR_";

    /**
     * 数据范围-全部 {@value}
     */
    public static final String ROLE_DATASCOPE_PERSONAL = "0";

    /**
     * 登录用户
     */
    public final static String REDIS_LOGINUSER = "BROKERLOCK:REDIS:LOGINUSER";

    /**
     * 当前用户有效token 拼接第一部分
     */
    public final static String REDIS_LEGALTOKEN_1 = "BROKERLOCK:REDIS:USER:";
    /**
     * 当前用户有效token 拼接第二部分
     */
    public final static String REDIS_LEGALTOKEN_2 = ":LEGALTOKEN:";

    /**
     * 在线状态-是
     */
    public static final String ONLINE_STATUS_Y = "1";
    /**
     * 在线状态-否
     */
    public static final String ONLINE_STATUS_N = "0";

    /**
     * 缓存操作信息-状态-成功 * {@value}
     */
    public static final Integer CACHE_CODE_SUCCESS = 0;
    /**
     * 缓存操作信息-状态-失败 * {@value}
     */
    public static final Integer CACHE_CODE_FAIL = 1;
    /**
     * 缓存操作信息-状态-失败-未登陆 * {@value}
     */
    public static final Integer CACHE_CODE_FAIL_NONLOGIN = 2;
    /**
     * 缓存操作信息-信息-错误 * {@value}
     */
    public static final String CACHE_MESSAGE_FAIL = "通信异常";
    /**
     * 缓存操作信息-信息-错误-Cookie未开启 * {@value}
     */
    public static final String CACHE_MESSAGE_FAIL_NONCOOKIE = "未开启Cookie";
    /**
     * 缓存操作信息-信息-错误-未登陆 * {@value}
     */
    public static final String CACHE_MESSAGE_FAIL_NONLOGIN = "用户未登陆";
    /**
     * 缓存操作信息-信息-错误-重复登录 * {@value}
     */
    public static final String CACHE_MESSAGE_FAIL_REPEATLOGIN = "用户已在另一个同类型客户端登录";
    /**
     * 缓存操作信息-信息-错误-登录信息异常 * {@value}
     */
    public static final String CACHE_MESSAGE_FAIL_UNUSUALLOGIN = "登录信息异常";
    /**
     * 缓存操作信息-信息-缓存服务器可能存在问题 * {@value}
     */
    public static final String CACHE_MESSAGE_SHUTDOWN = "缓存服务器可能存在问题";

    /**
     * 长度只能在8-20个字符之间
     */
    public static final String PASSWORD_ERROR_LENGTH = "长度只能在8-20个字符之间！";
    /**
     * 密码不能有空格
     */
    public static final String PASSWORD_NO_SPACE = "密码不能有空格";
    /**
     * 密码必须包含大小写字母
     */
    public static final String PASSWORD_NEED_LETTERS = "密码必须包含大小写字母";
    /**
     * 密码必须包含数字
     */
    public static final String PASSWORD_NEED_NUMBER = "密码必须包含数字";
    /**
     * 密码必须包含【_!@#%^&*】一种特殊字符
     */
    public static final String PASSWORD_NEED_SPECIAL_CHAR = "密码必须包含【_!@#%^&*】一种特殊字符";

    /**
     * 重置密码成功
     */
    public static String RESET_PASSWORD_SUCCESS = "重置默认密码成功!";
    /**
     * 重置密码失败
     */
    public static String RESET_PASSWORD_FALL = "请选择要重置密码的用户!";
    /**
     * 请选择要删除的用户
     */
    public static String SELECT_DELL_USER = "失败原因[请选择要删除的用户!]";

    /**
     * 登录安全检测相关-连续登录失败3次,锁 5 分钟
     */
    public final static Integer REDIS_LOCK_LOGIN_TIME_OUT = 300;
    /**
     * 登录安全检测相关-连续登录失败，给出提示的次数
     */
    public final static Long REDIS_WARNING_TIMES = 3L;
    /**
     * 登录安全检测相关-连续登录失败，锁住该用户的次数
     */
    public final static Long REDIS_LOCK_LOGIN_TIMES = 5L;
    /**
     * 接口数据字典--菜单类型
     */
    public final static String API_MENU_TYPE = "2";
    /**
     * 接口数据字典--按钮类型
     */
    public final static String API_BUTTON_TYPE = "1";
    /**
     * 接口数据字典--按钮类型
     */
    public final static String API_API_TYPE = "3";

    /**
     * 调用使用单位查询接口URL
     */
    public static final String ZHENGYUAN_REQUEST_URL_EP = "/api/infoqueryservice/enterpriseInfo";

    /**
     * 调用部门查询接口URL
     */
    public static final String ZHENGYUAN_REQUEST_URL_DEPT = "/api/infoqueryservice/accDepInfo";

    /**
     * 调用账号查询接口URL
     */
    public static final String ZHENGYUAN_REQUEST_URL_ACC = "/api/infoqueryservice/accountInfo";


    /**
     * 调用交易流水查询接口URL
     */
    public static final String ZHENGYUAN_REQUEST_URL_DEAL = "/api/infoqueryservice/querytransaction";

    /**
     * 交易流水同步查询结束时间:时间
     */
    public static final String REDIS_CARD_DEAL_SEARCH_START_TIME = "IOT_BROKER_YQ_REDIS:CARD:DEAL:SEARCH:STARTTIME:";


    /**
     * 一卡通卡片信息查询接口
     */
    public static final String ONECARD_QUERYCARD = "/api/infoqueryservice/querycard";

    /**
     * 一卡通门禁流水查询接口
     */
    public static final String ONECARD_QUERYEVENTRECORD = "/api/infoqueryservice/queryeventrecord";

    /**
     * 卡片挂失率 前缀:账户ID
     */
    public static final String REDIS_CARD_LOSS_RATE = "IOT_BROKER_YQ_REDIS:CARD:LOSS:RATE:ACC:";

    /**
     * 门禁流水同步查询结束时间:时间
     */
    public static final String REDIS_CARD_ENTER_SEARCH_START_TIME = "IOT_BROKER_YQ_REDIS:CARD:ENTER:SEARCH:STARTTIME:";

    /**
     * 门禁流水访问次数分析（7天） 前缀:账户ID
     */
    public static final String REDIS_CARD_ENTER_WEEK_ANALYSIS = "IOT_BROKER_YQ_REDIS:CARD:ENTER:WEEK:ANALYSIS:";

    /**
     * 门禁流水访问次数分析（30天） 前缀:账户ID
     */
    public static final String REDIS_CARD_ENTER_MONTH_ANALYSIS = "IOT_BROKER_YQ_REDIS:CARD:ENTER:MONTH:ANALYSIS:";

    /**
     * 一卡通交易流水数量和总金额查询接口
     */
    public static final String TRANSACTION_QUERY_URL = "/api/infoqueryservice/querytransactioncount";

    /**
     * 一卡通账户钱包余额查询接口
     */
    public static final String WALLET_BALANCE_URL = "/api/infoqueryservice/getewallet";

    /**
     * 门禁访问次数分析-七日
     */
    public static final String CARD_VISIT_ANALYSIS_WEEK = "0";

    /**
     * 门禁访问次数分析-月度
     */
    public static final String CARD_VISIT_ANALYSIS_MONTH = "1";
    /**
     * 缓存 消费总数和总金额
     */
    public static final String MONEY_AND_COUNT_KEY = "IOT_BROKER:ZHONGYUAN:INFO:DEAL";

    /**
     * 缓存 今日充值金额，今日流水金额
     */
    public static final String FLOW_AND_RECHARG_MONEY_KEY = "IOT_BROKER:ZHONGYUAN:INFO:TOTALTODAY";

    /**
     * 缓存 钱包总余额
     */
    public static final String TOTAL_WALLET_BALANCE_KEY = "IOT_BROKER:ZHONGYUAN:INFO:WALLET";

    /**
     * 缓存 充值金额
     */
    public static final String RECHARG_MONEY_KEY = "IOT_BROKER:ZHONGYUAN:DEAL:RECHARGE_MONEY";
    /**
     * 缓存 充值笔数
     */
    public static final String RECHARG_COUNT_KEY = "IOT_BROKER:ZHONGYUAN:DEAL:RECHARGE_COUNT";

    /**
     * 缓存 消费金额
     */
    public static final String CONSUMPTION_MONEY_KEY = "IOT_BROKER:ZHONGYUAN:DEAL:CONSUMPTION_MONEY";

    /**
     * 缓存 消费笔数
     */
    public static final String CONSUMPTION_COUNT_KEY = "IOT_BROKER:ZHONGYUAN:DEAL:CONSUMPTION_COUNT";
    /**
     * 缓存 流水总金额
     */
    public static final String FLOW_MONEY_KEY = "IOT_BROKER:ZHONGYUAN:DEAL:FLOW_MONEY";
    /**
     * 卡片状态-销卡
     */
    public static final String CARD_STATUS_XK = "0";

    /**
     * 卡片状态-有效
     */
    public static final String CARD_STATUS_YX = "1";

    /**
     * 卡片状态-挂失
     */
    public static final String CARD_STATUS_GS = "2";

    /**
     * 卡片状态-冻结
     */
    public static final String CARD_STATUS_DJ = "3";

    /**
     * 卡片状态-预销卡
     */
    public static final String CARD_STATUS_YXK = "4";

    /**
     * 卡片状态-锁卡
     */
    public static final String CARD_STATUS_SK = "5";

    /**
     * 账户信息查询结束时间:时间
     */
    public static final String REDIS_ACC_SEARCH_FINISH_TIME = "IOT_BROKER_YQ_REDIS:ACC:SEARCH:FINISHTIME:";


    /**
     * 账户信息中账户ID全量数据集合:集合
     */
    public static final String REDIS_ACC_ACCID_MEMBERS = "IOT_BROKER_YQ_REDIS:ACC:ACCID:MEMBERS:";

    /**
     * 一卡通充值/消费类型
     */
    public static final String FEE_TYPE = "36,37,43,45,46,100";

    /**
     * 一卡通充值类型
     */
    public static final String RECHARG_TYPE = "36,37,43,45,46";

    /**
     * 一卡通消费类型
     */
    public static final String CONSUMPTION_TYPE = "100";


    /**
     * 流水金额分析-七日
     */
    public static final String FLOW_MONEY_WEEK = "0";

    /**
     * 流水金额分析-月度
     */
    public static final String FLOW_MONEY_MONTH = "1";

    /**
     * 充值金额分析-七日
     */
    public static final String RECHARG_MONEY_WEEK = "0";

    /**
     * 充值金额分析-月度
     */
    public static final String RECHARG_MONEY_MONTH = "1";

    /**
     * 消费笔数分析-七日
     */
    public static final String CONSUMPTION_COUNT_WEEK = "0";

    /**
     * 消费笔数分析-月度
     */
    public static final String CONSUMPTION_COUNT_MONTH = "1";

    /**
     * 时间单位-年
     */
    public static final String YEAR = "年";

    /**
     * 时间单位-季
     */
    public static final String QUARTER = "季";

    /**
     * 时间单位-月
     */
    public static final String MONTH = "月";

    /**
     * 时间单位-周
     */
    public static final String WEEk = "周";

    /**
     * 时间单位-日
     */
    public static final String DAY = "日";

    /**
     * 时间单位-时
     */
    public static final String HOUR = "时";

    /**
     * 时间单位-分
     */
    public static final String MINUTE = "分";

    /**
     * 时间单位-秒
     */
    public static final String SECOND = "秒";

    /**
     * 操作员编号
     */
    public static final String OPTNUM = "100001";

    /**
     * 大华访客预约url
     */
    public static final String DAHUA_VISITOR_APPOINTMENT_URL = "/api/CardSolution/card/visitor/appointment";

    /**
     * 大华访客列表查询url
     */
    public static final String DAHUA_VISITOR_DATA = "/api/CardSolution/card/visitor/getVisitorData";

    /**
     * 大华访客单个审核url
     */
    public static final String DAHUA_VISITOR_REVIEW = "/api/CardSolution/card/visitor/review";

    /**
     * 大华人脸库新增
     */
    public static final String DAHUA_FACE_GROUPINFO_ADD = "/api/face/groupInfo/add";

    /**
     * 大华人脸库修改
     */
    public static final String DAHUA_FACE_GROUPINFO_UPDATE = "/api/face/groupInfo/update";

    /**
     * 大华人脸库删除
     */
    public static final String DAHUA_FACE_GROUPINFO_DELETE = "/api/face/groupInfo/delete";

    /**
     * 大华人脸库查询
     */
    public static final String DAHUA_FACE_GROUPINFO_LIST = "/api/face/groupInfo/page";

    /**
     * 大华人脸库下发
     */
    public static final String DAHUA_FACE_GROUPINFO_RELOADIVSS = "/api/face/groupInfo/reloadIVSS";

    /**
     * 大华人脸新增
     */
    public static final String DAHUA_FACE_PERSONINFO_ADD = "/api/face/personInfo/add";

    /**
     * 大华人脸修改
     */
    public static final String DAHUA_FACE_PERSONINFO_UPDATE = "/api/face/personInfo/update";

    /**
     * 大华人脸批量删除
     */
    public static final String DAHUA_FACE_PERSONINFO_DELETEBATCH = "/api/face/personInfo/deleteBatch";

    /**
     * 大华人脸图片上传
     */
    public static final String DAHUA_FACE_PERSONINFO_UPLOADPIC = "/api/face/personInfo/uploadPic";

    /**
     * 大华人脸查询
     */
    public static final String DAHUA_FACE_PERSONINFO_PAGE = "/api/face/personInfo/page";

    /**
     * 大华人脸重新下发
     */
    public static final String DAHUA_FACE_PERSONINFO_SYNCIVSS = "/api/face/personInfo/syncIvss";

    /**
     * 大华根据证件号码删除人脸
     */
    public static final String DAHUA_FACE_PERSONINFO_OPERATE = "/api/face/personInfo/delete/operate";

    /**
     * 大华结果返回码：成功
     */
    public static final String DAHUA_SUCCESS = "true";

    /**
     * 大华结果返回码：失败
     */
    public static final String DAHUA_FAIL = "false";

    /**
     * 大华基础服务接口调用成功码
     */
    public static final String DAHUA_BASICS_SUCCESS = "100001";

    /**
     * 大华预约状态:预约审批中
     */
    public static final String DAHUA_APPOINTMENT_APPROVAL = "0";

    /**
     * 大华预约状态：预约
     */
    public static final String DAHUA_APPOINTMENT = "1";

    /**
     * 大华预约状态：在访
     */
    public static final String DAHUA_VISIT = "2";

    /**
     * 大华预约状态：离访
     */
    public static final String DAHUA_VISIT_FROM = "3";

    /**
     * 大华预约状态：预约取消
     */
    public static final String DAHUA_APPOINTMENT_CANCLE = "4";

    /**
     * 大华访客类型 普通用户
     */
    public static final String DAHUA_COMMON_UESER = "0";

    /**
     * 大华访客类型 VIP用户
     */
    public static final String DAHUA_VIP_UESER = "1";

    /**
     * 大华访客审核 ：通过
     */
    public static final String DAHUA_TRUE = "true";

    /**
     * 大华访客审核 ：不通过
     */
    public static final String DAHUA_FALSE = "false";

    /**
     * 大华基础服务url
     */
    public static final String DAHUA_VIDEO_DEVICE_URL = "/api/admin/rest/api";

    /**
     * 大华接口标示符 :设备查询
     */
    public static final String DAHUA_INTERFACE_ID_DEVICE = "admin_001_001";

    /**
     * 大华接口标示符 :设备通道查询
     */
    public static final String DAHUA_INTERFACE_ID_CHANNEL = "admin_001_006";

    /**
     * 大华接口标示符 :设备报警记录查询
     */
    public static final String DAHUA_INTERFACE_ID_ALARM_RECORD = "admin_008_001";

    /**
     * 大华接口标示符 :设备报警记录类型查询
     */
    public static final String DAHUA_INTERFACE_ID_ALARM_TYPE = "admin_008_002";

    /**
     * 大华接口标示符 :设备状态日志
     */
    public static final String DAHUA_INTERFACE_ID_DEVICE_STATE = "admin_008_003";

    /**
     * 大华报警类型： 设备
     */
    public static final String DAHUA_ALARM_CATEGORY = "device";

    /**
     * 人脸库类型：1-白名单
     */
    public static final Integer GROUPTYPE_ONE = 1;

    /**
     * 人脸库类型：2-黑名单
     */
    public static final Integer GROUPTYPE_TWO = 2;

    /**
     * 人脸库类型：3-内部库
     */
    public static final Integer GROUPTYPE_THREE = 3;

    /**
     * 人脸库类型：4-访客库
     */
    public static final Integer GROUPTYPE_FOUR = 4;

    /**
     * Http方法  | 1:GET|2:POST|3:PUT|4:DELETE|5:PATCH
     */
    public static final String HTTP_METHOD_GET = "1";
    public static final String HTTP_METHOD_POST = "2";
    public static final String HTTP_METHOD_PUT = "3";
    public static final String HTTP_METHOD_DELETE = "4";
    public static final String HTTP_METHOD_PATCH = "5";

    /**
     * 数字0
     */
    public static final String NUM0 = "0";
    /**
     * 数字1
     */
    public static final String NUM1 = "1";
    /**
     * 数字2
     */
    public static final String NUM2 = "2";
    /**
     * 数字3
     */
    public static final String NUM3 = "3";

    /**
     * appKey和businessCode(appCode)对应关系缓存前缀
     */
    public static final String REDIS_APPKEY_BUSINESSCODE = "REDIS_APPKEY_BUSINESSCODE:";
    /**
     * businessCode(appCode)和apiCode对应关系缓存前缀
     */
    public static final String REDIS_BUSINESSCODE_APICODE = "REDIS_BUSINESSCODE_APICODE:";

    /**
     * ApiCode对外接口 是否同步异步缓存后缀
     */
    public static final String IS_SYNC = "_IS_SYNC:";

    /**
     * apiCode为key
     */
    public static final String REDIS_APICODE_APINAME = "REDIS_APICODE_APINAME:";

    /**
     * 消息推送失败次数计数器,后面拼接业务编号businessCode
     */
    public static final String REDIS_PUSHHTTPMSG_FAILCOUNT = "REDIS_PUSHHTTPMSG_FAILCOUNT_";

    /**
     * 消息推送失败熔断次数
     */
    public static final int PUSHHTTPMSG_FAILCOUNT_LIMIT = 200;

    /**
     * 启停状态1 启用 0 停止
     */
    public static final String BIZ_HTTP_ISOPEN_OPEN = "1";
    public static final String BIZ_HTTP_ISOPEN_CLOSE = "0";

    /**
     * HTTP运行模式| 1:对外接口|2:定时任务
     */
    public static final String BIZ_HTTP_MODE_API = "1";
    public static final String BIZ_HTTP_MODE_SCHEDULER = "2";

    /**
     * 发送到消息队列的消息类型
     */
    public static final String ROCKETMQ_MESSAGE_TYPE = "DATA_STREAM";

    /**
     * json分析失败
     */
    public static final String JSON_PARSE_FAIL = "json分析失败";

    /** hbase表名 */
    /**
     * 历史数据-数据流表
     */
    public static final String HBASE_TABLE_DATA_STREAM = "data_stream_history_data";
    /**
     * 历史数据-接口调用日志表
     */
    public static final String HBASE_TABLE_INTERFACE_LOG = "interface_log_history_data";

    /**
     * 中台 business_token_name
     */
    public static final String IOT_BROKER_TOKEN = "iotBrokerToken";

    /**
     * 中台接口中心 南向http配置前缀
     */
    public static final String API_CENTER_SOUTH = "API_CENTER_SOUTH:";

    /**
     * 北向接口 缓存信息 前缀
     */
    public static final String API_CENTER_APICODE = "API_CENTER_APICODE:";

    /**
     * 北向请求接口次数信息
     */
    public static final String API_CENTER_REQUEST_NUM = "API_CENTER_REQUEST_NUM:";

    /**
     * 上层应用缓存信息 前缀
     */
    public static final String API_CENTER_APPCODE = "API_CENTER_APPCODE:";

}
