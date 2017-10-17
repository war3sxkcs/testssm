package com.smallkk.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by   song 醉美柳舞之众星捧月
 * Date & Time  2017/10/14 23:25
 */

//实现拦截器  ！！！！！！！！！！！
public class SpringMvcInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //这个方法是执行请求之前 执行这个方法; 故为拦截
        //如果返回的是false,那么方法就在这个地方停止;将不会执行下面两个方法
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("请求执行");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("请求处理完了");
    }
}
