#базовый образ содержит JDK 17
FROM openjdk:17-oracle
#директория приложения внутри контейнера
WORKDIR /app
#копируем jar-файл внутрь контейнера, внутри директории /app и будет называться app.jar
COPY target/springSkillbox-0.0.1-SNAPSHOT.jar app.jar
#команда запуска приложения
CMD ["java", "-jar", "app.jar"]
