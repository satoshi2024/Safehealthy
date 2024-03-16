package com.Safehealthy.service;

import java.util.List;

import com.Safehealthy.entity.Area;

public interface AreaService {
    /*
     * 地区的增删改查
     * */
    List<Area> findAllArea(Area area);
    int deleteArea(Integer areaId);
    int addArea(Area area);
    int count(Area area);
}
