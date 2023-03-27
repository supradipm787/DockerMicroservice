#FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
#MAINTAINER Brian Hannaway
#COPY pom.xml /build/
#COPY src /build/src/
#WORKDIR /build/
#RUN mvn package
#FROM openjdk:8-jre-alpine
#FROM tomcat:8.0-alpine
#WORKDIR /app
#COPY --from=MAVEN_BUILD /build/target/training.com.training1.war /app/
#ENTRYPOINT ["java", "-jar", "training.com.training1.war"]


FROM centos

#MAINTAINER hello@gritfy.com

RUN mkdir /opt/tomcat/

WORKDIR /opt/tomcat
#RUN curl -O https://www-eu.apache.org/dist/tomcat/tomcat-8/v8.5.40/bin/apache-tomcat-8.5.40.tar.gz
RUN curl -O https://downloads.apache.org/tomcat/tomcat-8/v8.5.85/bin/apache-tomcat-8.5.85.tar.gz
RUN tar xvfz apache*.tar.gz
#RUN tar xvf apache*.tar
RUN mv apache-tomcat-8.5.85/* /opt/tomcat/.

#used to search & copy mirrorlist & Centos vault to yum repos
RUN sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-*
RUN sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-*

RUN yum -y install java
#RUN yum -y install java-1.8.0-openjdk-devel
RUN java -version

WORKDIR /opt/tomcat/webapps
COPY /target/training.com.training1.war ./
EXPOSE 8080

CMD ["/opt/tomcat/bin/catalina.sh", "run"]
