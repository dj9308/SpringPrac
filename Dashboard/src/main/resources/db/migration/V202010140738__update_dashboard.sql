ALTER TABLE dashboard ADD `content` varchar(255) not null;
update dashboard SET content = "test" where num>=1;