package com.Safehealthy.service.Impl;

import com.Safehealthy.entity.Record;
import com.Safehealthy.mapper.RecordMapper;
import com.Safehealthy.service.RecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper rd;
    @Override
    public List<Record> selrecord(Record record) {
        return rd.selrecord(record);
    }

    @Override
    public int addjilu(Record record) {
        return rd.addjilu(record);
    }
}
