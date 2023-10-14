package com.lifeng.filter;


import javax.servlet.*;
import java.io.IOException;

public class DemoFilter implements Filter {
    // 初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        // 这里是让我们的请求继续走下去，如果不写，程序会被拦截
        filterChain.doFilter(servletRequest,servletResponse);
    }

    // 销毁
    @Override
    public void destroy() {

    }
}
