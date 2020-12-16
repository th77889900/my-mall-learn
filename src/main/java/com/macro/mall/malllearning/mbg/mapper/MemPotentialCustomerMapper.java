package com.macro.mall.malllearning.mbg.mapper;

import com.macro.mall.malllearning.mbg.model.MemPotentialCustomer;
import com.macro.mall.malllearning.mbg.model.MemPotentialCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemPotentialCustomerMapper {
    int countByExample(MemPotentialCustomerExample example);

    int deleteByExample(MemPotentialCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemPotentialCustomer record);

    int insertSelective(MemPotentialCustomer record);

    List<MemPotentialCustomer> selectByExample(MemPotentialCustomerExample example);

    MemPotentialCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemPotentialCustomer record, @Param("example") MemPotentialCustomerExample example);

    int updateByExample(@Param("record") MemPotentialCustomer record, @Param("example") MemPotentialCustomerExample example);

    int updateByPrimaryKeySelective(MemPotentialCustomer record);

    int updateByPrimaryKey(MemPotentialCustomer record);
}