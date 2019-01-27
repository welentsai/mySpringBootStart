package com.example.demo;

// import com.example.demo.mapper.CityMapper;
import com.example.demo.dao.CityDao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// eaqual to  @Configuration + @EnableAutoConfiguration + @ComponentScan 
public class App implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		// ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		// Company company = context.getBean("company", Company.class);
		// assertEquals("High Street", company.getAddress().getStreet());
		// assertEquals(1000, company.getAddress().getNumber());
	}

	// private final CityMapper cityMapper; //使用 Mapper
	private final CityDao cityDao; // 使用sqlSession, DAO

	// constructor
	// public App(CityMapper cityMapper) {
	// 	// this is the only thing to do let the mapper be injected
	// 	this.cityMapper = cityMapper;
	// }

	public App(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	@SuppressWarnings("squid:S106")
	public void run(String... args) {
		// System.out.println(this.cityMapper.findByState("TPE"));
		// System.out.println(this.cityMapper.selectCityById(1));
		System.out.println(this.cityDao.selectCityById(1));
		System.out.println(this.cityDao.selectCityById(2));
		System.out.println(this.cityDao.selectCityById(5)); // not found !!, return null
		System.out.println(this.cityDao.findByState("TPE"));
	}

}



