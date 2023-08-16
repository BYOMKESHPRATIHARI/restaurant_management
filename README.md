# restaurant_system

# Introduction
In this article, we will build Restaurant Management System Project in Java and MySQL with source code. This project is great for those at an intermediate level in Java who want to advance their coding skills. In this project, the users will be able to perform the following functionalities Login, Add food items, update food, delete food, and generate bills. Let’s get started!


# Setting the development environment
You must have java JDK installed on your system and we are using Eclipse IDE to build this project, you can use either this or Netbeans IDE.

The first step will be to create a new project. Name it as you wish. In the src folder create a restaurantmanagement package. In that package, we will be creating some files for different modules.

To connect the system with the database you will need to follow specific steps.

Have Java JDK already installed and an IDE like Eclipse
Install MySQL on the system.
Download the MySQL connector from here.
In Eclipse, under your project expand external libraries and right-click, and select Open restaurantmanagement Settings. Select the libraries tab and click on the + button. Browse your jar file downloaded from the above step and click on it. This will add a dependency to your project. The steps will differ if you are using a different IDE.


# MySql Setup for Restaurant Management System Project in Java

1. Create a database
-- Creating database
create database restaurant;
2. Select the database
-- Selecting the database
use restaurant;
3. Create a food table
-- Creating food table
create table food (
  id int primary key,
  food_name varchar(25) not null,
  price int not null,
  quantity int 
);
4. Create an admin table
-- Create admin table
create table admin (
login_id varchar(25),
password varchar(25)
);
5. Insert some values in the admin table
-- Inserting value in admin table
insert into admin values
("admin","admin")





