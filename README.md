# OOP

####Fundamental Principles of Object-oriented programming is based on 4 key principles
* Inheritance <br>
* Abstraction <br>
* Polymorphism <br>
* Encapsulation <br>

###Use Case 

There is a Bank which has provided 4 fields to the customer - Account Number, Customer Name, Balance, Address.

#Encapsulation

###Problem
A new customer has created an account by entering following details - 
<br>Account Number : 100
<br>Customer Name : Ashish
<br>Balance : 20,000
<br>Address : India

Now the customer has moved to USA. So, he has updated his Address to USA
<br>Account Number : 100
<br>Customer Name : Ashish
<br>Balance : 20,000
<br>Address : <strike>India</strike> USA

But wait, in this way he can also update other fields, like balance
<br>Balance : <strike>20,000</strike> 20,00,000 <br>
Or, he may detail an important field, like Account Number
<br><strike>Account Number : 100</strike><br>
which is definately a problem. !!!

###Solution

We make each fields as private
<br><font color="orange"> private </font> Account Number
<br><font color="orange"> private </font>Customer Name 
<br><font color="orange"> private </font>Balance 
<br><font color="orange"> private </font>Address 

Now Customer cannot read, write, update or delete any fields directly.<br>
We also provide them <u>public methods</u> to get or set these fields (called: Gettera and Setter Methods).<br>
Here, we can restrict the customer that which fields they can set or get.<br>
We can also perform other operations with the above fields by creating public methods. 

###Definations

Encapsulation is about hiding the data. <br>
Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.