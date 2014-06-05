package net.tataryn.swagger.issue320.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@PropertySource({ "classpath:swagger.properties" }) //loads "env" with properties
@EnableWebMvc
@ComponentScan({ "net.tataryn.swagger.issue320.service.rest" })
@Import( { SwaggerConfig.class })
public class WebAppConfig extends WebMvcConfigurerAdapter {

}
