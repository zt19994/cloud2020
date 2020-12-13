# cloud2020
spring cloud 学习

# 版本选型
版本选型都参考官方网站推荐配置

# 一、创建父类工程
1. New Project
2. 聚合总父工程名称
3. Maven选版本
4. 工程名称
5. 字符编码 UTF-8
6. 注解生效激活
7. java编译版本选8
8. File Type过滤

# 二、创建子类工厂
## 2.1 创建微服务模块步骤
1. 建module
2. 改POM
3. 写YML
4. 主启动
5. 业务类 
    1. 建表SQL
    2. entities
    3. dao
    4. service
    5. controller
6. 测试

## 2.2 热部署
1. Adding devtools to your project
2. Adding plugin to your pom.xml
3. Enabling automatic build
4. Update the value of
5. 重启Idea

## 2.3 RestTemplate
RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集，实现80到8001的远程调用。

1. 官网地址：https://docs.spring.io/spring-framework/docs/5.2.2.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html
2. 使用：使用restTemplate访问restful接口非常的简单粗暴，（url、requestMap、ResponseBean.class）这三个参数分别代表REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。

## 2.4 工程重构
项目中存在相同的代码（entities包下的Payment.class和CommonResult.class）,造成代码冗余，可以进行重构。
通过Maven聚合父工程，把相同重复的代码移到公开公用的工程里面，还可以放第三方接口、工具类，统一调配使用。

执行maven命令
1. clean
2. install

