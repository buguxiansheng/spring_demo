package com.lcfc.spring_demo.service;

import java.util.Iterator;
import java.util.List;

import com.lcfc.spring_demo.entity.Material_spec;
import com.lcfc.spring_demo.entity.Vendor_select;
import com.lcfc.spring_demo.mapper.Material_specMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VendorSelect {
    //得到最低价格的供应商

    @Autowired
    private Material_specMapper material_specMapper;

    //通用方法
    public static Material_spec getBest(List<Material_spec> list,int amount){
        Iterator<Material_spec> it =list.iterator();
        Material_spec best=null;
        while(it.hasNext()){
            Material_spec next=it.next();
            if(best==null){
                best=next;
            }else{
                if(best.getAmount()<=amount){
                    if(next.getAmount()<=amount && next.getPrice_01().compareTo(best.getPrice_01())==-1){
                        best=next;
                    }else if(next.getAmount()>amount && next.getPrice_02().compareTo(best.getPrice_01())==-1){
                        best=next;
                    }
                }else{
                    if(next.getAmount()<=amount && next.getPrice_01().compareTo(best.getPrice_02())==-1){
                        best=next;
                    }else if(next.getAmount()>amount && next.getPrice_02().compareTo(best.getPrice_02())==-1){
                        best=next;
                    }
                }
            }
        }
        return best;  
    }
    //返回processor
    public Material_spec getProcessor(int amount){
        return getBest(material_specMapper.getProcessor(), amount);  
    }
    //ram
    public Material_spec getRam(int amount){
        return getBest(material_specMapper.getRam(), amount);  
    }

    //hard_disk
    public Material_spec getHard_disk(int amount){
        return getBest(material_specMapper.getHard_disk_capacity(), amount);  
    }

    //display
    public Material_spec getDisplay(int amount){
        return getBest(material_specMapper.getDisplay(), amount);  
    }

    //物料报价单
    public Vendor_select getCostInfo(int amount){
        Vendor_select costInfo=new Vendor_select();
        Material_spec best=getProcessor(amount);
        Material_spec best_01=getRam(amount);
        Material_spec best_02=getHard_disk(amount);
        Material_spec best_03=getDisplay(amount);

        costInfo.setProcessor_vendor(best.getVendor());
        costInfo.setProcessor_spec(best.getSpec());
        costInfo.setProcessor_price(best.getAmount()>amount?best.getPrice_01():best.getPrice_02());

        costInfo.setRam_vendor(best_01.getVendor());
        costInfo.setRam_spec(best_01.getSpec());
        costInfo.setRam_price(best_01.getAmount()>amount?best_01.getPrice_01():best_01.getPrice_02());

        costInfo.setHard_disk_capacity_vendor(best_02.getVendor());
        costInfo.setHard_disk_capacity_spec(best_02.getSpec());
        costInfo.setHard_disk_capacity_price(best_02.getAmount()>amount?best_02.getPrice_01():best_02.getPrice_02());

        costInfo.setDisplay_vendor(best_03.getVendor());
        costInfo.setDisplay_spec(best_03.getSpec());
        costInfo.setDisplay_price(best_03.getAmount()>amount?best_03.getPrice_01():best_03.getPrice_02());

        System.out.println(costInfo);
        return costInfo;
        
    }



}