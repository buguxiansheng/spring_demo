package com.lcfc.spring_demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.lcfc.spring_demo.entity.Product_general_cost;

import org.springframework.stereotype.Service;

@Service
public class GetRate {


    public List<Product_general_cost> get(List<Product_general_cost> list){
        //从list中取出比例都是最小的 和最大的 封装成对象

        //遍历list的三种方法
        // for(Product_general_cost pgc :list ){

        //     //求最小
        //     //legal_cost
        //     if(pgc.getLegal_cost().compareTo(min.getLegal_cost())==1){
        //     }else{

        //         min.setLegal_cost(pgc.getLegal_cost());
        //     };
        //     //Environment_cost
        //     if(pgc.getEnvironment_cost().compareTo(min.getEnvironment_cost())==1){

        //     }else{

        //         min.setEnvironment_cost(pgc.getEnvironment_cost());
        //     };
        //     //Machine_cost
        //     if(pgc.getMachine_cost().compareTo(min.getMachine_cost())==1){

        //     }else{

        //         min.setMachine_cost(pgc.getMachine_cost());
        //     };
        //     //material_cost
        //     if(pgc.getMaterial_cost().compareTo(min.getMaterial_cost())==1){

        //     }else{

        //         min.setMaterial_cost(pgc.getMaterial_cost());
        //     };
        //     //salary_cost
        //     if(pgc.getSalary_cost().compareTo(min.getSalary_cost())==1){

        //     }else{

        //         min.setSalary_cost(pgc.getSalary_cost());
        //     };








        //     //求最大
        //     if(pgc.getLegal_cost().compareTo(max.getLegal_cost())==-1){
        //     }else{

        //         max.setLegal_cost(pgc.getLegal_cost());
        //     };
        //     //Environment_cost
        //     if(pgc.getEnvironment_cost().compareTo(max.getEnvironment_cost())==-1){

        //     }else{

        //         max.setEnvironment_cost(pgc.getEnvironment_cost());
        //     };
        //     //Machine_cost
        //     if(pgc.getMachine_cost().compareTo(max.getMachine_cost())==-1){

        //     }else{

        //         max.setMachine_cost(pgc.getMachine_cost());
        //     };
        //     //material_cost
        //     if(pgc.getMaterial_cost().compareTo(max.getMaterial_cost())==-1){

        //     }else{

        //         max.setMaterial_cost(pgc.getMaterial_cost());
        //     };
        //     //salary_cost
        //     if(pgc.getSalary_cost().compareTo(max.getSalary_cost())==-1){

        //     }else{

        //         max.setSalary_cost(pgc.getSalary_cost());
        //     };
        // }


        // while(it.hasNext()){

        //     Product_general_cost pgc=it.next();
        //     if(pgc.getLegal_cost().compareTo(min.getLegal_cost())==1){
        //     }else{

        //         min.setLegal_cost(pgc.getLegal_cost());
        //     };
        //     //Environment_cost
        //     if(pgc.getEnvironment_cost().compareTo(min.getEnvironment_cost())==1){

        //     }else{

        //         min.setEnvironment_cost(pgc.getEnvironment_cost());
        //     };
        //     //Machine_cost
        //     if(pgc.getMachine_cost().compareTo(min.getMachine_cost())==1){

        //     }else{

        //         min.setMachine_cost(pgc.getMachine_cost());
        //     };
        //     //material_cost
        //     if(pgc.getMaterial_cost().compareTo(min.getMaterial_cost())==1){

        //     }else{

        //         min.setMaterial_cost(pgc.getMaterial_cost());
        //     };
        //     //salary_cost
        //     if(pgc.getSalary_cost().compareTo(min.getSalary_cost())==1){

        //     }else{

        //         min.setSalary_cost(pgc.getSalary_cost());
        //     };








        //     //求最大
        //     if(pgc.getLegal_cost().compareTo(max.getLegal_cost())==-1){
        //     }else{

        //         max.setLegal_cost(pgc.getLegal_cost());
        //     };
        //     //Environment_cost
        //     if(pgc.getEnvironment_cost().compareTo(max.getEnvironment_cost())==-1){

        //     }else{

        //         max.setEnvironment_cost(pgc.getEnvironment_cost());
        //     };
        //     //Machine_cost
        //     if(pgc.getMachine_cost().compareTo(max.getMachine_cost())==-1){

        //     }else{

        //         max.setMachine_cost(pgc.getMachine_cost());
        //     };
        //     //material_cost
        //     if(pgc.getMaterial_cost().compareTo(max.getMaterial_cost())==-1){

        //     }else{

        //         max.setMaterial_cost(pgc.getMaterial_cost());
        //     };
        //     //salary_cost
        //     if(pgc.getSalary_cost().compareTo(max.getSalary_cost())==-1){

        //     }else{

        //         max.setSalary_cost(pgc.getSalary_cost());
        //     };
        // }



        // //求averge (min+max)/2
        // average.setEnvironment_cost(min.getEnvironment_cost().add(max.getEnvironment_cost()).divide(new BigDecimal("3"),RoundingMode.HALF_UP));
        // average.setLegal_cost(min.getLegal_cost().add(max.getLegal_cost()).divide(new BigDecimal("3"),RoundingMode.HALF_UP));
        // average.setMachine_cost(min.getMachine_cost().add(max.getMachine_cost()).divide(new BigDecimal("3"),RoundingMode.HALF_UP));
        // average.setEnvironment_cost(min.getMaterial_cost().add(max.getMaterial_cost()).divide(new BigDecimal("3"),RoundingMode.HALF_UP));
        // average.setSalary_cost(min.getSalary_cost().add(max.getSalary_cost()).divide(new BigDecimal("3"),RoundingMode.HALF_UP));

        Product_general_cost min= new Product_general_cost();
        Product_general_cost max= new Product_general_cost();
        Product_general_cost average= new Product_general_cost();
        Product_general_cost temp= new Product_general_cost();

        List<Double> en_cost=new ArrayList<>();
        List<Double> le_cost=new ArrayList<>();
        List<Double> mac_cost=new ArrayList<>();
        List<Double> mat_cost=new ArrayList<>();
        List<Double> sal_cost=new ArrayList<>();

        
        Iterator<Product_general_cost> it=list.iterator();  


        while(it.hasNext()){
            temp=it.next();
            en_cost.add(temp.getEnvironment_cost());
            le_cost.add(temp.getLegal_cost());
            mac_cost.add(temp.getMachine_cost());
            mat_cost.add(temp.getMaterial_cost());
            sal_cost.add(temp.getSalary_cost());
        };
        Collections.sort(en_cost);
        Collections.sort(le_cost);
        Collections.sort(mac_cost);
        Collections.sort(mat_cost);
        Collections.sort(sal_cost);

        List<Product_general_cost> list_new =new ArrayList<>();
        // list_new.add(average);

        min.setEnvironment_cost(en_cost.get(0));
        min.setLegal_cost(le_cost.get(0));
        min.setMachine_cost(mac_cost.get(0));
        min.setMaterial_cost(mat_cost.get(0));
        min.setSalary_cost(sal_cost.get(0));

        max.setEnvironment_cost(en_cost.get(en_cost.size()-1));
        max.setLegal_cost(le_cost.get(le_cost.size()-1));
        max.setMachine_cost(mac_cost.get(mac_cost.size()-1));
        max.setMaterial_cost(mat_cost.get(mat_cost.size()-1));
        max.setSalary_cost(sal_cost.get(sal_cost.size()-1));

        //具有代表性的怎么说 求平均
        double sum_01=0;
        for(Double b :en_cost){
            sum_01+=b;
        };
        // BigDecimal a1=new BigDecimal()
        double av_01=sum_01/Double.valueOf(en_cost.size());

        double sum_02=0;
        for(Double b :le_cost){
            sum_02+=b;
        };
        double av_02=sum_02/Double.valueOf(le_cost.size());

        double sum_03=0;
        for(Double b :mac_cost){
            sum_03+=b;
        };
        double av_03=sum_03/Double.valueOf(mac_cost.size());

        double sum_04=0;
        for(Double b :mat_cost){
            sum_04+=b;
        };
        double av_04=sum_04/Double.valueOf(mat_cost.size());

        double sum_05=0;
        for(Double b :sal_cost){
            sum_05+=b;
        };
        double av_05=sum_05/Double.valueOf(sal_cost.size());



        average.setEnvironment_cost(av_01);
        average.setLegal_cost(av_02);
        average.setMachine_cost(av_03);
        average.setMaterial_cost(av_04);
        average.setSalary_cost(av_05);

        list_new.add(average);
        list_new.add(min);
        list_new.add(max);

        System.out.println("经过处理的："+list_new);
        return list_new;
        
    }
}