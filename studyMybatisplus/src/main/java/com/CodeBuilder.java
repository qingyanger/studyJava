package com;

import com.common.Builder;
import com.config.GeneratorConfig;
import groovyjarjarantlr.CodeGenerator;

/**
 * @Author zqj
 * @Date 2020-3-7-0007 18:56
 * @Version 1.0
 */
public class CodeBuilder {
    public static void main(String[] args) {


        GeneratorConfig build1 = Builder.of(GeneratorConfig::new)
                .with(GeneratorConfig::setAuthor, "victor")
                .with(GeneratorConfig::setOutputDir, "D:\\builder\\")
                .with(GeneratorConfig::setTablePrefix, "")
                .with(GeneratorConfig::setParentPackage, "com.db")
                .with(GeneratorConfig::setJdbcUrl, "jdbc:mysql://shukuang.mysql.huhehaote.rds.aliyuncs.com:3306/sk_platform_test?useUnicode=true&characterEncoding=utf8&useTimezone=true&serverTimezone=GMT%2B8&zeroDateTimeBehavior=convertToNull")
                .with(GeneratorConfig::setUserName, "root")
                .with(GeneratorConfig::setPassWord, "password01!")
                .build();
        MpGenerator.buildCode(build1);
    }
}
