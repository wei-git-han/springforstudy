package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Druidconfig {

	//fjdslfjsdl
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
    //StatViewServlet 配置后台监控
    ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,String> map = new HashMap<String,String>(16);
        //后台登录名和密码
        map.put("loginUserName","admin");
        map.put("loginPassWord","123");
        map.put("allow","");
        bean.setInitParameters(map);
        return bean;
    }

    /**
     * 过滤器的配置，看看哪些请求需要被过滤
     */
    
    public FilterRegistrationBean webStartFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        //配置哪些请求可以被过滤
        Map<String,String> map = new HashMap<>(16);
        map.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(map);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
        
    }
    
    public void dds() {
    	System.out.println("ddd");
    }

}
