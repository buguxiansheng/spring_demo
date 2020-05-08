package com.lcfc.spring_demo.mapper;

import java.util.List;

import com.lcfc.spring_demo.entity.Product_make_details;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface Product_make_detailsMapper {
    //多个proname
   public List<Product_make_details> findByName(@Param("product_names") List<String> product_names);
}