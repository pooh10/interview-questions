# Get the GCC preinstalled image from Docker Hub
FROM maven

# Copy all files including pom.xml
COPY . /usr/src/

# Specify the working directory
WORKDIR /usr/src/

# Use maven to package the jar assuming the tests passed
RUN mvn package

# Run the program output from the previous step
CMD ["java", "-jar", "target/lru-java-0.0.1.jar"]
