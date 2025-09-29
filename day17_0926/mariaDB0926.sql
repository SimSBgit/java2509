show databases;

select * from users;

create table if not exists users(
	id varchar(50),
	name varchar(100)
);

update users set name = "홍철수" where id = "1";

drop table if exists users;

insert into users values("1", "홍길동");

delete from users where id = "1";

delete from users;