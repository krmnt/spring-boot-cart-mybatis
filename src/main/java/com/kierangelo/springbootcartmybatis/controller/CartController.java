package com.kierangelo.springbootcartmybatis.controller;

import com.kierangelo.springbootcartmybatis.entity.Cart;
import com.kierangelo.springbootcartmybatis.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartMapper cartMapper;

    @GetMapping("/")
    public List<Cart> getAll() {
        return cartMapper.findAll();
    }

    @PostMapping("/add")
    public void update(@RequestBody Cart cart) {
        cartMapper.insert(cart);
    }
}