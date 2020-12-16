package com.macro.mall.malllearning.service;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/13 11:11 下午
 */
public interface RedisService {

    void set(String key, String value);

    String get(String key);

    boolean expire(String key, long expire);

    void remove(String key);

    Long increment(String key, long delta);

}
