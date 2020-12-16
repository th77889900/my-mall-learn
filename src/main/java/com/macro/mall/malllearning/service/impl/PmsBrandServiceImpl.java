package com.macro.mall.malllearning.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.malllearning.mbg.mapper.PmsBrandMapper;
import com.macro.mall.malllearning.mbg.model.PmsBrand;
import com.macro.mall.malllearning.mbg.model.PmsBrandExample;
import com.macro.mall.malllearning.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/12 9:19 下午
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Resource
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        List<PmsBrand> pmsBrands = brandMapper.selectByExample(new PmsBrandExample());

        System.out.println(pmsBrands);

        return pmsBrands;
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
