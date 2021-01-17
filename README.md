# Flight Booking System for Airlines (Java Web Application) ✈️ 


<a href="https://github.com/harismuneer"><img alt="views" title="Github views" src="https://komarev.com/ghpvc/?username=harismuneer&style=flat-square" width="125"/></a>
[![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](#)
[![GitHub Forks](https://img.shields.io/github/forks/harismuneer/Flight-Booking-System-JavaServlets_App.svg?style=social&label=Fork&maxAge=2592000)](https://www.github.com/harismuneer/Flight-Booking-System-JavaServlets_App/fork)
[![GitHub Issues](https://img.shields.io/github/issues/harismuneer/Flight-Booking-System-JavaServlets_App.svg?style=flat&label=Issues&maxAge=2592000)](https://www.github.com/harismuneer/Flight-Booking-System-JavaServlets_App/issues)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat&label=Contributions&colorA=red&colorB=black	)](#)


A **fully responsive** web-based Flight Booking System for Turkish Airlines based on the **Model View Controller (MVC) Architecture** made using **Java Servlets**, **Java Server Pages (JSPs)**. Moreover authentication and authorization for users is implemented using Tomcat Roles. The web-application is also secured against **SQL Injection** and **Cross-Site Scripting** attacks.

## Technologies Used

* **Frontend:** HTML, CSS, JavaScript, Jquery, Bootstrap, Java Server Pages (JSPs), AJAX (for a Flight Search Widget)
* **Backend:** Java Servlets, Java Models, Microsoft Access (Database)
* **Webservices:** SOAP Web Services (to get price and number of seats)
* **Security Features:** SQL Injection, Cross-Site Scripting (XSS), Tomcat Roles

## Roles
Following roles are implemented:
* Airline Admin
* Airline Manager
* Customer

## Workflow (Functionalities)

This is for just one airline who wants to sell seats to their customers via internet. 

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

## Interface

#### Home Pages
<p align="middle">
   <img src="../master/Images/main.png" width="400"/>
   <img src="../master/Images/main2.png" width="400"/>
</p>

#### Login Page and Book Flight
<p align="middle">
   <img src="../master/Images/login.png" width="400"/>
   <img src="../master/Images/book.png" width="400"/>
</p>

#### Current Bookings and Itinerary
<p align="middle">
   <img src="../master/Images/current.png" width="400"/>
   <img src="../master/Images/itenary.png" width="400"/>
</p>

#### Seat Features and Approval
<p align="middle">
   <img src="../master/Images/features.png" width="400"/>
   <img src="../master/Images/approve.png" width="400"/>
</p>


## How to Run

1- Install these:
 * [Java SE Development Kit 8 (JDK 8)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 * After installing JDK 8, install [NetBeans IDE](https://netbeans.org/downloads/) with **all** the features including **Tomcat Apache Server.** 

2- Open Netbeans IDE and go to Services > Servers > Apache Tomcat. Right click "Apache Tomcat" and select Properties. Copy the **Catalina Base Path** and open it. Open the "conf" folder and then the "**tomcat-users.xml**" file there. Copy the following lines and paste them in the tomcat-users.xml file before closing tag </tomcat-users>

```
<role rolename="Manager"/>
<role rolename="Admin"/>
<role rolename="Customer"/>

<user username="haris@admin.com" password="a" roles="Admin"/>
<user username="haris@manager.com" password="m" roles="Manager"/>
<user username="shariq@customer.com" password="c" roles="Customer"/>
```

<p align="middle">
   <img src="../master/Images/tomcat.png" width="400"/>
   <img src="../master/Images/tomcat-users-xml.png" width="400"/>
</p>

Morever, open and read the file. Only the users authenticated in this file are allowed to login and use the Booking System. Use above mentioned credentials to login through the Login Page.

3- Restart NetBeans IDE. Click on File -> Open Project and browse to the downloaded folder named "Project". There will be two projects there "Turkish Airlines" and "WSTester" (which is basically a project to test the Web Services). Select both and open them.
Both projects will be loaded. Now first run the Turkish Airlines project, then to test the web services run WSTester project. 



<br>
<hr>
<h1 align="left">Hey there, I'm <a href="https://www.linkedin.com/in/harismuneer/">Haris </a><img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="28"> 
 <a href="https://github.com/harismuneer/Ultimate-Facebook-Scraper"><img align="right" src="https://user-images.githubusercontent.com/30947706/79588950-17515780-80ee-11ea-8f66-e26da49fa052.png" alt="Ultimate Facebook Scraper (UFS)" width="200"/></a> - Maker of Things</h1> 


### Creator of <a href="https://github.com/harismuneer/Ultimate-Facebook-Scraper">Ultimate Facebook Scraper</a> (one of the best software to collect Facebook data for research & analysis) 

<hr>

<h2 align="left">🌐 Connect</h2>
<p align="left">
  <a href="https://www.linkedin.com/in/harismuneer/"><img title="Follow on LinkedIn" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/></a>
  <a href="https://www.facebook.com/harism99"><img title="Connect on Facebook" src="https://img.shields.io/badge/Facebook-1877F2?style=for-the-badge&logo=facebook&logoColor=white"/></a>
  <a href="https://twitter.com/harismuneer99"><img title="Follow on Twitter" src="https://img.shields.io/badge/Twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white"/></a>
  <a href="mailto:haris.muneer5@gmail.com"><img title="Email" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>
  <a href="https://github.com/harismuneer"><img title="Follow on GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/></a>
  <a href="https://www.instagram.com/harismuneer99"><img title="Follow on Instagram" src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white"/></a>
  <a href="https://www.youtube.com/channel/UCZ-uBd7g0E2Bp-0tXtSlSjw?sub_confirmation=1"><img title="Subscribe on YouTube" src="https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white"/></a>
</p>


## 🤝 Consulting / Coaching
Stuck with some problem? Need help in solution development, guidance, training or capacity building? I am a Full Stack Engineer turned Project Manager with years of technical and leadership experience in a diverse range of technologies and domains. Let me know what problem you are facing at <b>haris.muneer5@gmail.com</b> and we can schedule a consultation meeting to help you get through it.

## 👨‍💻 Technical Skills & Expertise

- Development of Web Applications, Mobile Applications, and Desktop Applications
- Development of Machine Learning/Deep Learning models, and deployment 
- Web Scraping, Browser Automation, Python Scripting
<hr>



## ❤️ Support / Donations
If you or your company use any of my projects, like what I’m doing or have benefited from my projects in any way then kindly consider backing my efforts.

For donations, you can follow these simple steps:

<b>1)</b> Free signup at <b>[TransferWise](https://transferwise.com/invite/u/harism95)</b> using this link: https://transferwise.com/invite/u/harism95</li>. (Signing up through this link will save you from any transcation fee on the donation)

<b>2)</b> Select the amount e.g (15$) and choose the receiving/recipient's currency to be PKR. It supports multiple payment options (credit card, debit card, wire transfer etc)

<b>3)</b> Then it will show my info as the recipient, select it. If my name isn't shown, then type my email haris.muneer5@gmail.com in recipients.

<b>4)</b> Choose the reason for transfer to the one that suits you the most (in this case it could be 'General expenses') and in the reference section, you can mention 'Support'
 
If you face any issue in sending donation then feel free to get in touch with me at haris.muneer5@gmail.com 

Thank you for your contribution!



## Author
You can get in touch with me on my LinkedIn Profile: [![LinkedIn Link](https://img.shields.io/badge/Connect-harismuneer-blue.svg?logo=linkedin&longCache=true&style=social&label=Follow)](https://www.linkedin.com/in/harismuneer)

You can also follow my GitHub Profile to stay updated about my latest projects: [![GitHub Follow](https://img.shields.io/badge/Connect-harismuneer-blue.svg?logo=Github&longCache=true&style=social&label=Follow)](https://github.com/harismuneer)

If you liked the repo then kindly support it by giving it a star ⭐ and share in your circles so more people can benefit from the effort.

## Contributions Welcome
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](#)

If you find any bug in the code or have any improvements in mind then feel free to generate a pull request.

## Issues
[![GitHub Issues](https://img.shields.io/github/issues/harismuneer/Flight-Booking-System-JavaServlets_App.svg?style=flat&label=Issues&maxAge=2592000)](https://www.github.com/harismuneer/Flight-Booking-System-JavaServlets_App/issues)

If you face any issue, you can create a new issue in the Issues Tab and I will be glad to help you out.

## License
[![MIT](https://img.shields.io/cocoapods/l/AFNetworking.svg?style=style&label=License&maxAge=2592000)](../master/LICENSE)

Copyright (c) 2018-present, harismuneer                                                        
