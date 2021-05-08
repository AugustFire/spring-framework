package com.young;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @author Zongxu.Yang
 * create at 2021/1/29
 */
@Configurable
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class JavaConfig {

	@Bean
	public C c() {
		return new C();
	}
}
