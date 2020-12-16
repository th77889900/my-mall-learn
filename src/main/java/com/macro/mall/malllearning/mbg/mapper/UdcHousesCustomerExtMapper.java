package com.macro.mall.malllearning.mbg.mapper;

import com.macro.mall.malllearning.mbg.model.UdcHousesCustomerExt;
import com.macro.mall.malllearning.mbg.model.UdcHousesCustomerExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UdcHousesCustomerExtMapper {
    int countByExample(UdcHousesCustomerExtExample example);

    int deleteByExample(UdcHousesCustomerExtExample example);

    int deleteByPrimaryKey(Integer dcId);

    int insert(UdcHousesCustomerExt record);

    int insertSelective(UdcHousesCustomerExt record);

    List<UdcHousesCustomerExt> selectByExample(UdcHousesCustomerExtExample example);

    UdcHousesCustomerExt selectByPrimaryKey(Integer dcId);

    int updateByExampleSelective(@Param("record") UdcHousesCustomerExt record, @Param("example") UdcHousesCustomerExtExample example);

    int updateByExample(@Param("record") UdcHousesCustomerExt record, @Param("example") UdcHousesCustomerExtExample example);

    int updateByPrimaryKeySelective(UdcHousesCustomerExt record);

    int updateByPrimaryKey(UdcHousesCustomerExt record);
}