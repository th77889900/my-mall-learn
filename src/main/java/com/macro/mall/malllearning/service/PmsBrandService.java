package com.macro.mall.malllearning.service;

import com.macro.mall.malllearning.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/12 4:10 下午
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand pmsBrand);

    int updateBrand(Long id, PmsBrand pmsBrand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
