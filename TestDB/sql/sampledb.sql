drop database if exists sampledb_taguchi;
create database sampledb_taguchi;
use sampledb_taguchi;

create table sample_table(
No int, name varchar(50),age int, Mail varchar(50));

insert into sample_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample_table values(2,"Sato",39,"yyy@gogle.com");
insert into sample_table values(3,"Harada",44,"zzz@yahoo.co.jp");
