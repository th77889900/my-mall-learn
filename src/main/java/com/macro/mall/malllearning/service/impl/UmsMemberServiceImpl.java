package com.macro.mall.malllearning.service.impl;

import com.macro.mall.malllearning.common.api.CommonResult;
import com.macro.mall.malllearning.service.RedisService;
import com.macro.mall.malllearning.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/13 11:32 下午
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private RedisService redisService;

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private String REDIS_KEY_EXPIRE_AUTH_CODE;

    @Override
    public CommonResult generateAuthCode(String telePhone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telePhone, sb.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telePhone, Long.valueOf(REDIS_KEY_EXPIRE_AUTH_CODE));

        return CommonResult.success(sb.toString(), "获取验证码成功");
    }

    @Override
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        if (StringUtils.isEmpty(authCode)) {
            CommonResult.failed("请输入验证码");
        }
        String realAuthcode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        if (authCode.equals(realAuthcode)) {
            CommonResult.success(null, "验证成功");
        } else {
            CommonResult.failed("验证码不正确");
        }
        return null;
    }
}
