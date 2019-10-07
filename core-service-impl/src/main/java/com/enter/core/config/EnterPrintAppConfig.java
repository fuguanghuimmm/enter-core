package com.enter.core.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class EnterPrintAppConfig implements InitializingBean {

    public static final String PROJECT_TYPE = "print";
    public static String accessToken = "";

    public static String publicAccessToken = "";

    public static String enterpriseWeChatAccessToken = "";

    public static final Integer ACCESS_TOKEN_EFFECTIVE_SECOND = 7200;

    public static String[] managerPublicOpenIds = new String[10];

    public static int managerCount;

    public static final  String AGENT_ID="1000072";

    public static final String APP_ID = "wx1dad82132dab2758";

    public static final String SECRET = "09c93173b621345630472a1d01a62d9d";

    public static final String PUBLIC_APP_ID = "wx1a6a3a4287fb49e3";

    public static final String PUBLIC_SECRET = "875fd460bbd12a556cd4a94537aff6aa";

    public static final String ENTERPRISE_WE_CHAT_APP_ID = "ww069a1e0d963addb1";

    public static final String ENTERPRISE_WE_CHAT_SECRET = "FE-jM83iMXmAI2CGGLD4y2reBvmG2U-Fuf00wqVlUVo";

    @Override
    public void afterPropertiesSet() throws Exception {
//        AccessTokenTimer.start();
    }
}
