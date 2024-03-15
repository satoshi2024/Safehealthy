package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Paiban;

@Mapper
public interface MainMapper {
    List<Paiban> one();
    List<Paiban> two();
    List<Paiban> three();
    List<Paiban> four();
    List<Paiban> five();
    List<Paiban> six();
    List<Paiban> seven();
    int currentNum();
    int Total();
    int zhuyuanTotal();
    int currentZhuYuan();

}
