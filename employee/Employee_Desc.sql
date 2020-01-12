SELECT * FROM peyal.emp_desc;


CREATE TABLE emp_Desc (
    First_Name VARCHAR(100),
    Last_Name VARCHAR(100),
    id INT,
    Designation VARCHAR(50),
    Joined_date DATE,
    Salary INT
);

use peyal
/
insert into peyal.emp_Desc values
('Mohana Badri',
'Kumaragurubaran',1,
'Developer',
'2020-01-06',
45000);

insert into peyal.emp_Desc values
('Vinoth Kumar',
'Rajasekaran',2,
'CRM',
'2018-01-06',
25000);

commit;