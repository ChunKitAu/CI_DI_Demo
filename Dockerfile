FROM java:latest
#将jar包拷贝进容器
COPY target/demo-1.jar app.jar

EXPOSE 8086
# -Djava.security.egd=file:/dev/./urandom 可解决tomcat可能启动慢的问题
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
