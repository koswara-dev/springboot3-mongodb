# Spring Boot 3 with MongoDB and Lombok

Welcome to the **Spring Boot 3 with MongoDB and Lombok** project! This project provides a demonstration of how to integrate these technologies to build a modern, efficient, and easy-to-maintain application.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project is a `Spring Boot` application that utilizes:
- **Spring Boot 3**: for building robust and scalable Java applications.
- **MongoDB**: as the NoSQL database.
- **Lombok**: to reduce boilerplate code by generating getters, setters, constructors, and more.

The goal is to provide a template that accelerates development by integrating these powerful technologies seamlessly.

## Features

- CRUD operations with MongoDB
- Spring Data MongoDB repository support
- Automatic generation of getter/setter methods using Lombok
- Easy configuration and setup with Spring Boot

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 17 or higher
- Maven 3.6.3 or higher
- MongoDB instance running locally or accessible remotely

### Installation

1. **Clone the Repository**

    ```sh
    git clone https://github.com/koswara-dev/springboot3-mongodb.git
    cd springboot3-mongodb
    ```

2. **Configure MongoDB Connection**

   Update the `application.properties` file located in the `src/main/resources` directory with your MongoDB connection details.

    ```properties
    spring.data.mongodb.uri=mongodb://localhost:27017/yourdatabase
    ```

3. **Build and Run the Application**

   Use Maven to build and run the application:

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

## Usage

Once the application is up and running, you can access it via `http://localhost:8080`. Example endpoints might include:

- Creating a new entity
- Retrieving entities
- Updating an entity
- Deleting an entity

Use tools like Postman or cURL to interact with your API endpoints.

## Configuration

Configurations can be adjusted in the `application.properties` file. For example, to change the server port:

```properties
server.port=8081
```

To add additional profiles or properties, consult the Spring Boot documentation for more details.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/my-feature`).
3. Commit your changes (`git commit -m 'Add my feature'`).
4. Push to the branch (`git push origin feature/my-feature`).
5. Open a Pull Request.

Please ensure your code adheres to the existing style conventions and includes relevant tests.

## Buy me a coffe

If you like this project and want to support its further development, buy me a coffee!

[![Buy Me a Coffee](https://www.buymeacoffee.com/assets/img/guidelines/download-assets-sm-1.svg)](https://www.buymeacoffee.com/kudajengke404)
