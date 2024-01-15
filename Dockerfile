#FROM alpine 

#WORKDIR /dkr/app

#COPY ./ ./

#RUN apk add --update redis
#CMD ["redis-server"]


# Use an official Java runtime as a parent image
#FROM openjdk:11-jdk-slim

# Set the working directory in the container
#WORKDIR /usr/src/myapp

# Optional: Set environment variables for Maven (change versions as needed)
#ENV MAVEN_VERSION 3.8.2
#ENV MAVEN_HOME /usr/lib/mvn
#ENV PATH $MAVEN_HOME/bin:$PATH

# Install Maven and other required dependencies
#RUN apt-get update && apt-get install -y curl tar bash && \
#    curl -fsSL http://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz | tar -xzC /usr/lib && \
#    ln -s /usr/lib/apache-maven-$MAVEN_VERSION /usr/lib/mvn

# Clean up the apt cache to reduce image size
#RUN rm -rf /var/lib/apt/lists/*

# Copy the current directory contents into the container at /usr/src/myapp
#COPY . .

# Build the project and run tests
#RUN mvn clean compile

# Run tests using TestNG when the container launches
#CMD ["mvn", "test"]





# Use a base image with JDK 11
FROM openjdk:11-jdk

# Set the working directory in the Docker container
WORKDIR /usr/src/myapp

# Clone the desired git repository into the working directory
RUN apt-get update && \
    apt-get install -y git && \
    git clone https://github.com/dockutusu/docker.git .

# Install Maven
RUN apt-get update && \
    apt-get install -y maven
	
# Copy the current directory contents into the container at /usr/src/myapp
#COPY . .

# Build the project and run tests
#RUN mvn clean compile

# Run tests using TestNG when the container launches
#CMD ["mvn", "test"]



#docker run -it d9dca95f0b74 mvn clean test -DsuiteFile=docker -Denv=qa






