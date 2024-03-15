package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Record;

@Mapper
public interface RecordMapper {
    //查询所有记录
    List<Record> selrecord(Record record);
    //添加记录
int addjilu(Record record);


}
