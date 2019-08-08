package com.onlyone.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 使用代码注册
 * Created by xmr on 2019/6/24.
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化过滤器MyFilter =========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("=======销毁过滤器MyFilter =========");
    }
}
