# 鱼盒

鱼盒（FishBox）—— 基于 Spring Cloud Alibaba 微服务架构的社区分享平台。

---

## 技术亮点

#### Spring Cloud Alibaba 微服务生态
集成 **Nacos** 注册中心与配置中心、**Gateway** 网关路由与统一鉴权、**Sentinel** 熔断限流降级、**Feign** 声明式服务间调用，构建完整的微服务治理体系，保障服务高可用。
#### 企业级中间件整合
集成 **Redis** 缓存、**RocketMQ** 消息队列、**XXL-JOB** 分布式任务调度、**Canal** 数据同步、**Cassandra** 列式存储、**Minio** 对象存储等中间件，提升系统性能，支撑高吞吐低延迟响应。
#### Elasticsearch 分布式搜索引擎
基于 **Elasticsearch** 提供笔记与用户的中文分词搜索能力，支持自定义 **Score** 评分排序、中文词库扩展、同义词匹配等高级搜索特性。
#### 高并发读写设计
基于实际业务场景（热点笔记、用户关注流、评论等）采用缓存穿透防护、读写分离、异步削峰等策略，支撑接口高并发读写。
#### SaToken 认证鉴权
基于 **SaToken** 实现用户登录认证与角色权限管理，轻量高效，替代 Spring Security 的复杂配置。
#### 对象存储
接入 **Minio**、**阿里云 OSS** 等多种对象存储服务，支持图片、视频等多媒体文件的上传与管理。

---

## 项目结构

```
fishbox
├── fish-framework                  # 平台基础框架
│   ├── fish-common                 # 通用工具模块
│   ├── fish-spring-boot-starter-biz-operationlog   # 接口日志组件
│   └── fish-spring-boot-starter-jackson            # Jackson 序列化组件
└── fishbox-auth                    # 认证服务
```

## 技术栈

| 分类 | 技术选型 |
|------|---------|
| 微服务 | Spring Cloud Alibaba、Nacos、Gateway、Sentinel、Feign |
| 认证鉴权 | SaToken |
| 数据层 | MySQL、MyBatis、Druid |
| 缓存 | Redis |
| 消息队列 | RocketMQ |
| 任务调度 | XXL-JOB |
| 搜索引擎 | Elasticsearch |
| 对象存储 | Minio、阿里云 OSS |
| 部署运维 | Docker、Jenkins |
| 性能工具 | JMeter |
