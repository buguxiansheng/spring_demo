package com.lcfc.spring_demo.mapper;

import java.util.List;

import com.lcfc.spring_demo.entity.Material_spec;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Material_specMapper {
    //用四个线程分别去获取每一类的集合

    public List<Material_spec> getProcessor();

    public List<Material_spec> getRam();

    public List<Material_spec> getHard_disk_capacity();

    public List<Material_spec> getDisplay();

}