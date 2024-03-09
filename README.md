# Spring Cloud Bus Demo

This project demonstrates the use of Spring Cloud Bus with RabbitMQ as a message broker to enable dynamic configuration refresh for microservices in a Spring Cloud environment. In this demo, we have several services:

- `eureka-server-1`: Eureka Server instance 1
- `eureka-server-2`: Eureka Server instance 2
- `refresh-service`: A service that can be dynamically refreshed using Spring Cloud Bus
- `student-producer-1`: Student Producer service instance 1
- `student-producer-2`: Student Producer service instance 2

## Overview

In a microservices architecture, maintaining configuration consistency across all services can be challenging. Spring Cloud Bus addresses this challenge by allowing configuration changes to be broadcasted to multiple services. 

In this demo, when a configuration change is made and pushed to the Spring Cloud Bus, services subscribed to the bus receive the update and refresh their configurations accordingly.

## Project Structure

- `eureka-server-1`: Contains the first instance of the Eureka Server.
- `eureka-server-2`: Contains the second instance of the Eureka Server.
- `refresh-service`: A sample service demonstrating dynamic configuration refresh using Spring Cloud Bus.
- `student-producer-1`: First instance of the Student Producer service.
- `student-producer-2`: Second instance of the Student Producer service.

## Usage

1. Start the Eureka Server instances (`eureka-server-1` and `eureka-server-2`).
2. Start the Student Producer service instances (`student-producer-1` and `student-producer-2`), ensuring they register with the Eureka servers.
3. Start the Refresh Service.
4. Make configuration changes in the Refresh Service and push them to the Spring Cloud Bus.
5. Observe how the configuration changes are dynamically propagated to the Student Producer services.

## Dependencies

- Java 8 or higher
- Spring Boot
- Spring Cloud
- RabbitMQ

## Running the Project

1. Clone the repository:

```bash
git clone https://github.com/iammahesh123/spring-cloud-demo.git
```
2. Navigate to the project directory:
 ```bash
cd spring-cloud-bus-demo
```
3. Follow the instructions in each service's README file to build and run the services.
## Contributing
Contributions are welcome. Please fork the repository, make your changes, and submit a pull request.
## License

This project is licensed under the MIT License.
   
