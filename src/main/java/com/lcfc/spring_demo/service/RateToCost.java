package com.lcfc.spring_demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.lcfc.spring_demo.entity.Product_general_cost;

import org.springframework.stereotype.Service;
@Service
public class RateToCost {
    //将比率转化为对象
    public List<Product_general_cost> rateToCost(List<Product_general_cost> list){
        // List<Product_general_cost> list_new=new ArrayList<>();
        Iterator<Product_general_cost> it=list.iterator();
        while(it.hasNext()){
            Product_general_cost pgc=it.next();
            //d = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            BigDecimal temp_01=new BigDecimal(pgc.getProduct_cost()*pgc.getEnvironment_cost());
            BigDecimal temp_02=new BigDecimal(pgc.getProduct_cost()*pgc.getLegal_cost());
            BigDecimal temp_03=new BigDecimal(pgc.getProduct_cost()*pgc.getMachine_cost());
            BigDecimal temp_04=new BigDecimal(pgc.getProduct_cost()*pgc.getMaterial_cost());
            BigDecimal temp_05=new BigDecimal(pgc.getProduct_cost()*pgc.getSalary_cost());


            pgc.setEnvironment_cost(temp_01.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());
            pgc.setLegal_cost(temp_02.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());
            pgc.setMachine_cost(temp_03.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());
            pgc.setMaterial_cost(temp_04.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());
            pgc.setSalary_cost(temp_05.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());

        }
        System.out.println(list);
        return list;
    }
}