# Plook 服务器端项目自述文档

该分支还没有完善，请切换到nodb分支

## 项目介绍

Plook 是一个基于 WebSocket 实现的网页端一起看功能的项目，允许用户在同一房间内共享视频，并且可以实时聊天。本项目为 Plook 的服务器端，使用 Spring Boot 框架开发，提供视频的管理、房间的管理以及 WebSocket 通信等功能。

## 项目初衷

大多数视频平台的一起看功能只能看平台上的视频，用户想看的资源如果平台上没有就无法实现共享观看，所以开发了 Plook 项目，允许用户自定义视频源，实现共享观看的功能。另外，该项目也可以被异地恋情侣用于共享观看视频，增强情感交流。

## 使用技术

- Spring Boot：快速搭建应用程序
- WebSocket：基于 TCP 协议实现全双工通信，提供实时性的数据传输
- Maven：项目构建和依赖管理工具

## 搭建教程

### 方法

应为我已经在static文件中加入了前端打包好的文件，所以直接用后端就直接部署

### 如果没有maven环境，可以直接下载jar包

[下载Jar](https://github.com/schuanhe/Plook-server/releases/download/V0.01/0.2.jar)

### 直接打包

我们需要克隆Plook-server代码，并使用Maven构建项目。请执行以下命令：

```
git clone https://github.com/schuanhe/Plook-server.git
cd Plook-server
mvn package
```

执行以上命令后，Maven会下载项目依赖并构建项目，生成可执行的JAR文件。构建完成后，可以在`target`目录下找到`Plook-server-1.0-SNAPSHOT.jar`文件。

运行Plook-server

最后，我们可以使用以下命令来运行Plook-server：

```
java -jar target/Plook-server-1.0-SNAPSHOT.jar
```

> 如果要前端自定义，直接替换static文件夹中的内容就行

### 宝塔部署

可以直接下载jar包

1. 点击网站->点击Java项目
2. 点击添加啊springboot项目
3. 项目路径选择你上传的jar包的位置
4. 端口1999
5. 绑定域名可以直接写
6. 提交，然后访问服务器ip:1999