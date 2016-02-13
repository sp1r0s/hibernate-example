Create schema if not exists EXAMPLE;
Drop Table if exists EXAMPLE.PERSON;
Create Table EXAMPLE.PERSON (id int, name varchar);
Insert into EXAMPLE.PERSON values (1, 'Spiros');
Insert into EXAMPLE.PERSON values (2, 'Georgios');