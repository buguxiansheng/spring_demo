package com.lcfc.spring_demo.mapper;

import java.util.List;

import com.lcfc.spring_demo.entity.Product_contrast;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Product_contrastMapper {
    public Product_contrast get(@Param("name") String product_name);

    public List<Product_contrast> getAll() ;
        
    
}