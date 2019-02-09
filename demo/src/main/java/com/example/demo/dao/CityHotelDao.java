package com.example.demo.dao;

// import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import com.example.demo.model.CityHotel;

import org.springframework.stereotype.Component;


@Component
public class CityHotelDao {

	private final SqlSession sqlSession;

	public CityHotelDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<CityHotel> selectHotelsByCityId(long id) {
		return this.sqlSession.selectList("findHotelsByCityId", id);
	}
}