package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.ReportVo;

@Mapper
public interface CTakeMapper {
    //查询挂号的所有信息用于页面表格展示
    List<ReportVo> sel();
    //药品出库修改用户状态
    Integer chuku(ReportVo reportVo);
    //查看所有交过费出院的患者
    List<ReportVo> selhuan(ReportVo reportVo);
    //查询该用户的总价钱
    int zong(Integer reid);
}
