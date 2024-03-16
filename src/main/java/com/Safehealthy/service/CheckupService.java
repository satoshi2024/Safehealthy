package com.Safehealthy.service;

import java.util.List;

import com.Safehealthy.entity.Lcheckup;

public interface CheckupService {

    int addCheckup(Lcheckup lcheckup);
    int updPrice(Lcheckup lcheckup);
    List<Lcheckup> selCheckup(Lcheckup lcheckup);
}
