# -------- Stage 1: Build the WAR --------
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the entire project into the image
COPY . .

# Build the WAR file
RUN mvn clean package -DskipTests

# -------- Stage 2: Run the WAR on Tomcat --------
FROM tomcat:9.0.85-jdk17

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the built WAR from stage 1
COPY --from=build /app/target/Mini_project-crudOperation-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
