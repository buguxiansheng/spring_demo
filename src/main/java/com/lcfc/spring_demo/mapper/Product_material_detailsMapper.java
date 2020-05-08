package com.lcfc.spring_demo.mapper;

import java.util.List;

import com.lcfc.spring_demo.entity.Product_material_details;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Product_material_detailsMapper {

    //查询部分
    public List<String> findPdName(Product_material_details product_details);

    //查询所有
    public List<Product_material_details> findAll();

    //查询一个
    public Product_material_details findOne(@Param("name") String name);
    
    //增加数据
    public void addPd(Product_material_details product_material_details);

    //修改
    public void updatePd(Product_material_details product_material_details);

    //删除
    public void delPd(@Param("name") String name);


}