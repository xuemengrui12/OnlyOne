package com.onlyone.config;

import com.onlyone.web.filter.MyFilter;
import com.onlyone.interceptor.MyInterceptor;
import com.onlyone.web.listener.MyHttpSessionListener;
import com.onlyone.web.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by xmr on 2019/8/6.
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    /**
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {

        return new ServletRegistrationBean(new MyServlet(), "/mv");
    }

    /**
     * 配置生成Filter
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/mv");
        return filterRegistrationBean;
    }

    /**
     * 配置生成MyHttpSessionListener
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean<MyHttpSessionListener> listenerRegistrationBean() {
        return new ServletListenerRegistrationBean<>(new MyHttpSessionListener());
    }

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
//        registry.addInterceptor(new MyInterceptor());
        super.addInterceptors(registry);
    }
}
