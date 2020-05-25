package com.lcfc.spring_demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcfc.spring_demo.entity.Product_general_cost;
import com.lcfc.spring_demo.entity.Product_make_details;
import com.lcfc.spring_demo.entity.Product_material_details;
import com.lcfc.spring_demo.entity.Vendor_select;
import com.lcfc.spring_demo.mapper.Product_general_costMapper;
import com.lcfc.spring_demo.mapper.Product_make_detailsMapper;
import com.lcfc.spring_demo.mapper.Product_material_detailsMapper;
import com.lcfc.spring_demo.mapper.product_time_costMapper;
import com.lcfc.spring_demo.service.CostBreakDown;
import com.lcfc.spring_demo.service.GetRate;
import com.lcfc.spring_demo.service.RateToCost;
import com.lcfc.spring_demo.service.VendorSelect;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sc")
public class ProductController {

    @Autowired
    private Product_material_detailsMapper product_material_detailsMapper;

    @Autowired
    private Product_make_detailsMapper product_make_detailsMapper;

    @Autowired
    private Product_general_costMapper product_general_costMapper;


    @Autowired
    private GetRate getRate;

    @Autowired
    private RateToCost rateToCost;

    @Autowired
    private VendorSelect vendorSelect;



    
    

    
    @RequestMapping("/fpn")
    @ResponseBody
    public List<String> findProduct(@ModelAttribute Product_material_details product_details){
        System.out.println(product_details);
        List<String> strs = product_material_detailsMapper.findPdName(product_details);
        System.out.println(strs);
        //map的key值
        return strs; 
    }
    //获得产品完工的信息
    @RequestMapping("/fpmd")
    @ResponseBody
     //@RequestParam(value="product_names[]",required=false)
    private List<Product_make_details> findByName(@RequestBody List<String> product_names){
        System.out.println(product_names); 
        System.out.println(product_make_detailsMapper.findByName(product_names));
        return  product_make_detailsMapper.findByName(product_names);   
    }

    //获得产品rate  三个对象 一个都是最小的 一个中等  一个最大
    @RequestMapping("/fpcd")
    @ResponseBody
    private List<List> findRate(@RequestBody List<String> product_names){
        List <Product_general_cost> list_01= product_general_costMapper.generalCostRate(product_names);
        List <Product_general_cost> list_02=list_01;
        List<List> list=new ArrayList<>();
        list.add(getRate.get(list_01));
        //从结果集中取出最大最小    和一个平均
        

        //引用数据类型做参数
        list.add(rateToCost.rateToCost(list_02));
        if(product_names.size()!=0){
            return list;
        }else{
            return null;  
        }  
    }


    //产品规格的增删改  查询

    @RequestMapping("/spec_add")
    @ResponseBody
    private String addPd(@RequestBody Product_material_details pmd){
        System.out.println(pmd);
        try{
            product_material_detailsMapper.addPd(pmd);
            return "数据正确";
        }catch(Exception e){
            if(e instanceof DuplicateKeyException){
                return "数据已存在";
            }else{
                throw e;
            }
        }
    }
    @RequestMapping("/spec_update")
    @ResponseBody
    private void updatePd(@RequestBody Product_material_details pmd){
        System.out.println(pmd);
        product_material_detailsMapper.updatePd(pmd);
    }
    @RequestMapping("/spec_delPd")
    @ResponseBody
    private void delPd(@RequestBody Map<String,String> map){
        System.out.println(map.get("product_name"));
        product_material_detailsMapper.delPd(map.get("product_name"));
        
    }

    @RequestMapping("/spec_find")
    @ResponseBody
    private PageInfo<Product_material_details> findAll(@RequestBody Map<String,Integer> pagination){
        
        PageHelper.startPage(pagination.get("currentPage"), pagination.get("pageSize"));


        List<Product_material_details> list=product_material_detailsMapper.findAll();


        PageInfo<Product_material_details> pageInfo =new PageInfo<>(list);

        pageInfo.setPageSize(pagination.get("pageSize"));

        
        return pageInfo;
    }

    //分页查询
    @RequestMapping("/spec_find_part")
    @ResponseBody
    private List<Product_material_details> findPart(@RequestBody Map<String,String> map){
        //map村的有总条数 页的大小 
        return product_material_detailsMapper.findAll();
    }


    @RequestMapping("/spec_findone")
    @ResponseBody
    //参数为字符串的处理
    private Product_material_details findOne(@RequestBody Map<String,String> map){
        return product_material_detailsMapper.findOne(map.get("product_name"));
    }

    //原材料报价单
    @RequestMapping("/vendor_select")
    @ResponseBody
    private Map<String,Object> getMaterialBill(@RequestBody Map<String,Integer> map){
        int amount=map.get("amount");
        System.out.println(vendorSelect.getCostInfo(amount));
        return vendorSelect.getCostInfo(amount);
    }

    

}