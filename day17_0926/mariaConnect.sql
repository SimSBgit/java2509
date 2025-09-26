show tables;

select now();

select * from departments;

-- create table users(
-- 	id varchar(50),
--	name varchar(100)
-- );

drop table users;

create table if not exists users(
	id varchar(50),
	name varchar(100)
);