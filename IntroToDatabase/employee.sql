create database employee;
use employee;

create table department (
	department_id int primary key,
    department_name varchar(100)
);

-- insert into department
-- values
-- (1, 'software'),
-- (2, 'hardware'),
-- (3,'management'),
-- (4,'HR');

create table employee(
	employee_id int primary key,
    employee_name varchar(100),
    salary int,
    department_id int,
    foreign key (department_id) references department(department_id)
);

-- insert into employee
-- values
-- (1,'Akshay',20000,2),
-- (2,'Saif',25000,4),
-- (3,'Varun',10000,2),
-- (4,'Shahrukh',18000,1),
-- (5,'Hritik',20000,1);

select employee_id, employee_name, department_name
from employee left join department on employee.department_id = department.department_id;

select employee_id, employee_name, department_name, salary
from employee left join department on employee.department_id = department.department_id
order by salary desc;

select department_name, avg(salary) as average_salary
from employee right join department on employee.department_id = department.department_id
group by department_name;