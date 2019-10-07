package com.enter.core.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author Liquid
 * @类名： AccessTokenTimer
 * @描述：
 * @date 2019/3/28
 */
@Slf4j
public class AccessTokenTimer {
    private static ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
            new BasicThreadFactory.Builder().namingPattern("token-schedule-pool-%d").daemon(true).build());

//    public static void start() {
//        executorService.scheduleAtFixedRate(() -> {
//            try {
//                EnterPrintAppConfig.accessToken = AccessTokenUtils.getAccessToken(EnterPrintAppConfig.APP_ID, EnterPrintAppConfig.SECRET);
//                EnterPrintAppConfig.enterpriseWeChatAccessToken = AccessTokenUtils.getEnterpriseWeChatAccessToken(EnterPrintAppConfig.ENTERPRISE_WE_CHAT_APP_ID,
//                        EnterPrintAppConfig.ENTERPRISE_WE_CHAT_SECRET);
//                log.info("获取access_token成功，有效时长{}秒 token:{}", EnterPrintAppConfig.ACCESS_TOKEN_EFFECTIVE_SECOND, EnterPrintAppConfig.enterpriseWeChatAccessToken);
//            } catch (CheckedException e) {
//                log.error("定时器出异常了！{} 重新获取", e);
//                start();
//            }
//
//        }, 0, EnterPrintAppConfig.ACCESS_TOKEN_EFFECTIVE_SECOND - 200, TimeUnit.SECONDS);
//    }

}
