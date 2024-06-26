package net.developia.spring01.di301e;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("net/developia/spring01/di301e/system.properties")
public class BeanInit {
	@Bean
	public Outputter outputter() {
		OutputterImpl outputter = new OutputterImpl();
		outputter.setFileOutputter(fileOutputter());
		return outputter;
	}
	
	@Bean
	public FileOutputter fileOutputter() {
		return new FileOutputterImpl();
	}
}
