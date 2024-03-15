package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Litem;

@Mapper
public interface LitemMapper {

    List<Litem> selItems(Litem litem);
}
