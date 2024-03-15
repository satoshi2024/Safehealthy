package com.Safehealthy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Safehealthy.entity.CCashier;
import com.Safehealthy.entity.CPharmacy;
import com.Safehealthy.entity.CReport;
import com.Safehealthy.entity.CWarehuose;
import com.Safehealthy.entity.ReportVo;

@Mapper
public interface CCashierMapper {
    //ウェブページの表に表示するために予約情報をすべて検索します" (Webページの表に表示するために予約情報をすべて検索し
    List<ReportVo> sel();
    //全ての薬局を検索する
    List<CWarehuose> selware();
    //薬局に基づいて、すべての医薬品情報を医薬品詳細ボックスに表示し
    List<CPharmacy> selpharm(CPharmacy cPharmacy);
    //このユーザーの処方箋にその薬があるかどうかを検索し
    Integer selcadr(CCashier cCashier);
    //処方薬を追加する
    Integer addchu(CCashier cCashier);
    //該当薬品があれば、その薬品の数量を変更し
    Integer updchu(CCashier cCashier);
    //そのユーザーの処方を検索し
    List<CCashier> selpepi(Integer perid);
    //処方箋から医薬品を削除する
    Integer del(CCashier cCashier);
    //薬局の数量を減らす
    Integer deldrunum(CPharmacy cPharmacy);
    //医薬品の数量を追加する
    Integer adddrunum(CPharmacy cPharmacy);
    //あいまい検索
    List<ReportVo> mohu(ReportVo reportVo);
    //ユーザーの病歴を修正する
    Integer addbing(CReport cReport);
    //ユーザーに病歴があるかどうかを調べる
    String selbing(Integer rid);
    //ユーザーがプロジェクトを実行した結果を検索する
    String lookbing(Integer reid);
    //そのユーザーが未払いのプロジェクトがあるかどうかを調べる
    int seljiao(Integer reid);
    //そのユーザーがすでに行ったプロジェクトがいくつあるかを確認する
    Integer selyi(Integer reid);
    //そのユーザーがお金を支払ったプロジェクトがいくつあるかを確認する
    Integer selgong(Integer reid);
    //ユーザーのすべての処方箋を検索する
    List<CCashier> selall(Integer perid);
    //ユーザーのプロジェクトの処方箋を検索する
    List<CCashier> selximu(Integer perid);
}
