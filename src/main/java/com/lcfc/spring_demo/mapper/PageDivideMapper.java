package com.lcfc.spring_demo.mapper;

import java.util.List;

import com.lcfc.spring_demo.entity.Product_material_details;

public interface PageDivideMapper {
    //查询所有
    public List<Product_material_details> findAll();
}