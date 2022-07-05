package com.kierangelo.springbootcartmybatis.mapper;

import com.kierangelo.springbootcartmybatis.entity.Cart;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface  CartMapper {

    @Select("select * from carts")
    List<Cart> findAll();

    @Insert("insert into carts(product_id,quantity) values(#{productId},#{quantity})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(Cart cart);

//    @Update("update carts set salary=#{salary} where name=#{name}")
//    void update(Cart cart);
//    @Delete("delete from carts where name=#{name}")
//    void delete(Cart cart);
}
