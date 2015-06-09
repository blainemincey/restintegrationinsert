Camel Router Spring Project
===========================

The purpose of this project is to provide a 
implementation of integration with a REST
web service.

This project takes XML messages, marshals to JSON,
passes the content to a rest based web service which
inserts the contents into a MySQL database.

This requires that the following REST web service 
has been properly installed/deployed and is running
in a JBoss AS 7 or EAP 6 container:
https://github.com/blainemincey/myrestservice.git


To build this project use

    mvn install

To run this project with Maven use

    mvn camel:run

For more help see the Apache Camel documentation

    http://camel.apache.org/
