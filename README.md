# Backend-Engineer-intern-take-home-test

Q1) Write a Java program that take a string input and convert it to an integer without
using the build-in parse function.
Example: input value “123”, convert it to an integer type with value 123

Approach: (StringToIntegerConverter.java)

	-Assuming input values can be positive, negative, null or empty.
	-If the input string is null or empty, program will return 0.
	-Checking index 0: if index 0 is '-', then set negative flag to true and move to index 1 to calculate result,
	else set negative flag to false and caculate result from index 0.
	-calculate result value.
	-If negative flag is true then program will return negative output(result = -result),
	else it will return the result as it is(result).

Unit test: (StringToIntegerConverterTest.java)

  	-Performed unit test for this program with four testcases, and the program passed all the testcases.
	-The test inputs are "1234", "-1234", null, ""(empty string).
	
Time complexity of the program:	O(n)
	
Alternative approch:

   	-We can also convert the input string to an integer using valueOf method.
	
	                          ----------------------------------------
							  
Q2)Write a Java program that take a input and detect whether there’s integer in
there.
Example: input value “45222” return true, input value “This Is A Test4me” return
true, input value “IAMGOOD” return false	
 
Approach: (IsThereInteger.java)

  	-Assuming input string values can be integers, mixture of integers and characters, characters alone, and null.
	-If the input string is null or empty, program will return false.
	-Converting input string to character array to check each character in the character array.
	-Assigning ascii values to all the characters in the array.
	-If ascii value grater than or equal to 48 and less than or equal to 57 , then program will return true.
	-If the ascii value not fall under the above condition then the program will return false.
	 
Unit test: (IsThereIntegerTest.java)

  	-Performed unit test for this program with four testcases, and the program passed all the testcases. 
	-The test inputs are "1234" , "This Is A Test4me" , "IAMGOOD" , and null.

Time complexity of the program:	O(n)
	
Alternative approch:

   	-We can also use Character.isDigit() method to find input contains integer.
	
	                          ----------------------------------------------
							  
Q3)Please design two new tables to store information about:
a. products
b. product price history
The product tables should include the name and category of the product.
The product price history table should refer to the product table and should
include the price information of products and the start date and/or end date for
the product. The current price of a product will have no end date.
Please list the table creation scripts for these two tables and a sample query to
join two tables together.
 
Approach:
    
	-Created products table with product_id, product_name, category columns and product_id as primary key.
	-Created product_price_history table with product_id, price, start_date, end_date, is_active columns and product_id, start_date, is_active as primary key.
	-Assumed a sample problem to write join query: Get the list of products whose current prices are greater than the average price in each category?.
	
                               --------------------------------------------------------	
     
	
	
