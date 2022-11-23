package com.example.springbootfluentvue;

import cn.org.atool.fluent.mybatis.metadata.DbType;
import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.Table;
import cn.org.atool.generator.annotation.Tables;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EntityGeneratorTests {

    static final String url = "";
    static final String username = "";
    static final String password = "";

    /***
    static final String url = "";
    static final String username = "";
    static final String password = "";
    ***/

    @Test
    public void generate() throws Exception {
        FileGenerator.build(Empty.class);
    }

    @Tables(
            //设置数据库连接信息
            url = url, username = username, password = password,
            driver = "com.mysql.cj.jdbc.Driver",
            dbType = DbType.MYSQL,
            //设置entity类生成的目录
            srcDir = "src/main/java",
            //设置entity类的package
            basePack = "com.example.springbootfluentvue",
            //设置dao接口和实现的src的目录
            daoDir = "src/main/java",
            //设置要生成entity类的表
            //schema = "dbo",
            tables = @Table(value = {"book", "booktag"})

            )

    static class Empty {

    }
}
