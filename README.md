# ToDoDemo

To Do Applications : 
It is a web application which can be used by any user to create/delete his task

	•	Design Approach I’ve used the top-down approach to design the system whose main aim is to divide the system into subsystem to get the business requirement. I used this approach because it is a small applications and other methodology like Bottom-up approach is usually useful in   big system where we have many component to work together to achieve the business requirement..Cuurently, it is a monolithic system which is having both authorisation and task API in one which can be separated in future.
	•	I have used the design pattern MVC to separate the presentation layer from business logic.
	•	I’ve used  spring framework which provides lots of feature to develop a secure web application.

	•	If I have given more time then I would do the following :

	•	Divide it in two api as login and todo .
	•	Improve the logging  and add logback.xml file for formatting.
	•	Apply spring jwt spring  or ACL security , currently it is roles based security only.
	•	Integrate dto to enity mapper as to use only dto for data transfer and manipulation.
	•	Improve the UI and separate it from the application.
	•	Implement the reactive framework to improve the performance.
	•	Implement more validation on UI part .

Application Overview- should know.
	tech: Java 8, springboot v-2.3.3 and h2 database
	•	implement the role based spring security.
	•	Default username & password test and pwd123.
	•	After successful login ,you can add the task and delete it.
	•	Currently there is no task available .
	•	You can logout and login again to see the task in system.
	•	If server get shut down  ,it will recreate the db again as per *.sql file ,I didn’t create the back file so far.


 
