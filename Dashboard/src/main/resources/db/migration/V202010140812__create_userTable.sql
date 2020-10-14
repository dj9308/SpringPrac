CREATE TABLE user(
	`ID` varchar(50) not null,
    `password` varchar(50) NOT NULL,
    `phone` varchar(60) not null,
    `email` varchar(60) not null,
    primary key(`ID`)
)engine=InnoDB default charset=utf8;

insert into user values('test','testtest12','010-9936-1111','wonder_ful12@naver.com');