FROM eclipse-temurin:21-jre-alpine
RUN addgroup -S tourister && adduser -S -G tourister tourister
WORKDIR /app
copy /target/indiantourister.jar /app/indiantourister.jar
RUN  chown tourister:tourister indiantourister.jar
USER tourister
# Default environment variables
ENV SPRING_PROFILES_ACTIVE=default \
    JAVA_OPTS="-Xms256m -Xmx512m" \
    SERVER_PORT=8080
expose ${SERVER_PORT}
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dspring.config.activate.on-profile=$SPRING_PROFILES_ACTIVE -jar indiantourister.jar"]