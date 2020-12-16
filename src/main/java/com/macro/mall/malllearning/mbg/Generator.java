package com.macro.mall.malllearning.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：tengu
 * @date ：Created in 2020/11/11 5:06 下午
 */
public class Generator {
    public static void main(String[] args) throws Exception {

        //MBG warning message
        List<String> warnings = new ArrayList<>();

        // 代码重复 是否覆盖
        Boolean overwrite = true;

        InputStream is = Generator.class.getResourceAsStream(
                "/generatorConfig.xml");

        ConfigurationParser cp = new ConfigurationParser(warnings);

        Configuration configuration = cp.parseConfiguration(is);

        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);

        MyBatisGenerator batisGenerator = new MyBatisGenerator(configuration, callback, warnings);

        batisGenerator.generate(null);

        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
