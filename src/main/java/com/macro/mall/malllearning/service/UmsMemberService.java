package com.macro.mall.malllearning.service;

import com.macro.mall.malllearning.common.api.CommonResult;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/13 11:23 下午
 */
public interface UmsMemberService {

    CommonResult generateAuthCode(String telePhone);

    CommonResult verifyAuthCode(String telephone, String authCode);

}
