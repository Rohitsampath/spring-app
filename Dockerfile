# Use official Tomcat image
FROM tomcat:9.0.85-jdk17

# Clean default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR to Tomcat webapps
COPY target/Mini_project-crudOperation-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080

CMD ["catalina.sh", "run"]
