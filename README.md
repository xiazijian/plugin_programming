# plugin_programming
实现简单的插件化编程，重点体会插件化编程的思想


plugin 是插件的接口，untitled1是plugin的具体实现。
实现步骤如下：
1.首先将plugin项目打成jar包，这里名字叫 plugin-1.0-SNAPSHOT.jar
注意：新建工程可以都建成maven工程比较容易打包
2.新建实现类项目untitled1(当时写的比较着急所以命名很差)，这里要将上一步生成的jar包导入，然后将实现的插件继续打包 
这里叫 untitled1.jar(名字比较差，所以后面手动将jar包改名了，，)
3.建立 Plugin_Programming_Demo 项目，将上一步生成的jar包改名为 mysqlJobManager.jar，然后放入到pluginLib文件夹下并导入该jar包
4.然后测试是否生效。


## 本demo使用的是classloader实现插件化编程，网上也有通过ServiceLoader 实现插件化的，这里不给例子了。

