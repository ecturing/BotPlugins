# 插件系统模板
## Maven已经自动配置以下依赖

第5，6项根据插件功能选择是否保留，其余依赖均为必须

1. spring-boot-starter-parent
2. spring-boot-configuration-processor
3. spring-boot-autoconfigure
4. PluginsInterface
5. fastjson2
6. httpclient

## 必做操作

推荐使用IDEA的重构功能进行更改Service类名称，更改为能清楚表达插件功能的名称 
### 重要
1. 配置AutoConfig的@Bean的注解参数，参数为string类型，此参数为标识唯一插件的名称，不可重复。
2. 系统插件系统返回值为QQ可读格式，不可为json格式。