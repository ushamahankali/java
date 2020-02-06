# Credit Card Application
07/24/2019 - 07/30/2019  
Hao Wan

## 07/31/2019 update
run on WebLogic12c
in the command prompt, change directory to the project folder, run 
`mvn clean` and then`mvn package`
1.copy all the dependency files to the lib folder under you domain, eg: `C:\Oracle\Middleware\Oracle_Home\user_projects\domains\domain1\lib`
the dependency files are under the project folder `target\alternateLocation`
2.start Weblogic, set up datasource with JNDI name "jdbc/mysqlDS", install the war file
3.`http://localhost:7001/<your War file name here>`

## Run on Tomcat
Use Maven:  
in the command prompt, change directory to the project folder, then enter  
`mvn tomcat7:run`  
and in a browser, enter `http://localhost:8080` to run the application

## About
This Application allows users to 
- apply for a credit card, 
- activate the credit card, 
- register an account for the card, 
- and log into his or her account to check the card information and personal details.

This application is an assignment on Spring MVC and Spring JDBC. It's also a full stack
application development practice so other technologies are also used. 

## Functionalities
- Application
- Activation
- Registration
- Login

## Technologies and Frameworks used
The whole application is development using Spring framework with Spring MVC.  
- Backend
  - Java
  - Java Servlet and JSP
- Frontend
  - HTML
  - JavaScript and JQuery
  - Bootstrap and Fontawesome
- Database
  - MySQL Database
  - Spring JDBC
- Build tool
  - Maven
- Logging 
  - log4j

## MVC architecture / design pattern
### Controllers or Handlers
In Spring MVC, there is a diapatcher servlet or a front controller to intercept all the requests. It then dispatches the requests to the controllers or handlers to finish certain tasks. For this application, there are many tasks of different kinds, so instead of having only one Controllers, we have multiple ones:
 - HomeController
 - ApplicationController
 - ActivationController
 - RegistrationController
 - LoginController
 - AccountController

### View Part
 under the `webapp` folder:
 - index.jsp (home page)
 - html (all the static pages)
 - resources (js file and static components)
 - WEB-INF
    - web.xml 
    - jsp (all the jsp pages)
       - application
       - registration 
       - activation
       - account
 - images 

### Model Part
- Entity classes
  - Customer (customer personal details other than contact information)
  - CreditCard
  - Contact (contact information of customers: addresss, email...)
  - Application (security question id and security word)
  - Account (username and password)
  - SecurityQuestion (need this to retrieve security question from database instead of hardcoding all the texts in view)

Every entity class has a corresponding DAO class:
- DAO layer
   - CustomerDAO
   - CreditCardDAO
   - ContactDAO
   - ApplicationDAO
   - AccountDAO
   - SecurityQuestionDAO

### Service layer to connect Data and Controllers together
The business logic also goes into service layer.
eg. - criteria to approve a credit card
	- how to generate the card number
	- how to calculate the credit limit
	- how to determine the expiration date
	- etc.

Controllers will call the methods in the service layer to fullfill its task:
- CreditCardService - includes card application and card activation funtionalities
- AccountService - includes account registration functionality
- LoginService - includes login service
  
## Files and Folder Architecture
CreditCardApp
    - readme.txt (documentation)
    - db.sql (database schema)
	- pom.xml (maven build file)
	- src
		- main
			- java
				- com
					- nivtek
						- creditcardapp
							- controller
							- dao
							- entity
							- service
			- resources
				- log4j.properties (log4j configurations)
				- springmvc.xml (Spring MVC and Spring JDBC configurations)
			- webapp 
				- index.jsp
				- html
				- resources 
				- WEB-INF
					- web.xml 
					- jsp 
						- application
						- registration 
						- activation
						- account
				- images  
  

## Database Schema
The schema is exported in the `db.sql` file, it's in the project folder.

database: `creditcard`
tables:
- customers
- contacts
- creditcards
- applications
- security_questions
- accounts

`customers`
- customerId (PRI, auto_increment)
- firsName
- middleName
- lastName
- ssn (UNI)
- birthDate
- annualIncome

`contacts`
- contactId (PRI, auto_increment)
- customerId (FK, refereced from `customers`, cascade on change and delete)
- address
- apt
- city
- state
- zipcode
- phone
- email

`creditcards`
- cardId (PRI, auto_increment)
- customerId (FK, refereced from `customers`, cascade on change and delete)
- cardNo (UNI)
- cvv
- creditLimit
- activationStatus
- approvedDate
- expirationDate

`applications`
- applicationId (PRI, auto_increment)
- customerId (FK, refereced from `customers`, cascade on change and delete)
- questionId (FK, refereced from `security_questions`, cascade on change and delete)
- word

`security_questions` 
- questionId (PRI, auto_increment)
- question

`accounts`
- accountId (PRI, auto_increment)
- cardId (FK, refereced from `creditcards`, cascade on change and delete)
- username (UNI)
- password

## Brief Use Case and Flow
In this application, we suppose one SSN number can only apply for at most one credit card. And one credit card can only have one account regitered.

### Home Page
When user enters the url of the application in a browser or clicks on "Home" link, the home static page will display. 
There is a nav bar, a login box and welcome information on the home page.

### Application
1. When user clicks on "Credit Card" link in the nav bar, the credit card static page will display.
There is a nav bar, a login box and information related to creditcard service on the page.

The information related to creditcard service includes:
- Introduction and picture of the credit card
- "Apply" button linking to the application form (The picture is also clickable and links to the application form)
- Card Activation link
- Account Registration link
	
2. When user clicks "Apply" link on the credit card page, an application form will diaplay. User can fill the application form and submit it.

3. When user sends the application form: 
- If the ssn number already exists in database, user will stay at the stay page and see an ssn duplicate message.
- If the ssn number doesn't exists in database, user will come to the application result page.
    - If the application is not approved, a disapproved page will display.
    - If the application is approved, an approved page will display, with all the details of the new card.

### Activation
1. When user clicks on activation link, an activation form will display. User can fill the activation form and submit it.
	
2. When user sends the activation form:
- If the card number is not valid in database, the user will stay at the same page and see a "card not found" message.
- If the card is already activated, the "card already activated" page will display.
- If the other information couldn't match, the user will stay at the same page and see an "info not match" message.
- If card number valid and card not activated and info matches, a "ready to activate" page will display with an activation confirmation button. User can click on the button to activate the card.

3. When user clicks the activate confirmation button:
- If it fails to activate, a "failed to activate page" will display.
- If activation suceeds, the card will be activated and the user will see a success page. There is "successfully activated" message and a link to account registration on the page.
	

### Registration
1. When user clicks the "Register" link, a registration form will display. User can fill the form and submit.
	
2. When user sends the registration form:
- If the card number is not found, user will stay at the same page and see a "card not found" message.		
- If the card number is found but user information doesn't match, user will stay at the same page and see a "info not match" message.
- If the card number is found but an account for the card is already set up, another page with an "account already set up" message will display.
- If the card number is found and user info matches and no account is set up yet, a username and password set up form will display to the user. User can set up his or her username and password and submit it.

3. When user sends username and password set up form:
- If the username is duplicated, user will stay at the same page and see a "choose a different username" message.
- If the username is not duplicated, the account information will be saved into database:
	- If the account is not sucessfully created in database, user will stay at the same page and see failed message.
	- If the account is successfully created in database a page shows username and "go to login" link will display to the user.
	
### Login
1. When user clicks the "go to login" link, a login page with the login form will display. User can enter his or her username and password and submit.
	
2. When user sends the login username and password:
- If the username and password are not valid, a login failed page will display to the user.
- If the username and password are valid, user will be redirect to the account home page. 
	

### Account	
1. When user is redirected to his or her account homepage, he or she can browse the credit card information and the contact information. There is also a "Personal Details" link on the account home page.	

2. When user clicks on the "personal details" link, a page showing the user's personal details will display.	