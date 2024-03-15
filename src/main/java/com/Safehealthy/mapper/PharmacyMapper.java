package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Baoque;
import com.Safehealthy.entity.Huishou;
import com.Safehealthy.entity.Ypharmacy;

@Mapper
public interface PharmacyMapper {
    //查询药房药品
    List<Ypharmacy>selpharmacy(Ypharmacy ypharmacy);
    //添加药品到报缺表
    int addbaoque(Baoque baoque);
    //查询报缺表药品名称是否已存在
    int selbaoqueName(Baoque baoque);
    //修改数量
    int upbaoquenum(Baoque baoque);
    //回收给药房
    int delpharymacy(Ypharmacy ypharmacy);
    //回收表
    int addhuishou(Huishou huishou);
    //查询回收表
    List<Huishou>selhuishou(Huishou huishou);
    //删除回收表
    int delhuishou(Huishou huishou);
}
