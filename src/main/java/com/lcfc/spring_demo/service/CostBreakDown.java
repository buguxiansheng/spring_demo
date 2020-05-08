package com.lcfc.spring_demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.lcfc.spring_demo.entity.Product_general_cost;

import org.springframework.stereotype.Service;
@Service
//成本分解任务
public class CostBreakDown {
    public Map<String,Double> costBreakDown(Product_general_cost pgc) {
        Map<String, Double> map = new HashMap<String, Double> ();
        // BigDecimal sum=pgc.getEnviorment_cost().add(pgc.getLegal_cost()).add(pgc.getMachine_cost()).add(pgc.getSalary_cost()).add(pgc.getMaterial_cost());
        map.put("enviorment_cost",pgc.getEnvironment_cost());
        map.put("Legal_cost", pgc.getLegal_cost());
        map.put("Machine_cost", pgc.getMachine_cost());
        map.put("Salary_cost", pgc.getSalary_cost());
        map.put("Material_cost", pgc.getMaterial_cost());
        //如何遍历集合
        return map;
    }
}