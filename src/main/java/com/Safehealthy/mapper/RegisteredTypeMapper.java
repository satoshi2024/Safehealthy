package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Registeredtype;

@Mapper
public interface RegisteredTypeMapper {
    //挂号类型的增删查改
    List<Registeredtype> registeredTypeList(Registeredtype registeredType);
    int deleteType(Integer registeredId);
    int editRegisteredType(Registeredtype Registeredtype);
    int addRegisteredType(Registeredtype Registeredtype);
    int count(Registeredtype registeredType);


}
