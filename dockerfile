from maven:3.9.11-eclipse-temurin-21 as builder
RUN groupadd -r tourister && useradd -r -g tourister tourister
WORKDIR /app
copy /target/indiantourister.jar /app/indiantourister.jar
RUN  chown tourister:tourister indiantourister.jar
USER tourister
# Default environment variables
ENV SPRING_PROFILES_ACTIVE=default \
    JAVA_OPTS="-Xms256m -Xmx512m" \
    SERVER_PORT=8080
expose ${SERVER_PORT}
entrypoint exec java $JAVA_OPTS -Dspring.profiles=$SPRING_PROFILES_ACTIVE -jar indiantourister.jar