--
-- SQL 
--

drop table if exists city;

create table city (id int primary key auto_increment, name varchar, state varchar, country varchar);

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into city (name, state, country) values ('Taipei', 'TPE', 'TW');
insert into city (name, state, country) values ('Shanghai', 'SHH', 'CN');
insert into city (name, state, country) values ('Tokyo', 'TYO', 'JP');
