package com.lcfc.spring_demo.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.lcfc.spring_demo.entity.Material_spec;
import com.lcfc.spring_demo.entity.Quatation_sheet;
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
    //返回processor 可以给出品牌参数
    public Material_spec getProcessor(int amount){
        return getBest(material_specMapper.getProcessor(), amount);  
    }
    //ram   可以给出品牌参数
    public Material_spec getRam(int amount){
        return getBest(material_specMapper.getRam(), amount);  
    }

    //hard_disk 可以给出品牌参数
    public Material_spec getHard_disk(int amount){
        return getBest(material_specMapper.getHard_disk_capacity(), amount);  
    }

    //display   可以给出品牌参数
    public Material_spec getDisplay(int amount){
        return getBest(material_specMapper.getDisplay(), amount);  
    }

    //物料报价单  
    public Map<String,Object> getCostInfo(int amount){
        BigDecimal amount_01=new BigDecimal(amount);
        BigDecimal cost=new BigDecimal(0);
        Map<String,Object> map=new HashMap<>();

        Vendor_select costInfo=new Vendor_select();

        Quatation_sheet qs_processor=new Quatation_sheet();
        Quatation_sheet qs_ram=new Quatation_sheet();
        Quatation_sheet qs_hard_disk_capacity=new Quatation_sheet();
        Quatation_sheet qs_display=new Quatation_sheet();

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

        qs_processor.setAmount(amount);
        qs_processor.setPrice(costInfo.getProcessor_price());
        qs_processor.setSpec(costInfo.getProcessor_spec());
        qs_processor.setSum(costInfo.getProcessor_price().multiply(amount_01));
        qs_processor.setVendor(costInfo.getProcessor_vendor());

        qs_ram.setAmount(amount);
        qs_ram.setPrice(costInfo.getRam_price());
        qs_ram.setSpec(costInfo.getRam_spec());
        qs_ram.setSum(costInfo.getRam_price().multiply(amount_01));
        qs_ram.setVendor(costInfo.getRam_vendor());

        qs_hard_disk_capacity.setAmount(amount);
        qs_hard_disk_capacity.setPrice(costInfo.getHard_disk_capacity_price());
        qs_hard_disk_capacity.setSpec(costInfo.getHard_disk_capacity_spec());
        qs_hard_disk_capacity.setSum(costInfo.getHard_disk_capacity_price().multiply(amount_01));
        qs_hard_disk_capacity.setVendor(costInfo.getHard_disk_capacity_vendor());

        qs_display.setAmount(amount);
        qs_display.setPrice(costInfo.getDisplay_price());
        qs_display.setSpec(costInfo.getDisplay_spec());
        qs_display.setSum(costInfo.getDisplay_price().multiply(amount_01));
        qs_display.setVendor(costInfo.getDisplay_vendor());

        
        BigDecimal cost_01= cost.add(qs_display.getSum()).add(qs_hard_disk_capacity.getSum()).add(qs_processor.getSum()).add(qs_ram.getSum());

        map.put("costInfo",costInfo);
        map.put("qs_processor", qs_processor);
        map.put("qs_ram", qs_ram);
        map.put("qs_hard_disk_capacity", qs_hard_disk_capacity);
        map.put("qs_display", qs_display);

        map.put("cost",cost_01);
        return map;
        
    }



}