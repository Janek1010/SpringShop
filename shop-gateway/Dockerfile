FROM eclipse-temurin:17.0.6_10-jre

ENV VERSION="1.0.0-SNAPSHOT"

ENV SERVER_PORT=8080

ENV SPRING_DATASOURCE_URL=jdbc:h2:mem:shop-gateway
ENV SPRING_DATASOURCE_DRIVERCLASSNAME=org.h2.Driver
ENV SPRING_DATASOURCE_USERNAME=admin
ENV SPRING_DATASOURCE_PASSWORD=password

ENV SPRING_JPA_DATABASE_PLATFORM=org.hibernate.dialect.H2Dialect
ENV SPRING_JPA_GENERATE_DDL=true
ENV SPRING_JPA_HIBERNATE_DDL_AUTO=update

ENV SPRING_H2_CONSOLE_enabled=true

ENV SHOP_GATEWAY_HOST=localhost:8080
ENV SHOP_ORDER_URL=http://localhost:8081
ENV SHOP_CUSTOMER_URL=http://localhost:8082


EXPOSE 8080

COPY target/shop-gateway-${VERSION}.jar /opt/shop-gateway/shop-gateway.jar

CMD ["java", "-jar", "/opt/shop-gateway/shop-gateway.jar"]
