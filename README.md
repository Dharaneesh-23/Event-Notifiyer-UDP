# Event Notifier

Event Notifier is a Java-based event management system that allows users to add, view, and receive notifications for events stored on a server. Users can log in, explore available events, and opt to receive email notifications for events of interest.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Technologies Used](#technologies-used)

## Features

- **Event Management:**
  - Add event details to the server.
  - View a list of available events.

- **User Authentication:**
  - Secure user login functionality.
  - New user registration.

- **Email Notifications:**
  - Receive email notifications for events of interest.

## Getting Started

## Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK)
- MySQL Database
- An SMTP server for email notifications

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/event-notifier.git
   cd event-notifier
   ```
2. **Setup the database:**
    * Create a MySQL database named db_npl_project.
    * Import the provided SQL script to set up the required tables.
    * ```bash
      mysql -u your-username -p db_npl_project < database_script.sql
      ```
3. **Configure the project:**
    * Open Serverframe.java and update the MySQL database connection details.
    * Configure the SMTP server details in the email notification section.

4. **Build and run the project:**
    ```bash
    javac Serverframe.java
    java Serverframe
    ```
## Usage
1. Start the server by running Serverframe.java.
   
2. Access the client application (e.g., client_login.java) to log in and view events.

3. Add events to the server and set preferences for email notifications.

## Configuration
1.Server Configuration
  * MySQL Database:
  Open Serverframe.java and update the following lines with your MySQL connection details:
  ```bash
  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_npl_project?characterEncoding=latin1","your-username","your-password");
 ```
2. SMTP Server for Email Notifications:
  * Update the SMTP server details in the email notification section of Serverframe.java:
    ```bash
    String host = "your-smtp-server.com";
    String port = "your-smtp-port";
    String email = "your-email@example.com";
    String password = "your-email-password";
    ```

## Technologies Used
1. Java Swings
2. MySql
3. UDP protocol
4. SMTP
5. JDBC

