package net.developia.spring01.di302e;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("net/developia/spring01/di301e/system.properties")
public class BeanInit {
	@Bean
	public Outputter outputter() {

		return new OutputterImpl(fileOutputter());
	}
	
	@Bean
	public FileOutputter fileOutputter() {
		return new FileOutputterImpl();
	}
}
