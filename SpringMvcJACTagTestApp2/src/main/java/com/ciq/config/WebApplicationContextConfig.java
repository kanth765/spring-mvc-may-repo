package com.ciq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ciq.pojo.PhoneFormatterEditor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ciq.*")
public class WebApplicationContextConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver getinInternalResourceViewResolver() {
		InternalResourceViewResolver inResolver = new InternalResourceViewResolver();
		inResolver.setPrefix("/WEB-INF/views/");
		inResolver.setSuffix(".jsp");
		return inResolver;
	}

//	public void addFormatters(FormatterRegistry registry) {
//		registry.addFormatter(new PhoneFormatterEditor());
//		registry.addPrinter(new PhoneFormatterEditor());
//
//	}
}
