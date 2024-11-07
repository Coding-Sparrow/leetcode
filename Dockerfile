# Use maven image for running tests
FROM maven:3.8.4-openjdk-11

LABEL authors="ravattailor"

# Set working directory
WORKDIR /app

# Copy pom.xml first to cache dependencies
COPY pom.xml .

# Run mvn dependency:go-offline to download all dependencies
RUN mvn dependency:go-offline

# Copy source code and test files
COPY src ./src

# Command to run tests
CMD ["mvn", "test"]