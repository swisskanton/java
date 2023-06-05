insert into blogger (id, name, age) VALUES (1, 'John Doe', 28);
insert into blogger (id, name, age) VALUES (2, 'Jane Doe', 24);
insert into STORY (id, title,content,posted,blogger_id) values (1, 'Test title','Test content', CURRENT_DATE(), (select id FROM BLOGGER where name = 'John Doe') );
insert into STORY (id, title,content,posted,blogger_id) values (2, 'Test2 title','Test2 content', CURRENT_DATE(), (select id FROM BLOGGER where name = 'John Doe') );
insert into STORY (id, title,content,posted,blogger_id) values (3, 'Jane title', 'Jane content', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Jane Doe') );
insert into STORY (id, title,content,posted,blogger_id) values (4, 'Jane title2','Jane2 content', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Jane Doe') );
insert into STORY (id, title,content,posted,blogger_id) values (5, 'Hi,','Hello content', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Jane Doe') );