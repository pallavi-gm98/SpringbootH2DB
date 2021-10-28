# SpringbootH2DB
//h2/console
http://localhost:8080/h2/login.do?jsessionid=14a8de0c293a1ffa59111bedf3bc24f2

//application properties
spring.datasource.url=jdbc:h2:file:C:/temp/test
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Enabling H2 Console
spring.h2.console.enabled=true

# Custom H2 Console URL
spring.h2.console.path=/h2

spring.jpa.hibernate.ddl-auto=create-drop

#Turn Statistics on and log SQL stmts
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.generate_statistics=false
#logging.level.org.hibernate.type=trace
#logging.level.org.hibernate.stat=debug

logging.pattern.console=%d{yyyy-MM-dd HH🇲🇲ss} - %msg%n
