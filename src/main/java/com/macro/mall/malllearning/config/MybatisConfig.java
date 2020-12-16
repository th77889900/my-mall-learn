package com.macro.mall.malllearning.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/12 4:07 下午
 */
@Configuration
@MapperScan("com.macro.mall.malllearning.mbg.mapper")
public class MybatisConfig {

}
