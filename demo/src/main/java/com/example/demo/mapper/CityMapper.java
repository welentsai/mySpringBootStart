package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.City;

@Mapper
public interface CityMapper {

	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);

}