package com.Safehealthy.service.Impl;

import com.Safehealthy.entity.Lcheckup;
import com.Safehealthy.mapper.CheckupMapper;
import com.Safehealthy.service.CheckupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CheckupServiceImpl implements CheckupService {

    @Resource
    private CheckupMapper checkupMapper;

    @Override
    public int addCheckup(Lcheckup lcheckup) {
        return checkupMapper.addCheckup(lcheckup);
    }

    @Override
    public int updPrice(Lcheckup lcheckup) {
        return checkupMapper.updPrice(lcheckup);
    }

    @Override
    public List<Lcheckup> selCheckup(Lcheckup lcheckup) {
        return checkupMapper.selCheckup(lcheckup);
    }
}
