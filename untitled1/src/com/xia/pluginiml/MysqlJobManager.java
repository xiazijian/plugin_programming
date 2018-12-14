package com.xia.pluginiml;

import com.xia.plugins.JobManager;

public class MysqlJobManager extends JobManager {
    @Override
    public void prepare() {
        System.out.println("连接Mysql数据库");
    }

    @Override
    public void check() {
        System.out.println("检查Mysql数据库表、字段，没有则创建");
    }

    @Override
    public void transformRule() {
        System.out.println("将清洗条件转换为sql");
    }
}
