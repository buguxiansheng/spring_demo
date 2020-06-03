package com.lcfc.spring_demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lcfc.spring_demo.entity.Product_contrast;
import com.lcfc.spring_demo.entity.Product_general_cost;
import com.lcfc.spring_demo.entity.Product_make_details;
import com.lcfc.spring_demo.entity.Product_material_details;
import com.lcfc.spring_demo.entity.Vendor_select;
import com.lcfc.spring_demo.mapper.Product_contrastMapper;
import com.lcfc.spring_demo.mapper.Product_general_costMapper;
import com.lcfc.spring_demo.mapper.Product_make_detailsMapper;
import com.lcfc.spring_demo.mapper.Product_material_detailsMapper;
import com.lcfc.spring_demo.service.GetRate;
import com.lcfc.spring_demo.service.VendorSelect;

import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	
	
	@Autowired
	private Product_make_detailsMapper product_make_detailsMapper;
	@Autowired
	private Product_general_costMapper product_general_costMapper;

	@Autowired
	private GetRate getRate;
	@Autowired
	private Product_material_detailsMapper product_material_detailsMapper;
	@Autowired
	private VendorSelect h;
	@Autowired
	private Product_contrastMapper pc;


	

	@Test
	void contextLoads() {
		System.out.println(pc.get("小新Air_15_2020"));
		// fdName();
		// get(300);
		// findByName(fdName());
		// findCost(fdName());
	}

	public List<String> fdName(){
		Product_material_details product_details = new Product_material_details();
		// product_details.setScreen_size("14英寸");
		product_details.setRam("8G");
		System.out.println(product_details);
		List<String> product_names = product_material_detailsMapper.findPdName(product_details);
		System.out.println(product_names);
		return product_names;
	}

	private List<Product_make_details> findByName( List<String> product_names){
		System.out.println(product_make_detailsMapper.findByName(product_names));
        return  product_make_detailsMapper.findByName(product_names);   
	}
	
	private List<Product_general_cost> findCost(List<String> product_names){
		System.out.println("未经处理的："+product_general_costMapper.generalCostRate(product_names));
        return getRate.get(product_general_costMapper.generalCostRate(product_names)); 
	}

	

// 	public Vendor_select get(int amount){
// 		System.out.println(h.getCostInfo(amount));
// 		return h.getCostInfo(amount);
// 	}
 }
