package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Skull;
@Mapper
public interface SkullMapper {
    //经办人的增删查改
    List<Skull> findAllSkull(Skull skull);
    int deleteSkull(Integer skullId);
    int addSkull(Skull skull);
    int editSkull(Skull skull);
}
