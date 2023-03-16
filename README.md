This repository contains a sample web application built with Spring Boot and Thymeleaf. The application allows users to view, add, update, and delete products from a database.

Installation

To install and run the application, follow these steps:

Clone the repository to your local machine.
Open the project in your preferred IDE (such as Eclipse or IntelliJ IDEA).
Import the project as a Maven project.
Update the application.properties file with your database credentials.
Run the application.
bash
Copy code
# example command to run the application
mvn spring-boot:run
Usage

Once the application is running, you can access it by navigating to http://localhost:8080/ in your web browser. From there, you can view, add, update, and delete products.

What I Learned

During the development of this application, I learned how to use the Spring Boot framework to build a web application with CRUD functionality. I also gained experience working with Thymeleaf templates and integrating them with Spring controllers.

My Biggest Challenge

My biggest challenge during the development of this application was configuring the database. I had to troubleshoot several issues related to database connectivity and schema creation before the application was able to successfully connect to the database and create the necessary tables.

Suggestions for Improvement

One way to improve this application would be to add more robust error handling and validation for user input. For example, currently, if a user enters an invalid value for a product field (such as a negative price), the application will throw an error. Adding client-side and server-side validation would improve the user experience and make the application more robust.

Another potential improvement would be to add pagination and search functionality to the product listing page. This would make it easier for users to find the products they are looking for and improve the performance of the application when dealing with a large number of products.
