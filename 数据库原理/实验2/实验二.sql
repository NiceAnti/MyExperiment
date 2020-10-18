create database XSGL
use XSGL









create schema  s_test authorization dbo;




create table s_test.student(
sno varchar(10) not null primary key,
sname varchar(10) not null,
sex varchar(2),
dept varchar(20) not null
)
select * from s_test.student












drop table s_test.student

create table s_test.course(
cno varchar(3) not null ,
cname varchar(20) not null,
credit int,
pcno varchar(3)
)
select * from s_test.course










drop table s_test.course










create table s_test.sc(
sno varchar(10) not null,
cno varchar(3) not null,
grade int
)
select * from s_test.sc














alter table s_test.student add  籍贯 varchar(20)
alter table s_test.student add 地址 varchar(20)
select * from s_test.student
















alter table s_test.student drop column  地址 
select * from s_test.student




alter table s_test.course alter COLUMN cname varchar(30)
sp_columns course

















alter table s_test.sc drop constraint PK_Sno_Cno


alter table s_test.sc add constraint PK_Sno_Cno primary key(sno,cno)

sp_columns sc


create type cnoDomain from char(10);  --创建自定义域cnoDomain
alter table s_test.course alter column cno cnoDomain;  --将cno改为cnoDomain类型

















create table sc(
sno varchar(20) not null,
cno cnoDomain not null,
grade int 
)

sp_columns sc





create table sc(
sno varchar(10) not null,
cno varchar(3) not null ,
grade int
)



sp_columns sc

drop table sc











alter table sc              
add constraint FK_S foreign key(cno) references s_test.course(cno)   


drop table s_test.student




create table s_test.student(
sno varchar(10) not null primary key,
sname varchar(10) not null,
sex varchar(2),
age int check(age >=0 and age<=30),
dept varchar(20) not null
)

alter table s_test.student              
add constraint CK check(age >=0 and age<=30)   



select * from s_test.student

insert into s_test.student values('200101','王萧虎','男','18','信息院')
insert into s_test.student values('200102','李云钢','女','20','英语系')
insert into s_test.student values('200103','郭敏星','女','18','信息院')
insert into s_test.student values('200104','高灵','女','21','计算机学院')
insert into s_test.student values('200105','王睿','男','19','数学系')
select * from s_test.student


insert into s_test.course values('001','数学','6','')
insert into s_test.course values('002','英语','4','')
insert into s_test.course values('003','高级语言','4','001')
insert into s_test.course values('004','数据结构','4','003')
insert into s_test.course values('005','数据库','3','004')

SELECT * FROM s_test.course




insert into sc values('200101','001','90')
insert into sc values('200102','002','87')
insert into sc values('200101','003','72')
insert into sc values('210101','001','85')
insert into sc values('210101','002','62')
insert into sc values('220101','003','92')
insert into sc values('220101','005','88')
SELECT * FROM SC