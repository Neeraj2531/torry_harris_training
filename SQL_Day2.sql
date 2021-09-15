create table regions(region_id int unsigned NOT NULL PRIMARY KEY, 
region_name varchar(30));
insert into regions  values(1,'Europe');
insert into regions values(2,'India');
delete from regions where region_id=1;
desc regions;
select * from regions;
create table countries(country_id char NOT NULL Primary key,
 country_name varchar(60),
region_id int unsigned NOT NULL);
insert into countries values(2,'India',2021);
insert into countries values(3,'India',2);
delete from countries where region_id=2;
alter table countries add foreign key(region_id)
references regions(region_id);
alter table countries modify column country_id char(2);
insert into countries values('JP','India',2);
select * from countries; 
create table locations(location_id int unsigned Not null auto_increment primary key,
 street_address varchar(50),postal_code varchar(60),
city varchar(60) Not Null, state_province varchar(60),country_id char(2) Not Null);
insert into locations values(100,'Ashiyana nagar',1900,'Patna','Bihar','JP');
select * from locations;
alter table locations modify column country_id char(2);
alter table locations add foreign key(country_id)
references countries(country_id);
insert into locations values(101,'Baily road',1900,'Patna','Bihar','JP');
delete from locations where location_id=100;
select * from locations;
create table departments(department_id int unsigned NOT NULL primary key,
 department_name varchar(50) NOT NULL, manager_id int unsigned,
location_id int unsigned);
insert into departments values(5,'ECE',1200,101);
delete from departments where location_id=101;
select * from departments;
alter table departments add foreign key(location_id)
references locations(location_id);
create table job(job_id varchar(50) Not Null Primary key,
job_title varchar(50) Not Null,min_salary decimal unsigned,
max_salary decimal unsigned);
insert into job values('AD_VP','Administration vice president',15000,30000);
create table employees(employee_id int unsigned Not Null Primary Key,
first_name varchar(50),last_name varchar(50) Not Null,
email varchar(50) Not Null,phone_number varchar(10),
hire_date date Not Null,job_id varchar(50) Not Null,salary decimal Not Null,
commission_pct decimal,manager_id int unsigned,department_id int unsigned);
create table job_history(employee_id int unsigned Not Null,
start_date date not null,end_date date Not Null,job_id varchar(10) Not Null,
department_id int unsigned Not Null);
insert into employees values(5977,'Neeraj','Kumar','xyz',7808,DATE '2021-08-23','AD_VP',30000,2.0,1200,5);
delete from employees where department_id=5;
select * from employees;
alter table employees add foreign key(job_id)
references job(job_id);
alter table employees add foreign key(department_id)
references departments(department_id);
alter table employees add foreign key(manager_id)
references departments(department_id);
alter table departments add foreign key(manager_id)
references employees(employee_id);
alter table job_history add foreign key(employee_id)
references employees(employee_id);
alter table job_history add foreign key(job_id)
references employees(employee_id);
alter table job_history add foreign key(department_id)
references employees(employee_id);


