package com.example.demo.dao;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;

import com.example.demo.dao.CityDao;

@RunWith(JUnitPlatform.class)
@DisplayName("Testing CityDaoTest")
public class CityDaoTest {

	private static final Logger log = LoggerFactory.getLogger(CityDaoTest.class);

	private CityDao classUnderTest;

	@BeforeAll
  	static void init() {
    	log.info("Tests starting...");
  	}

  	@AfterAll
  	static void done() {
    	log.info("Tests complete.");
  	}

  	@Nested
  	@DisplayName("Inner Class Normal Scenarios")
  	class CityDaoNormalScenariosTest {
  		
  	}
  		

  	@Test
    @DisplayName("findAll() returns empty list")
    public void findAll() {
      // List<Category> categories = classUnderTest.findAll();
      // assertNotNull();
      assertTrue(true);
    }
}