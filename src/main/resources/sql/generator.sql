/*用户表*/
create table user(
   id bigint primary key auto_increment,
   username varchar(20) unique not null, #用户名唯一性
   password varchar(20) not null,
   del int null
) engine=innodb default charset=utf8;

/*联系信息表*/
create table message(
   id bigint primary key auto_increment,
   name varchar(20) not null,
   email varchar(50) not null,
   subject varchar(100) not null,
   content varchar(1000) not null,
   status int null
) engine=innodb default charset=utf8;