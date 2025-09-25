show databases;

use exDB;

show tables;

drop table users;

-- 테이블 생성 users
create table if not exists users(
	id varchar(50),
	name varchar(100)
);

-- 테이블 결과 확인
select * from users;

-- 테이블에 레코드 추가
insert into users (id, name)
values ("1", "홍길동");



