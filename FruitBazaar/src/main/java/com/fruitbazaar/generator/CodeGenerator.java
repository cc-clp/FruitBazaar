package com.fruitbazaar.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class CodeGenerator {
//    public static void main(String[] args) {
//        FastAutoGenerator.create("jdbc:mysql://localhost:3306/fruitbazaar", "root", "123456")
//                .globalConfig(builder -> {
//                    builder.author("clp") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .outputDir("E:\\JavaProject\\FruitBazaar\\FruitBazaar\\src\\main\\java\\com\\fruitbazaar"); // 指定输出目录
//
//                })
//                .dataSourceConfig(builder ->
//                        builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
//                            int typeCode = metaInfo.getJdbcType().TYPE_CODE;
//                            if (typeCode == Types.SMALLINT) {
//                                // 自定义类型转换
//                                return DbColumnType.INTEGER;
//                            }
//                            return typeRegistry.getColumnType(metaInfo);
//                        })
//                )
//                .packageConfig(builder ->
//                        builder.parent("com.fruitbazaar.generator") // 设置父包名
//                                .moduleName("generator") // 设置父包模块名
//                                .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\Users\\18587\\Desktop\\a")) // 设置mapperXml生成路径
//                )
//                .strategyConfig(builder ->
//                        builder.addInclude("t_simple") // 设置需要生成的表名
//                                .addTablePrefix("t_", "c_") // 设置过滤表前缀
//                )
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
//                .execute();
//    }
}
