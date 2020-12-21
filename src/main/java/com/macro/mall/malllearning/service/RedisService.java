package com.macro.mall.malllearning.service;

/**
 * redis操作 service
 * @author ：tengu
 * @date ：Created in 2020/11/13 11:11 下午
 */
public interface RedisService {

    /**
     * 设置数据
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 获取数据
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置超时时间
     * @param key
     * @param expire
     * @return
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     *
     * @param key
     */
    void remove(String key);

    /**
     * 自增操作
     *
     * @param key
     * @param delta
     * @return
     */
    Long increment(String key, long delta);

}
