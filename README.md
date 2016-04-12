# GroovyGrailsTest
Groovy &amp; Grails Test

You have one week to finish this test. all the code must be in Groovy.

1. Generate a Grails application that allows uploading a file.
 
2. Once the file is loaded, the application must validate and parse each line of file information (plaintext) and then upload the information to the database.
 
The file structure is as follows:
 
x, y, z
 
x is the username id of a user. Its length is 10 characters. They are just numbers, and can have zeros on the left.
Y the amount of coins associated with the user x. must accept only natural numbers.
z is the user name x.
 
The three fields are mandatory and can not be blank.
 
If you find a wrong value when making the validation of each line, stop the process and if the database is modified, returning it to its initial state. Warn the user which line had an error.
 
3. Using this webservice (http://www.webservicex.net/ConvertTemperature.asmx?WSDL), make a calculator to do conversions of temperature. Preferably the results should be displayed asynchronously.
 
4. Write a function that returns an array with three dates Date type. The first date should be the first day of the current month, the second must be the current date and the third time should be 23:59 on the last day of the current month.
