package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
class Config {
    @Bean
    public Address getAddress() {
        return new Address("High Street", 1000);
    }
}

@SpringBootApplication
// eaqual to  @Configuration + @EnableAutoConfiguration + @ComponentScan 
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		// ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		// Company company = context.getBean("company", Company.class);
		// assertEquals("High Street", company.getAddress().getStreet());
		// assertEquals(1000, company.getAddress().getNumber());
	}

}



