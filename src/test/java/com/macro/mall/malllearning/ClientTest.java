package com.macro.mall.malllearning;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/18 6:40 下午
 */
public class ClientTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();

        hashMap.put("1", "1");
        map.put("1", "2");

        map.putAll(hashMap);

        System.out.println(map.get("1"));

        List<String> list = Lists.newArrayList();

        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        list.add("55");
        System.out.println(list);

        List<String> collect = list.stream().filter(s -> !s.equals("22")).collect(Collectors.toList());

        System.out.println(collect);

    }
}
