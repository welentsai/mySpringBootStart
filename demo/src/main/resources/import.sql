--
-- SQL 
--

drop table if exists city;
drop table if exists hotel;

create table city (id int primary key auto_increment, name varchar, state varchar, country varchar);
create table hotel (city int, name varchar, address varchar, zip varchar);

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into city (name, state, country) values ('Taipei', 'TPE', 'TW');
insert into city (name, state, country) values ('Shanghai', 'SHH', 'CN');
insert into city (name, state, country) values ('Tokyo', 'TYO', 'JP');

insert into hotel (city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001');
insert into hotel (city, name, address, zip) values (1, 'Conrad Treasury 2', 'William Streets 2', '4002');
insert into hotel (city, name, address, zip) values (2, 'Lamigo', 'Taoyuan', '555');
insert into hotel (city, name, address, zip) values (2, 'Brothers', 'Taichung', '666');
insert into hotel (city, name, address, zip) values (3, 'Taichung City', 'Fengshi Road', '420');
