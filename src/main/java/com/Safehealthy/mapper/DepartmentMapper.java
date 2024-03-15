package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.Departments;

@Mapper
public interface DepartmentMapper {
    List<Departments> departmentList(Departments departments);
    int deleteDepartment(Integer departmentId);
    int addDepartment(Departments departments);
    int count(Departments departments);

    /*
    * 判断该科室是否还有医生
    * */
    int checkCount(Integer departmentId);
}
