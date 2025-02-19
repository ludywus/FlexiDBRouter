# EasyDBRouter-db-router-spring-boot-starter
db-router-spring-boot-starter
##  author: cjl
### 数据库连接池支持
- 实现分库全局配置
配置mini-db-router.jdbc.datasource.global全局属性,如果db没有这个属性,则取全局,
否则取db中的配置。同时支持嵌套配置，如下pool.maximum-pool-size，若db中有pool,但没有pool.maximum-pool-size也会取全局值。
```
mini-db-router:
  jdbc:
    datasource:
      global:
        type-class-name: com.zaxxer.hikari.HikariDataSource
        pool:
            maximum-pool-size: 50
```
也可以对特定分库进行单独配置,如下:
```
mini-db-router:
  jdbc:
    datasource:
      db00:
        driver-class-name: com.mysql.jdbc.Driver
        url: jdbc:mysql://${basehost}:3306/lottery?useUnicode=true&characterEncoding=utf8&autoReconnect=true&zeroDateTimeBehavior=convertToNull&serverTimezone=UTC&useSSL=true
        username: root
        password: root
        type-class-name: com.alibaba.druid.pool.DruidDataSource
        pool:
          initialSize: 20
          minIdle: 20
          maxActive: 20
          maxWait: 60000
```
- 支持数据库连接池
可以通过global下或者db下的type-class-name指定数据库连接池实现，如Druid、HikariCP,并在pool属性下配置对应连接池的私有属性(无论使用中划线格式的属性或者驼峰都兼容)