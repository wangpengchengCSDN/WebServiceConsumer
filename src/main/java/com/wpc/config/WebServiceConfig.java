/*
package com.wpc.config;


import com.wpc.service.UserService;
import com.wpc.service.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
*/
/*
import org.apache.cxf.jaxws.EndpointImpl;
*//*

import org.apache.cxf.endpoint.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {
    */
/**
     *
     *  web.xml
     *   <servlet-name>cxfservlet</servlet-name>
     *   <servlet-class>org.apache.cxf.transport.servlet.CXFServlet</servlet-class>
     *  <servled-mapping>
     *          <servlet-name>cxfservlet</servlet-name>
     *      <url-part>/webservice*/
/*
     *
     *  </servled-mapping>
     *
     *
     * **//*

    @Bean
    public ServletRegistrationBean cxfServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/webservice*/
/*");//发布服务名称
    }

    */
/**
     * <bean id="cxf" Class="org.apache.cxf.bus.spring.SpringBus" >
     *     <propertitys ref=""></propertitys>
     * </bean>
     * @return
     *//*


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus()
    {
        return  new SpringBus();
    }

    @Bean
    public UserService userService()
    {
        return  new UserServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint=new EndpointImpl(springBus(), userService());//绑定要发布的服务
        endpoint.publish("/user"); //显示要发布的名称
        return endpoint;
    }
}*/
