FROM openjdk:8-alpine
COPY "./target/micro-deposit-0.0.1-SNAPSHOT.jar" "appmicro-deposit.jar"
EXPOSE 8096
ENTRYPOINT ["java","-jar","appmicro-depositjar"]