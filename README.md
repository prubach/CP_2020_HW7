# CP_2020_HW7 -  GUI Forms - Customer Form

Please work on the implementation of the CustomerData Form.
In particular:

1. Add the implementation of the "New" button - it should clear all text fields including the "customerIDtextField". 
2. Change the implementation of the "Send" button so that it performs "insert or update" - that is, in case the 
"customerIDtextField" is empty it runs bank.newCustomer... or when it is set some value then updates the properties 
(firstName, lastName, email) of the Customer with the ID from that field (customerIDtextField).
3. Upon startup the application should show the Customer with the lowest ID value (0) if such already exists in the bank
structure loaded from the file or empty textfields - just like in the case of pressing the "new" button.  
4. Check and make sure that after your changes the "previous" and "next" buttons work correctly. 

Hint: I have included the generated source code for the CustomerData form, so the startup code should compile and run, 
however, if you'd like to modify the CustomerData form you might need to tell IntelliJ IDEA to directly build your code 
instead of delegating it to Gradle.
To do that go to:  File -> Settings -> Build, Execution, Deployment ->  Build Tools ->  Gradle -> Build and Run using
select "IntelliJ IDEA".
