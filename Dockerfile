FROM java:8
MAINTAINER tankechao
ADD ./target/alloy-monitor.jar alloy-monitor.jar
EXPOSE 9995
ENTRYPOINT ["java","-jar","alloy-monitor.jar"]
