package com.st.comment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Null;


@Service
public class LoginHandlerInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        try{

            String url = request.getRequestURI();

            logger.info("Path:" + url);

            String token = request.getParameter("token");

            // 1.如果token为空,重定向到登录页面
            if(token == ""  || token == null){
                response.sendRedirect("/login");
                return false;
            }
            // 2.如果根据token获取的用户为空,重定向到登录页面
//            SysUserVO user = userUtil.getLoginUser(token);
//            if(user==null){
//                response.sendRedirect("/user/login.shtml");
//                return false;
//            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            response.sendRedirect("/login");
            return false;
        }
    }



    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
        // 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行，主要是用于进行资源清理工作
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
        // 请求处理之后进行调用，但是在视图被渲染之前，即Controller方法调用之后
    }


}
