drop table user;
create table user(
id varchar(99),
name varchar(99),
password varchar(99)
);

drop table studd;
create table studd(
id varchar(99),
uid varchar(99),
pid varchar(99)
);

drop  table caixi;
create table caixi(
id varchar(99),
name varchar(99)
);

drop table shicai;
create table shicai(
id varchar(99),
name varchar(99)
);

drop table zhong;
create table zhong(
pid varchar(99),
cid varchar(99)
);

drop table caipu;
create table caipu(
id varchar(99),
name varchar(99),
cover varchar(99),
xid varchar(99),
gongyi varchar(99),
jianjie varchar(99),
count int(99)
);