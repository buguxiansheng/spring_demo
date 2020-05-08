package com.lcfc.spring_demo.mapper;

import java.util.List;

import com.lcfc.spring_demo.entity.Product_general_cost;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface Product_general_costMapper {
    //根据name得到各项花费  得到各项占比
    public List<Product_general_cost> generalCostRate(@Param("product_names")  List<String> product_name);

}