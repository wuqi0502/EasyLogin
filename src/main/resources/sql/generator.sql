create table user(
   id bigint primary key auto_increment,
   username varchar(20) unique not null, #用户名唯一性
   password varchar(20) not null,
   del int null
) engine=innodb default charset=utf8;