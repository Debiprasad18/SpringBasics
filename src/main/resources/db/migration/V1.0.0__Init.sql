CREATE TABLE ADDRESS (
  id IDENTITY NOT NULL PRIMARY KEY,
  address_line1  VARCHAR(50) NOT NULL,
  address_line2 VARCHAR(50)
);

CREATE TABLE EMPLOYEE (
  id IDENTITY NOT NULL PRIMARY KEY,
  e_name  VARCHAR(50) NOT NULL,
  manager_id INT,
  address_id INT,
  foreign key (manager_id) references EMPLOYEE(ID),
  foreign key (address_id) references ADDRESS(ID)
);

