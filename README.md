# Flight Booking System for Airlines (Java Web Application)

A web-based Flight Booking System for Turkish Airlines based on the Model View Controller (MVC) Architecture made using Java Servlets, Java Server Pages (JSPs). 
This is for just one airline who wants to sell seats to their customers via internet. 

## Roles
Following roles are implemented:
* Airline Admin
* Airline Manager
* Customer

## Workflow (Functionalities)

Following are the steps of work flow:
1.  Airline Admin will set the prices of the seats. There should be three types of seats:
    *    First Class
    *    Business
    *    Economy
2.  The Airline Admin should be able to create and update the features of each type of seat. 
3.   The Airline Admin should be able to set the total number of seats for each flight.
4.   Airline Manager should see a list of seats which the Admin has added or edited when he/she logs in.
5.   Airline Manager then needs to approve the new price or updates.
6.   When the price and update is approved by the manager only then it should be available for the customer to buy.  
7.   The Customer should be able to buy seats based on availability.
8.   When a customer buys a ticket the system should be able to calculate how many seats are left. If all seats are bought the application should not let the customers buy 
more seats. 
9.   The Customer should be able to select the following, to select a seat:
      *    origin and destination cities
      *    dates of travel
      *    number of people traveling
10.   When the customer selects the seat and confirms the booking flight Itinerary should 
be shown to the customer. 
11.   When the customer approves the itinerary the customer should be taken to a payment page where the total price should be shown. When the customer presses 
the pay button consider the transaction done and mark the seat sold. 
12.   Once the seat is sold, send out an email to the customer with the flight itinerary.

## How to Run

1- Install these:
 * [Java SE Development Kit 8 (JDK 8)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 * After installing JDK 8, install [NetBeans IDE](https://netbeans.org/downloads/) with **all** the features including Tomcat Apache Server. 

2- Open NetBeans IDE. Click on File -> Open Project and browse to the downloaded folder named "Project". There will be two projects there "Turkish Airlines" and "WSTester" which is basically a project to test the Web Services. Select both and open them.
Both projects will be loaded. Now first run the Turkish Airlines project, then to test the web services run WSTester project. 
