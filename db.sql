CREATE TABLE Employees
(
id int NOT NULL PRIMARY KEY,
name varchar(255),
surname varchar(255),
address varchar(255)
);

CREATE SEQUENCE seq_employee
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10