
1、通过netty-httpserver服务发布spring restful接口服务

2、其他项目添加依赖，pom文件添加如下
	
		<!-- netty httpserver服务包 -->
		<dependency>
			<groupId>vdaifu</groupId>
			<artifactId>netty-httpserver</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>

3、依赖项目需要在src目录下添加配置文件
	spring的controller自动扫描配置文件：applicationContext.xml
	log4j配置文件：log4j.properties
	logback配置文件：logback.xml
	netty服务参数配置：nettyserver.properties