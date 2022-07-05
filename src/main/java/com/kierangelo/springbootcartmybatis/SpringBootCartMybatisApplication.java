package com.kierangelo.springbootcartmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kierangelo.springbootcartmybatis.entity.Cart;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;

@MappedTypes(Cart.class)
@MapperScan("com.kierangelo.springbootcartmybatis.mapper")
@SpringBootApplication
public class SpringBootCartMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCartMybatisApplication.class, args);
	}

}
