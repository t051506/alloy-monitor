FROM java:8
MAINTAINER tankechao
ADD alloy-monitor.jar app.jar
EXPOSE 9995
ENTRYPOINT ["java","-jar","app.jar"]
