package com.raingan.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 服务注册中心
 * 
 * @Author Rain Gan
 * @Date 2018年12月15日 下午10:00:05
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static final Logger log = LoggerFactory.getLogger(EurekaServerApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(EurekaServerApplication.class)
				.web(true).run(args);
		log.debug("Eureka Server已经启动,当前host:{}", applicationContext.getEnvironment().getProperty("HOSTNAME") == null
				? "localhost" : applicationContext.getEnvironment().getProperty("HOSTNAME"));
	}

}
