package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Register;

@Mapper
public interface LleaveMapper {

    List<Register> selRegisters(Register register);
    int updRstate(Register register);
    int updBstate(Register register);
    int selYaos(Register register);

}
