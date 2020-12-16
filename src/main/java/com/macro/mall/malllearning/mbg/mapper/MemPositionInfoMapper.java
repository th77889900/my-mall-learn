package com.macro.mall.malllearning.mbg.mapper;

import com.macro.mall.malllearning.mbg.model.MemPositionInfo;
import com.macro.mall.malllearning.mbg.model.MemPositionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemPositionInfoMapper {
    int countByExample(MemPositionInfoExample example);

    int deleteByExample(MemPositionInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemPositionInfo record);

    int insertSelective(MemPositionInfo record);

    List<MemPositionInfo> selectByExampleWithBLOBs(MemPositionInfoExample example);

    List<MemPositionInfo> selectByExample(MemPositionInfoExample example);

    MemPositionInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemPositionInfo record, @Param("example") MemPositionInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") MemPositionInfo record, @Param("example") MemPositionInfoExample example);

    int updateByExample(@Param("record") MemPositionInfo record, @Param("example") MemPositionInfoExample example);

    int updateByPrimaryKeySelective(MemPositionInfo record);

    int updateByPrimaryKeyWithBLOBs(MemPositionInfo record);

    int updateByPrimaryKey(MemPositionInfo record);
}