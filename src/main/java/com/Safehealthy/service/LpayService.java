package com.Safehealthy.service;

import com.Safehealthy.entity.Lrecord;
import com.Safehealthy.entity.Pay;
import com.Safehealthy.entity.Register;

import java.util.List;

public interface LpayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
