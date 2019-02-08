package com.example.demo.dao;

// import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.example.demo.model.City;

import org.springframework.stereotype.Component;


@Component
public class CityDao {

	private final SqlSession sqlSession;

	public CityDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public City selectCityById(long id) {
		return this.sqlSession.selectOne("selectCityById", id);
	}

	public City findByState(String state) {
		return this.sqlSession.selectOne("findByState", state);
	}

	public List<City> findAllCities() {
		return this.sqlSession.selectList("findAllCities");
	}

}