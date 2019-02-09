package com.example.demo.dao;

import org.apache.ibatis.session.SqlSession;
import com.example.demo.model.Hotel;

import org.springframework.stereotype.Component;

@Component
public class HotelDao {

	private final SqlSession sqlSession;

	public HotelDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public Hotel selectHotelById(Integer cityId) {
		return this.sqlSession.selectOne("selectHotelById", cityId);
	}

}