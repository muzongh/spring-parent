### DOCKER 安装

#### DOCKER 安装zookeeper
```java
docker search zookeeper #搜索镜像
docker pull zookeeper # 拉取镜像
docker images #查看镜像
#启动docker
docker run --privileged=true -d --name zookeeper --publish 2181:2181  -d zookeeper
docker ps 查看进程
docker kill pid # 关闭进程
docker start|restart|stop zookeeper # 关闭进程

```
