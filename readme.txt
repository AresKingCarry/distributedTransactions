分布式事务

框架采用SSM
数据库：mysql，建库脚本在sql文件夹下，建立在不同物理节点的数据库上。



采专用jTa和Atomikos完成分布式事务：

1.建立JTA事务管理器，通过springAop 对执行增删改的方法进行事务管理，通知使用JtaTransactionmanager


2.建立两个数据源，数据源建立为Atomikos数据源，数据源和mybatis和spring进行整合。
  不同数据源交给不同的SqlsessionFactory管理，配置mapper扫描包

3.把两个数据库的数据源交给JTA事务管理器管理。


详细访问
http://blog.csdn.net/kisscatforever/article/details/79129055