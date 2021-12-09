create database siemensdemo;

use siemensdemo;

create table employee(
id int primary key,
name varchar(30),
designation varchar(20),
department varchar(20),
salary int);

insert into employee values(1,'Amit','Manager','HR',150000);
insert into employee values(2,'Bharti','Associate','Sales',35000);
insert into employee values(3,'Charu','Executive','Sales',15000);
insert into employee values(4,'Deepak','Sr. Associate','IT',50000);

commit;

select * from employee;