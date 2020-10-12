CREATE TABLE dashboard(
`num` INT(20) DEFAULT 1,
`title` VARCHAR(255) NOT NULL,
`writer` VARCHAR(255) NOT NULL,
`date` VARCHAR(255) NOT NULL,
`cnt` int(20) DEFAULT 0,
`rcmd` int(20) default 0,
PRIMARY KEY(`num`)
)engine=InnoDB DEFAULT CHARSET=utf8;
