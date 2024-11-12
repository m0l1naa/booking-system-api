# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo pom.xml y las dependencias para realizar el build
COPY pom.xml .

# Descarga las dependencias de Maven
RUN mvn dependency:go-offline

# Copia el código fuente del proyecto
COPY src /app/src

# Realiza el build del proyecto
RUN mvn clean package -DskipTests

# Expone el puerto en el que la aplicación va a correr
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "target/mi-aplicacion.jar"]