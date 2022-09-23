create sequence IF NOT EXISTS local_seq;

CREATE TABLE IF NOT EXISTS local (id BIGINT NOT NULL, name VARCHAR(255), location VARCHAR(255), total_spaces INTEGER, local_image VARCHAR(5000));

INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Cafe Li', 'Skopje', 1, 'https://scontent.fskp4-2.fna.fbcdn.net/v/t1.18169-1/398634_299758883405447_891389697_n.jpg?stp=c14.14.172.172a_dst-jpg_p200x200&_nc_cat=101&ccb=1-7&_nc_sid=7206a8&_nc_ohc=qggwQVl2qycAX8IlKxb&_nc_ht=scontent.fskp4-2.fna&oh=00_AT9EnoNaHlZsPN5wsBwQm5U2ZCAFrSG9FL_QdBFkBPlIAQ&oe=63535068');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Fitnes House', 'Skopje', 2, 'https://scontent.fskp4-1.fna.fbcdn.net/v/t1.18169-9/21617749_1737408189894843_6362012667891408510_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=yRabkQzS7pAAX-GOuw3&_nc_oc=AQnDqrQOL7rozj4aXfSursLRcqeH28DqfY92pDbiuWCGoXeur--DULGUydziYwCmpWY&_nc_ht=scontent.fskp4-1.fna&oh=00_AT_sPzJlPo0aExEp-IWohcOGkwh1LEzOI6SLlOpfQi2T8w&oe=6353E97A');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Casa', 'Skopje', 2, 'https://scontent.fskp4-1.fna.fbcdn.net/v/t39.30808-6/290706408_2137956849697133_7733351345389563714_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=vcbrhyFRNW4AX-naO8m&_nc_ht=scontent.fskp4-1.fna&oh=00_AT8JiZ7Lmbv3m9pFQKT16ZJ8qXc7aoGwTaI3zImtmbtqaA&oe=6331FCAC');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Tree Kitchen & Bar', 'Skopje', 5, 'https://scontent.fskp4-2.fna.fbcdn.net/v/t39.30808-6/277810376_492875375670671_7279446518063387540_n.png?_nc_cat=110&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=p1YKLYZvlZ0AX9EBNej&_nc_ht=scontent.fskp4-2.fna&oh=00_AT-xCRJ2MfJp13ySodZ-TdqjOGQ3eClkbvuw3TUh4llYIQ&oe=63315F0F');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Vox', 'Skopje', 7, 'https://scontent.fskp4-2.fna.fbcdn.net/v/t1.18169-9/15193410_1784444941808529_1281376634195883977_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=eH84lcuqW14AX_3Yihm&_nc_ht=scontent.fskp4-2.fna&oh=00_AT_awyNMD1WboVCGJz4fXGJvZ6wZbn3SZv4CyA5wU_Bfbg&oe=6353C445');

create sequence IF NOT EXISTS user_seq;

CREATE TABLE IF NOT EXISTS user_table
(id BIGINT NOT NULL,
 name VARCHAR(255),
 sur_name VARCHAR(255),
 user_name VARCHAR(255),
 password VARCHAR(255),
 points DOUBLE,
 is_manager BOOLEAN);

INSERT INTO user_table (id, name, sur_name, user_name, password, points, is_manager) VALUES (nextval('user_seq'), 'Tom', 'Stoic', 'test@user.com', 'Password1-', 10.00, false);
INSERT INTO user_table (id, name, sur_name, user_name, password, points, is_manager) VALUES (nextval('user_seq'), 'Lexi', 'Stevens', 'user@user.com', '123', 20.00, false);

create sequence IF NOT EXISTS table_seq;

CREATE TABLE IF NOT EXISTS table_entity
(id BIGINT NOT NULL,
 id_number INTEGER,
 chair_number INTEGER,
 local_id BIGINT);

INSERT INTO table_entity (id, id_number, chair_number, local_id) VALUES (nextval('table_seq'), 1, 5, 1);
INSERT INTO table_entity (id, id_number, chair_number, local_id) VALUES (nextval('table_seq'), 2, 7, 2);

create sequence IF NOT EXISTS reservation_seq;

CREATE TABLE IF NOT EXISTS reservation (id BIGINT NOT NULL, user_id BIGINT, local_name VARCHAR(255), number_of_tables INTEGER, date_time DATETIME, is_confirmed BOOLEAN);
INSERT INTO reservation (id, user_id, local_name, number_of_tables , date_time, is_confirmed) VALUES (nextval('reservation_seq'), 1, 'Vox',6, now(), false);
INSERT INTO reservation (id, user_id, local_name, number_of_tables, date_time, is_confirmed) VALUES (nextval('reservation_seq'), 2, 'Cube', 9, now(), false);