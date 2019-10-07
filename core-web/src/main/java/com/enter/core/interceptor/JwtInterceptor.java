package com.enter.core.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author Liquid
 * @类名： JwtInterceptor
 * @描述：
 * @date 2019/5/18
 */
@Slf4j
@Component
public class JwtInterceptor extends HandlerInterceptorAdapter {



//    @Reference(
//            version = "1.0"
//    )
//    private LoginCheckService loginCheckService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//
//        String token = request.getHeader("Authorization");
//
//        if (StringUtils.isEmpty(token)) {
//
//            response.setCharacterEncoding("UTF-8");
//            ResultBean resultBean = new ResultBean<>();
//            resultBean.setCode(ResultBean.USER_FAIL);
//            resultBean.setMsg("Token为空");
//            PrintWriter out = response.getWriter();
//            out.append(JsonUtils.toJSONString(resultBean));
//            return false;
//        }
//        LoginCheckVO loginCheckVO = new LoginCheckVO();
//        loginCheckVO.setToken(token);
//        loginCheckVO.setProjectType("print");
//
//        LoginCheckVO result = loginCheckService.getLoginInfo(loginCheckVO);
//
//        if (result.getResult()){
//            request.setAttribute("userId",result.getUserId() );
//        }else {
//            response.setCharacterEncoding("UTF-8");
//            ResultBean resultBean = new ResultBean<>();
//            resultBean.setCode(ResultBean.USER_FAIL);
//            resultBean.setMsg(result.getResultInfo());
//            PrintWriter out = response.getWriter();
//            out.append(JsonUtils.toJSONString(resultBean));
//            return false;
//        }
//        return super.preHandle(request, response, handler);
//    }

}
