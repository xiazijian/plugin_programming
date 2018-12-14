package com.xia.demo;

import com.xia.demo.core.PluginLoader;
import com.xia.demo.util.PluginUtils;
import com.xia.plugins.JobManager;

import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String pluginName = "mysqlJobManager";
        String pluginClassName = PluginLoader.getPluginClassName(pluginName);
        System.out.println("插件类名："+pluginClassName);

        Class<?> cls = PluginUtils.loadClass(pluginName, pluginClassName);

        JobManager jobManager = (JobManager)cls.newInstance();

        jobManager.prepare();
        jobManager.check();
        jobManager.transformRule();
    }
}
