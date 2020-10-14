update dashboard set writer ='test' where num>=0;
alter table dashboard add foreign key(writer) references user(ID);